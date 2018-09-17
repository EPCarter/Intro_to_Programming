
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 2-23
Date: Sept. 17, 2018
Summary: (Cost of driving) Write a program that prompts the user to enter 
					the distance to drive, the fuel efficiency of the car in miles 
					per gallon, and the price per gallon, and displays the cost of the trip.
*/

import java.util.Scanner;

class twoTwentythree {
	public static void main(String[] args) {
					Scanner reader = new Scanner(System.in);
					
					System.out.print("Distance (mi): ");
					float distance = reader.nextFloat(); 
					
					System.out.print("Efficiency (mi/gal): ");
					float efficiency = reader.nextFloat(); 
					
					System.out.print("Price ($/gal): $");
					float price = reader.nextFloat();
					
					float tripCost = distance * efficiency * price;
					System.out.print("Trip Cost: $" + tripCost);				
	}
}
