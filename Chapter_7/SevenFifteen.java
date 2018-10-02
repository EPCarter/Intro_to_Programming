/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 7-15
Date: Oct. 1,  2018
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
		System.out.print("Enter a string: ");
		String input = reader.nextLine();
		reader.close();

		String inputCleaned = input.replaceAll("\\s+", "");
		char[] list = inputCleaned.toCharArray();
		eliminateDuplicates(list);
		System.out.println(list);
	}

	public static char[] eliminateDuplicates(char[] list) {
		for (int primary = 0; primary < list.length; primary++) {
			for (int secondary = 0; secondary < list.length; secondary++) {
				if (list[primary] == list[secondary] && primary != secondary) {
					list[secondary] = ' ';
				}
			}
		}
		return list;
	}
}
