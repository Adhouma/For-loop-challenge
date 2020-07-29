package com.learnJava;

public class Main {
	/**
	 * Use the for statement call the calculateInterest method with
	 * the amount of 10 000 with an interestRate of 2, 3, 4, 5, 6, 7 and 8
	 * and print the result to the console 
	 * 
	 * BONUS:
	 * Change the for loop to do the same thing as shown start from 8% back to 2%
	 */
	public static void main(String[] args) {
		//System.out.println("/*--- Solution ---*/");
		for(int i = 2; i < 9; i++) {
			System.out.println("10,000 at " + i + "% interst = " + String.format("%.2f", calculateInterest(10_000.0, i)));
		}
		
		System.out.println("/*--- Bonus ---*/");
		for(int j = 8; j > 1; j--) {
			System.out.println("10,000 at " + j + "% interst = " + String.format("%.2f", calculateInterest(10_000.0, j)));
		}
	}	
	
	/**
	 * calculateInterest method
	 */
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate /100));
	}

}
