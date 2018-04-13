package com.marlabs.test1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class problem6 {

	public static void main(String[] args) {
		// ort an ArrayList containing Integers and remove all the duplicates.
		// Example: Input [20, 12, 15, 14, 8,10, 11, 25, 12, 14, 10] Output [8,
		// 10, 11, 12, 14, 15, 20, 25]

		Integer[] inputArray = { 20, 12, 15, 14, 8, 10, 11, 25, 12, 14, 10 };
		removeDuplicatesAndSort(inputArray);
	}

	private static void removeDuplicatesAndSort(Integer[] inputArray) {

		Set<Integer> s = new TreeSet<Integer>(Arrays.asList(inputArray));
		System.out.println(s);

	}

}
