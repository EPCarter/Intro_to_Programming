
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 4-1
Date: .  2018
Summary: (Geometry: area of a pentagon) Write a program that 
					prompts the user to enter the length from the center 
					of a pentagon to a vertex and computes the area of 
					the pentagon, as shown in the following figure.
					
					The formula for computing the area of a pentagon is:
					
							Area = (5 * s^2) / (4 * (tan(pi/5)));
						
					 where s is the length of a side. The side can be 
					 computed using the formula:
					 
							s = 2r sin(5);
							
						where r is the length from the center of a pentagon 
						to a vertex. Round up two digits after the decimal point.
						
						radius = side / 2 * Math.sin(180/5);
						side = radius * Math.sin(180/5);
						
						area = 5*s^2 / 4*tan(pi/5)
						side = 2*radius *sin(5)
						
						double side = (2 * radius) * (- Math.sin(n));
						double area = (n * (Math.pow(side, 2))) / (4 * Math.tan(Math.PI/n));
						
						double side2 = (2 * radius) * (- Math.sin(180/n));
						System.out.println("Side try 2: " + side2); 
						
						TODO Round up tenths
						double area2 = (Math.pow(side2, 2) * n) / (Math.tan(180/n) * 4);
						System.out.println("Area try 2: " + area2); 

*/

import java.util.Scanner;
import java.math.*;

class fourOne {
		public static void main(String[] args) {
				Scanner reader = new Scanner(System.in);
				 
				System.out.print("Input number of sides: ");
				double n = reader.nextDouble();
				
				System.out.print("Input Circumradius of Pentagon (center to corner): ");
				double radius = reader.nextDouble();
				
				
				double side = (radius * 2) * (Math.sin(Math.PI / n));
				double area = (Math.pow(side, 2) * n) / (Math.tan(Math.PI/n) * 4) ;
							
				System.out.println("The area is " + area + ", and the side is " + side);

		}
}

