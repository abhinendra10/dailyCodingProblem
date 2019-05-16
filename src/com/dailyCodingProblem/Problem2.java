package com.dailyCodingProblem;

public class Problem2 {

	public static void main(String[] args) {

		int[] numbers = { 1,2,3,4,5};

		find(numbers);
//		find(numbers, numbers.length);
	}

	private static void find(int[] numbers, int length) {

		int[] resultArray = new int[numbers.length];
		
		int product = 1;
		for (int i = 0; i < numbers.length; i++) {
			product *= numbers[i];
		}
		System.out.println(product);
		
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

		for (int e : resultArray)
			System.out.printf("%d ", e);
	}

}
