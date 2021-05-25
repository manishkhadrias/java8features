package com.khadrias.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class ChaningLambda {

	public static void main(String[] args) {

		Consumer<String> consumer1 = s -> System.out.println("Cosumer1 consumes: " + s);
		Consumer<String> consumer2 = s -> System.out.println("Cosumer2 consumes: " + s);
		Consumer<String> consumer3 = s -> {
			consumer1.accept(s);
			consumer2.accept(s);
		};
		consumer3.accept("Hello");
		Consumer<String> consumer4 = consumer1.andThen(consumer2);
		consumer4.accept("Hello");

		Predicate<String> isNull = s -> s == null;
		System.out.println("For Null: " + isNull.test(null));
		System.out.println("For Hello: " + isNull.test("Hello"));

		Predicate<String> isEmpty = s -> s.isEmpty();
		System.out.println("For Empty: " + isEmpty.test(""));
		System.out.println("For Hello: " + isEmpty.test("Hello"));

		Predicate<String> predicate = isNull.negate().and(isEmpty.negate());
		System.out.println("For Null: " + predicate.test(null));
		System.out.println("For Empty: " + predicate.test(""));
		System.out.println("For Hello: " + predicate.test("Hello"));

		List<String> str = Arrays.asList("one", "two", "three", "four", "five", "six", "seven");
		Comparator<String> comp = (s1, s2) -> s1.compareTo(s2);
		str.sort(comp);
		str.forEach(s -> System.out.println(s));
		System.out.println(str);

//		Function<String, Integer> toLength = s -> s.length();
		ToIntFunction<String> toLength = s -> s.length();
		Comparator<String> comparator = Comparator.comparingInt(toLength);
		str.sort(comparator);
		System.out.println(str);

		Comparator<String> comp1 = (s1, s2) -> Integer.compare(s1.length(), s2.length());
		str.sort(comp1);
		System.out.println(str);

	}

}
