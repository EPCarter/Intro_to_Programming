/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 2-13
Date: .  2018
Summary: (Financial application: compound value) Suppose you save $100 each month 
					into a savings account with the annual interest rate 5%. Thus, the monthly 
					interest rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes

								100 * (1 + 0.00417) = 100.417

						After the second month, the value in the account becomes

								(100 + 100.417) * (1 + 0.00417) = 201.252

						After the third month, the value in the account becomes

								(100 + 201.252) * (1 + 0.00417) = 302.507

						 and so on.

					Write a program that prompts the user to enter a monthly saving amount and 
					displays the account value after the sixth month. (In Exercise 5.30, you will 
					use a loop to simplify the code and display the account value for any month.)
*/


					


import java.util.Scanner;

class twoThirteen {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);		
		
		System.out.print("Enter monthly saved: ");		
		float monthlyMoney = reader.nextFloat();	
		float monthlyInterestRate = 0.05f/12f;
		float accountValue = 0;
		float interest = 0;
		int month = 0;
	
	while(month < 7){
		accountValue += monthlyMoney;
		interest = monthlyInterestRate * accountValue;
		accountValue += interest;
		month++;
		//System.out.println(accountValue);
		}				
		
	System.out.println("Account Value after 6mo: $" + accountValue);	
	}
	
}
