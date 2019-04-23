package com.dailyCodingProblem;

public class Problem2 {

	public static void main(String[] args) {

		int[] numbers = { 3,2,1 };

		find(numbers);
	}

	private static void find(int[] numbers) {

		int[] resultArray = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			int product = 1;
			for (int j = 0; j < numbers.length; j++) {
				if (i == j)
					continue;
				else {
					product *= numbers[j];
				}
				resultArray[i] = product;
			}
		}

		for(int e:resultArray)System.out.println(e);
	}

}
