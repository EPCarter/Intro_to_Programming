

/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 3-19
Date: Sept. 17, 2018
Summary: (Compute the perimeter of a triangle) Write a program 
					that reads three edges for a triangle and computes the 
					perimeter if the input is valid. Otherwise, display that 
					the input is invalid. The input is valid if the sum of 
					every pair of two edges is greater than the remaining edge.
*/

import java.util.Scanner;

class threeNineteen {
	public static void main(String[] args) {
					Scanner reader = new Scanner(System.in);
					
					System.out.print("Input Side A: ");
					double sideA = reader.nextDouble();
					
					System.out.print("Input Side B: ");
					double sideB = reader.nextDouble();
					
					System.out.print("Input Side C: ");
					double sideC = reader.nextDouble();
					
					double perimeter;
			
					if(sideA + sideB > sideC){
						System.out.println("Side C must be longer than Side A + Side B.");
										}
					else{
					 perimeter = sideA + sideB + sideC;
					 System.out.println("The Perimeter is: " + perimeter);
					 }
	}
}
