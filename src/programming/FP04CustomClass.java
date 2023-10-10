package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudent;

	public Course(String name, String category, int reviewScore, int noOfStudent) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudent = noOfStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}

	@Override
	public String toString() {
		return name + ":" + noOfStudent + ":" + reviewScore;
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 2000),
				new Course("Spring Boot", "Framework", 95, 22000), new Course("API", "Microservices", 97, 12000),
				new Course("Microservices", "Microservices", 96, 18000), new Course("AWS", "Cloud", 92, 2000),
				new Course("FullStack", "FullStack", 91, 5000), new Course("GCP", "Cloud", 94, 7000),
				new Course("Docker", "Cloud", 93, 3000));
		// allMatch, noneMatch, anyMatch
		Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
		Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
		Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan90Predicate));
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));

		Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparing(Course::getNoOfStudent);
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));

		Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparing(Course::getNoOfStudent).reversed();
		System.out.println(courses.stream().sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));

		Comparator<Course> comparingByNoOfStudentsAndNumberOfReview = Comparator.comparing(Course::getNoOfStudent)
				.thenComparing(Course::getReviewScore).reversed();
		System.out.println(
				courses.stream().sorted(comparingByNoOfStudentsAndNumberOfReview).collect(Collectors.toList()));

		System.out.println(courses);

		System.out.println(
				courses.stream().takeWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList()));

		System.out.println(courses.stream().max(comparingByNoOfStudentsAndNumberOfReview));

		System.out.println(courses.stream().min(comparingByNoOfStudentsAndNumberOfReview));

	}

}
