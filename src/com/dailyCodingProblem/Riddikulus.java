package com.dailyCodingProblem;

import java.util.Scanner;

public class Riddikulus {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int d = scan.nextInt();
		int[] ar = new int[n];

		for (int i = 0; i < n; i++) {
			ar[i] = scan.nextInt();
		}

		findRiddikulus(ar, d);

	}

	private static void findRiddikulus(int[] ar, int r) {
		// TODO Auto-generated method stub
		int len = ar.length;
		int[] resultArray = new int[len];
		int iter = 0;
/*
		if (r > len) {
			r -= len;
		}*/

//		else
		
			if (r <= len) {
			for (int i = r; i < len; i++) {
				resultArray[iter] = ar[i];
				iter++;
			}

			for (int i = 0; i < r; i++) {
				resultArray[iter] = ar[i];
				iter++;
			}
		}

		// 20 10
		// 41 73 89 7 10 1 59 58 84 77 77 97 58 1 86 58 26 10 86 51

		for (int i : resultArray)
			System.out.print(i + " ");

	}

}
