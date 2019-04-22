package com.dailyCodingProblem;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] numbers = {10,15,3,7};
		int k = scan.nextInt();
		scan.close();
		
		System.out.println(check(numbers, k));
		
		
		
		
		
	}

	private static boolean check(int[] numbers, int k) {
		// TODO Auto-generated method stub

		for(int i=0; i<numbers.length; i++) {
			for(int j=i; j<numbers.length; j++) {
				if(numbers[i]+numbers[j]==k) return true;
			}
				
		}
		return false;
	}
	
	
	
}
