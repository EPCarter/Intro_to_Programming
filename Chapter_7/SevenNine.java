package Chapter_7;

/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 7-9
Date: .  2018
Summary: (Find the smallest element) Write a method that finds
          the smallest element in an array of double values 
          using the following header:
          
              public static double min(double[] array)
              
          Write a test program that prompts the user to enter 
          ten numbers, invokes this method to return the minimum 
          value, and displays the minimum value.
*/

import java.util.*;

class SevenNine {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double[] array = new double[11];
		for (int i = 1; i < 11; i++) {
			System.out.print("Enter number " + i + ": ");
			array[i] = reader.nextDouble();
		}
		reader.close();
		System.out.println(min(array));
	}

	public static double min(double[] array) {
		Arrays.sort(array);
		return array[0];
	}
}