package com.functionalprogramming;

import java.util.List;

public class ExcersiceOne {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,11,34,54,12,6);
//		printNumFP(list);
//		printSumReduced(list);
		printSortedList(list);
		
	}
	private static void printNumFP(List<Integer> list) {
		list.stream().forEach(
				num -> System.out.println(num)
				);
	}
	private static void printSumReduced(List<Integer> list) {
		int s = list.stream()
		.reduce( 
				0,
				(num1, num2) -> num1 + num2
				);
		System.out.println(s);
		}
	
	private static void printSortedList(List<Integer> list) {
		list.stream()
		.sorted()
		.forEach(
				elem -> System.out.println(elem)
				);
	}


}
