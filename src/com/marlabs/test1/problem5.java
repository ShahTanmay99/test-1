package com.marlabs.test1;

public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = { 100, 10, 20, 15, 2, 23, 90, 67, 200 };
		findPeak(inputArray);
	}

	private static void findPeak(int[] inputArray) {
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (i == 0 || i == inputArray.length-1)
				if(i == 0 && inputArray[i] > inputArray[i + 1]) {
				System.out.println("Peak element is " + inputArray[i]);
				continue;
				else
			}

			if (inputArray[i] > inputArray[i + 1] && inputArray[i] > inputArray[i - 1]) {
				System.out.println("Peak element is " + inputArray[i]);
				continue;
			}
			if (i == inputArray.length - 1 && inputArray[i] > inputArray[i - 1]) {
				System.out.println("Peak element is " + inputArray[i]);
				continue;
			}

		}
	}

}
