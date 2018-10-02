/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 7-15
Date: .  2018
Summary: (Eliminate duplicates) Write a method that returns a 
          new array by eliminating the duplicate values in the 
          array using the following method header:
          
              public static int[] eliminateDuplicates(int[] list)
              
          Write a test program that reads in ten integers, invokes 
          the method, and displays the result.

          (Hint: Use a for loop to read in the 10 values from the user. 
          Create a method for eliminating the duplicates which accepts 
          the user's array as a parameter. In the method, create a new 
          array for storing the non-duplicates with the same size as 
          the user's array.)
*/

import java.util.*;

class SevenFifteen {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int[] numberArray = new int[11];
		int[] numberArrayPrint = new int[numberArray.length];
		int number = 1;
		while (number <= 10) {
			System.out.print("Enter number " + number + ": ");
			int input = reader.nextInt();
			numberArray[number] = input;
			number++;
		}
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (numberArray[i] == numberArray[j] && i != j) {
					numberArrayPrint[j] = 0;
				} 
				else {
					numberArrayPrint[i] = numberArray[i];
				}
			}
		}
		for (int i = 1; i < numberArrayPrint.length; i++) {
			if (numberArrayPrint[i] == 0) {
			} else {
				System.out.print(numberArrayPrint[i] + " ");
			}
		}
	}
}
