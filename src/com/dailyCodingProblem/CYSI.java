package com.dailyCodingProblem;

import java.util.Arrays;
import java.util.Scanner;

public class CYSI {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		int n = 0;
		int[] A = null;

		for (int i = 0; i < T; i++) {
			n = scan.nextInt();
			A = new int[n];
			for (int j = 0; j < n; j++) {
				A[j] = scan.nextInt();
			}
			findMaxValue(A);
		}

	}

	private static void findMaxValue(int[] a1) {
		// TODO Auto-generated method stub
		int len = a1.length;
		int[] maxArray = new int[len];
		int formulaResult = 0;
		for (int i = 0; i < len; i++) {
			for (int j = len - 1; j >= 0; j--) {
				formulaResult = Math.abs(a1[i] - a1[j]) + Math.abs(i - j);
			}
			maxArray[i] = formulaResult;
		}

		Arrays.sort(maxArray);

		System.out.println(maxArray[len - 1]);

		// 1 2 3 1 ===================== |1-3| + |0-3| = 2+3=5 ||||||||||||||
		// |1-3|+|0-2| = 2+2=4

	}

}