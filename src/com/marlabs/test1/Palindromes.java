package com.marlabs.test1;

public class Palindromes {

	public static void main(String[] args) {
		for (int i = 101; i < 1000; i++) {
			if (i / 100 == i % 10) {
				System.out.println(i + " is Palindrome");
			}
		}
	}
}
