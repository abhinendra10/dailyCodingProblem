package com.dailyCodingProblem;

import java.util.HashSet;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] numbers = { 10, 15, 3, 7 };
		int k = scan.nextInt();
		scan.close();

		// System.out.println(check(numbers, k));
		System.out.println(checkUsingHash(numbers, k));

	}

	private static boolean check(int[] numbers, int k) {
		// TODO Auto-generated method stub

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == k)
					return true;
			}

		}

		return false;
	}

	private static boolean checkUsingHash(int[] numbers, int k) {

		HashSet<Integer> hashset = new HashSet<Integer>();
		
		int sum=0;
		
		for(int n:numbers) {
			
		}

		for (int n : numbers) {
			if (!hashset.contains(n))
				hashset.add(n);
		}

		for (int n : numbers) {
			if (!hashset.contains(k))
				return true;
		}

		return false;
	}

}
