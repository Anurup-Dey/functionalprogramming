package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterface {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t % 2 == 0;
			}

		};
		Function<Integer, Integer> squareFunction = x -> x * x;
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * t;
			}

		};
		Consumer<Integer> sysoutConsumer = System.out::println;
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}

		};
		numbers.stream().filter(isEvenPredicate2).map(squareFunction2).forEach(sysoutConsumer2);
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		int sum = numbers.stream().reduce(0, sumBinaryOperator);

		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}

		};
		System.out.println(sum);
	}

}
