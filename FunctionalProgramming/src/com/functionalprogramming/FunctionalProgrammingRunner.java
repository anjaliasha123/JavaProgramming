package com.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple","Banana"
				,"Mangoe","Cat","Mat","Suzan");
		
//		printList(list);
		printListWithFiltering(list);

	}

	private static void printList(List<String> list) {
		for(String item:list) {
			System.out.println(item);
		}
	}
	
	//creating a static method
	//we are sending function to each element 
	//of the stream to be executed
	private static void printListFP(List<String> list) {
		list.stream().forEach(
				element -> System.out.println(element)
				);
	}
	
	private static void printListWithFiltering(List<String> list) {
		list.stream()
		.filter(
				elem -> elem.endsWith("at")
				)
		.forEach(
				elem -> System.out.println(elem)
				);
	}

}
