package programming;

import java.util.List;

public class FP03MethodReference {
	
	public static void print(String str) {
		System.out.println(str);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Dockers",
				"Kubernets", "Spring MVC");

		courses.stream().map(str -> str.toUpperCase()).forEach(FP03MethodReference::print);
	}

}
