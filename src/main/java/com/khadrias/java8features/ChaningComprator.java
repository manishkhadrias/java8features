package com.khadrias.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author manishkhadria
 *
 */
public class ChaningComprator {

	public static void main(String[] args) {

		User manish = new User("Manish", 40);
		User hitu = new User("Hitu", 25);
		User raju = new User("Raju", 22);
		User mikky = new User("Mikky", 36);
		User mikky1 = new User("Mikky", 35);

		List<User> users = Arrays.asList(manish, hitu, raju, mikky, mikky1);

//		List<User> users = List.of(manish, hitu, raju, mikky);

		Comparator<User> comparatorName = Comparator.comparing(u -> u.getName());
		Comparator<User> comparatorAge = Comparator.comparing(u -> u.getAge());
		Comparator<User> nameThenAge = comparatorName.thenComparing(comparatorAge);
		Comparator<User> reversed = nameThenAge.reversed();
		users.sort(reversed);
		users.forEach(u -> System.out.println(u));
	}

}
