		/*
		Author: Erik Carter
		Email: Carter.Eri7200@stu.stech.edu
		Course: CSCI 1105 - Introduction to Programming
		Assignment: 1-5
		Date: Sept. 17   2018
		Summary: (Compute expressions) Write a program that displays the result of: [(9.5 * 4.5) - (2.5 * 3.0)] / [45.5 - 3.5]
		*/

public class oneFive{	
	public static void main(String[] args) {				    
		double answer = ((9.5 * 4.5) - (2.5 * 3.0)) / (45.5 - 3.5);
		
		System.out.println("The answer is: " + answer);
		System.out.println("");
		System.out.println("The steps are: ");
		
		double stepOne = 9.5 * 4.5;
		double stepTwo = 2.5 * 3;
		double stepThree = stepOne - stepTwo;
		double stepFour = 45.5 - 3.5;
		double stepFive = stepThree / stepFour;
		
		System.out.println("9.5 * 4.5 = " + stepOne);
		System.out.println("2.5 * 3 = " + stepTwo);
		System.out.println(stepOne + " + " + stepTwo + " = " + stepThree);
		System.out.println("45.5 - 3.5 = " + stepFour);
		System.out.println("Total: " + stepFive);
			}
		}
	
