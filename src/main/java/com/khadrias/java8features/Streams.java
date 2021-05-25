package com.khadrias.java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {

	public static void countFrequencies(List<Integer> ints) {

		// get unique values
		Set<Integer> st = new HashSet<Integer>(ints);
		for (Integer s : st)
			System.out.println("count Frequencies By Collections.frequency of given no" + s + ": "
					+ Collections.frequency(ints, s));
	}

	public static void main(String[] args) {

		List<Integer> ints = Arrays.asList(10, 20, 20, 20, 10, 40, 50);

		countFrequencies(ints);

		Long frequencyCount = ints.stream().filter(e -> 20 == e).count();
		System.out.println("frequencyCount of 20: " + frequencyCount);

		Map<Integer, Long> frequencyCountMap = ints.stream()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		
//		Map<Integer, Long> frequencyMap = ints.stream()
//		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Map.Entry<Integer, Long> entry : frequencyCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	/*
	 * {@code // Accumulate names into a List List<String> list = people.stream()
	 * .map(Person::getName) .collect(Collectors.toList());
	 *
	 * // Accumulate names into a TreeSet Set<String> set = people.stream()
	 * .map(Person::getName) .collect(Collectors.toCollection(TreeSet::new));
	 *
	 * // Convert elements to strings and concatenate them, separated by commas
	 * String joined = things.stream() .map(Object::toString)
	 * .collect(Collectors.joining(", "));
	 *
	 * // Compute sum of salaries of employee int total = employees.stream()
	 * .collect(Collectors.summingInt(Employee::getSalary));
	 *
	 * // Group employees by department Map<Department, List<Employee>> byDept =
	 * employees.stream() .collect(Collectors.groupingBy(Employee::getDepartment));
	 *
	 * // Compute sum of salaries by department Map<Department, Integer> totalByDept
	 * = employees.stream() .collect(Collectors.groupingBy(Employee::getDepartment,
	 * Collectors.summingInt(Employee::getSalary)));
	 *
	 * // Partition students into passing and failing Map<Boolean, List<Student>>
	 * passingFailing = students.stream() .collect(Collectors.partitioningBy(s ->
	 * s.getGrade() >= PASS_THRESHOLD));
	 *
	 * }
	 */

}
