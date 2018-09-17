/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 2-1
Date: Sept. 17,  2018
Summary: (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows: 
					
						fahrenheit = (9 / 5) * celsius + 32
				(Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.)
*/

import java.util.Scanner;

class twoOne {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);		
		
		System.out.print("Enter Celcius: ");		
		float celsius = reader.nextFloat();
		
		float fahrenheit = ((9.0f/5.0f) * celsius) + 32.0f;;

		System.out.println("Celcius: " + celsius + " is Fahrenheit: " + fahrenheit);
	}
	
}
