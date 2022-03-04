package com.khadrias.java8features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreams {

	public static void main(String[] args) {
		int[] numbers = { 4, 52, 66, 76, 3, 2, 0 };
		OptionalInt min = IntStream.of(numbers).min();
		System.out.println(min.isPresent() ? min.getAsInt() : "xxx");

		OptionalInt max = IntStream.of(numbers).max();
		System.out.println(max.isPresent() ? max.getAsInt() : "xxx");

		OptionalDouble average = IntStream.of(numbers).average();
		System.out.println(average.isPresent() ? average.getAsDouble() : "xxx");

		long count = IntStream.of(numbers).count();
		System.out.println(count);

		int sum = IntStream.of(numbers).sum();
		System.out.println(sum);

		IntSummaryStatistics summaryStatistics = IntStream.of(numbers).summaryStatistics();
		System.out.println("IntSummaryStatistics");
		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getCount());
		System.out.println(summaryStatistics.getAverage());
		System.out.println(summaryStatistics.getSum());

		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);

		List<Integer> collect2 = IntStream.of(numbers).distinct().sorted().limit(3).boxed()
				.collect(Collectors.toList());
		System.out.println(collect2);

		List<int[]> collect = Arrays.asList(numbers).stream().distinct().sorted().limit(3).collect(Collectors.toList());
		collect.forEach(System.out::println);

		List<Integer> list = Arrays.asList(4, 52, 66, 76, 3, 2, 0);
		list = list.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
