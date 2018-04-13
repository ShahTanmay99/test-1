package com.marlabs.test1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class problem1 {

	static String regeex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
			+ "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] addresses = input.split(" ");
		String first = addresses[0];
		// System.out.println(first);
		String last = addresses[1];
		String check = addresses[2];
		System.out.println(validate(addresses));
		inValid(first, last, check);
		inRange(first, last, check);
	}

	public static boolean validate(final String[] ip) {
		for (int i = 0; i < ip.length; i++) {
			Pattern pattern = Pattern.compile(regeex);
			Matcher matcher = pattern.matcher(ip[i]);
			if (!matcher.matches())
				return false;
		}
		return true;
	}

	private static void inRange(String first, String last, String check) {
		splitip(first, last, check);
	}

	private static void splitip(String first, String last, String check) {
		// String[] firstIp = first.split(.);
		// System.out.println(firstIp[0]);
	}

	private static void inValid(String first, String last, String check) {

	}

}
