package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01Exercises {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Dockers",
				"Kubernets", "Spring MVC");
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		// courses.stream().forEach(System.out::println);

		// courses.stream().filter(course ->
		// course.contains("Spring")).forEach(System.out::println);

		// courses.stream().filter(course -> course.length() >=
		// 4).forEach(System.out::println);

		//courses.stream().map(course -> course + " " + course.length()).forEach(System.out::println);
		
		//numbers.stream().map(x -> x*x).reduce(0, Integer::sum);
		//numbers.stream(305745).map(x -> x*x*x).reduce(0, Integer::sum);
		//numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum);
		//numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum);
		//numbers.stream().distinct().forEach(System.out::println);
		//numbers.stream().distinct().forEach(System.out::println);
		//numbers.stream().sorted().forEach(System.out::println);
		//numbers.stream().distinct().sorted().forEach(System.out::println);
		//courses.stream().sorted().forEach(System.out::println);
		//courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		//courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
		//courses.stream().map(x -> x.length()).collect(Collectors.toList()).forEach(System.out::println);

	}

}
