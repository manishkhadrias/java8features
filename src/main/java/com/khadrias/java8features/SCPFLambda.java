package com.khadrias.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SCPFLambda {

	public static void main(String[] args) {
//		Supplier<String> supplier = () -> "Hello Supplier";
		Supplier<String> supplier = () -> {
			System.out.print("inside ");
			return "Hello Supplier";
		};
		String getSupply = supplier.get();

		System.out.println(getSupply);

		Consumer<String> consumer = s -> {
			System.out.print("inside ");
			System.out.println(s);
		};
		consumer.accept("Hello Consumer");

		List<String> str = new ArrayList<>(List.of("one", "two", "three", "four", "five"));
//		Predicate<String> filter = s -> !s.startsWith("t");
//		str.removeIf(filter);
//		Consumer<String> action = s -> System.out.println(s);
//		str.forEach(action );

		str.removeIf(s -> !s.startsWith("t"));
		str.forEach(s -> System.out.println(s));

		User manish = new User("Manish");
		User hitu = new User("Hitu");
		User raju = new User("Raju");
		User mikky = new User("Mikky");

		List<User> users = List.of(manish, hitu, raju, mikky);
		List<String> names = new ArrayList<>();
		Function<User, String> toName = u -> u.getName();
		for (User user : users) {
			names.add(toName.apply(user));
		}

		System.out.println("Users List : ");
		users.forEach(u -> System.out.println(u));

		System.out.println("Names List : ");
		names.forEach(s -> System.out.println(s));

		Comparator<Integer> comp = (o1, o2) -> Integer.compare(o1, o2);
		int compared = comp.compare(10, 20);
		System.out.println("Compared :" + compared);

		IntSupplier supplier2 = () -> 10;
		System.out.println("i: " + supplier2.getAsInt());

		DoubleToIntFunction doubleToIntFunction = v -> (int) Math.floor(v);
		System.out.println("PI: " + doubleToIntFunction.applyAsInt(Math.PI));
	}

}
