//package Chapter_6;
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 6-17
Date: Oct. 4, 2018
Summary: (Display matrix of 0s and 1s) Write a method that displays an 
          n-by-n matrix using the following header:
          
              public static void printMatrix(int n)
              
          Each element is 0 or 1, which is generated randomly. Write a 
          test program that prompts the user to enter n and displays an 
          n-by-n matrix.
*/

import java.util.*;

@SuppressWarnings("resource")

class SixSeventeen {
	public static void main(String[] args) {
		for (int k = 0; k < 5; k++) {
			input();
		}
	}

	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> matrix = new ArrayList<Integer>(n);
			for (int j = 0; j < n; j++) {
				matrix.add(numberGenerator());
			}
			System.out.println(matrix);
		}
	}

	public static void input() {
		Scanner reader = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter matrix side length: ");
		int n = reader.nextInt();
		printMatrix(n);
	}

	public static int numberGenerator() {
		Random rand = new Random();
		int number = rand.nextInt(2);
		return number;
	}
}