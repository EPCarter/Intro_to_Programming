/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 7-5
Date: .  2018
Summary: (Print distinct numbers) Write a program that reads in ten 
          numbers and displays the number of distinct numbers and 
          the distinct numbers separated by exactly one space 
          (i.e., if a number appears multiple times, it is displayed only once).

          (Hint: Read a number and store it to an array if it is new. 
          If the number is already in the array, ignore it.)

          After the input, the array contains the distinct numbers.
*/

import java.util.*;

class SevenFive {
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
