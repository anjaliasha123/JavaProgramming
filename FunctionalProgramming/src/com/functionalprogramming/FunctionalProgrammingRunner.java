package com.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple","Banana","Mangoe");
		
		printList(list);

	}

	private static void printList(List<String> list) {
		for(String item:list) {
			System.out.println(item);
		}
	}

}
