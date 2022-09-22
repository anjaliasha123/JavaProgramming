package com.functionalprogramming;

import java.util.stream.IntStream;

public class ExcerciseTwo {

	public static void main(String[] args) {
		numListSq();

	}
	//IntStream is used to generate stream of values
	private static void numListSq() {
		IntStream.range(1, 11)
		.map(
				e -> e*e
				)
		.forEach(
				num -> System.out.println(num)
				);
	}

}
