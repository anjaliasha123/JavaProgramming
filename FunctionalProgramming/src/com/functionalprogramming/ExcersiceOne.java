package com.functionalprogramming;

import java.util.List;

public class ExcersiceOne {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,11,34,54,12,6);
		printNumFP(list);
		
	}
	private static void printNumFP(List<Integer> list) {
		list.stream().forEach(
				num -> System.out.println(num)
				);
	}


}
