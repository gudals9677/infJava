package programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalTest {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple","banana","mango");
		
		Predicate<? super String> predicate = fruit -> fruit.startsWith("b");
		
		Optional<String> optFruit = fruits.stream()
				.filter(predicate).findAny();
		
		System.out.println(optFruit);
		System.out.println(optFruit.isEmpty());
		System.out.println(optFruit.isPresent());
		System.out.println(optFruit.get());
		
		Optional<String> fruit = Optional.of("banana");
		Optional<String> empty = Optional.empty();
	}
}
