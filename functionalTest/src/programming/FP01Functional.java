package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//printAllNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
		//printOddNumbersInListFunctional(numbers);
		//printAllCoursesInListFunctional(courses);
		//printSpringCoursesInListFunctional(courses);
		//print4lettersCoursesInListFunctional(courses);
		//printSquaresOfEvenNumbersInListFunctional(numbers);
		printCubesOfEvenNumbersInListFunctional(numbers);
		
		List<String> courses = List.of(
				"Spring", "Spring boot","API","Micro","AWS","PCF",
				"Azure","Docker","Kubernetes");
		
//		courses.stream()
//		.filter(course -> course.length() >= 4)
//		.forEach(System.out::println);
		
		courses.stream()
			.map(course -> course.length())
			.forEach(System.out::println);
	}
	
//	private static boolean isEven(int number) {
//		return number%2 == 0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
			.forEach(System.out::println);
		
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
			//.filter(FP01Functional::isEven)
			.filter(number -> number % 2 == 0)
			.forEach(System.out::println);
	}
	
	// no1
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
			.filter(number -> number % 2 == 1)
			.forEach(System.out::println);
	}
	
	//no2
	private static void printAllCoursesInListFunctional(List<String> courses) {
		
		courses.stream()
			//.filter(c -> c % 2 == 1)
			.forEach(System.out::println);
	}
	
	//no3
	private static void printSpringCoursesInListFunctional(List<String> courses) {
		
		courses.stream()
			.filter(c -> c.contains("Spring"))
			.forEach(System.out::println);
	}
	
	//no4
	private static void print4lettersCoursesInListFunctional(List<String> courses) {
		
		courses.stream()
			.filter(c -> c.length() >= 4)
			.forEach(System.out::println);
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number)
		.forEach(System.out::println);
	}
	
	private static void printCubesOfEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
		.filter(number -> number % 2 != 0)
		.map(number -> number * number * number)
		.forEach(System.out::println);
	}
}
