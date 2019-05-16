package com.dailyCodingProblem;

import java.awt.List;
import java.util.ArrayList;

public class BonAppetitProblem {

	public static void main(String[] args) {
		ArrayList<Integer> billList = new ArrayList<Integer>();
		billList.add(3);
		billList.add(10);
		billList.add(2);
		billList.add(9);

		String s = "UDDDUDUU";
		
		
		
		int[] bill = { 3, 10, 2, 9 };
		int k = 1, b = 12;

		// bonAppetit(bill,k,b);
		bA(billList, k, b);
		bonAppetit(billList, k, b);
		countingValley(s);
		
	}

	private static void countingValley(String s) {
		// TODO Auto-generated method stub
		int len = s.length();
		int lvl=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='U') ++lvl;
			else if(s.charAt(i)=='D') --lvl;
			
		}
		if(lvl==0)System.out.println(1);
	}

	private static void bonAppetit(ArrayList<Integer> billList, int k, int b) {
		// TODO Auto-generated method stub
		int sum=0;
		int numberToIgnore = billList.get(k);
		int perheadCharge=0;
		for ( int e:billList) {
			if(e==numberToIgnore) {
				break;
			}
			else 	sum+=e;
		}
		perheadCharge = sum/2;
		if(perheadCharge==perheadCharge) { System.out.println("bon appetit");}
		else {System.out.println(b-perheadCharge);}
//		System.out.println(sum);
		
	}

	private static void bA(ArrayList<Integer> billList, int k, int b) {
		int sum = 0;
		int perHeadCharge = 0;
		billList.remove(k);
		for (int i : billList) {
			sum += i;
		}
		perHeadCharge = sum / 2;
		if (b - perHeadCharge == 0)
			System.out.println("bon appetit");
		else
			System.out.println(b - perHeadCharge);

	}

	private static void bonAppetit(int[] bill, int k, int b) {
		int sum = 0;
		int perHeadCharge = 0;
		for (int i = 0; i < bill.length; i++) {
			if (i != k)
				sum += bill[i];
		}
		perHeadCharge = sum / 2;
		if (b - perHeadCharge == 0)
			System.out.println("bon appetit");
		else
			System.out.println(b - perHeadCharge);
	}

}
