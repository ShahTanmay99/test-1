package com.marlabs.test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] votes = s.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = 1;
		for (String str : votes) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, count);
			}
		}
		int maxVotes = map.values().stream().mapToInt(i -> i).max().getAsInt();
		System.out.println(maxVotes);
		// map.get(key)
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxVotes) {
				String[] names = entry.getKey();
			}
		}

	}
}
