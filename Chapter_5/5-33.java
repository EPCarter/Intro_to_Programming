/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 5-33
Date: Sept. 25, 2018
Summary: (Perfect number) A positive integer is called 
          a perfect number if it is equal to the sum of 
          all of its positive divisors, excluding itself. 
          For example, 6 is the first perfect number because 
          6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. 
          There are four perfect numbers less than 10,000. 
          Write a program to find all these four numbers.
*/

public class FiveThirteeThree {
	public static void main(String[] args) {
		int x = 1;

		while (x <= 10000) {
			x++;
			int y = 0;
			int z = 0;
			
			while (y <= x) {
				y++;

				if (x % y == 0) {
					z += y;
					// System.out.println(x + " is divisible by " + y + " sum " + z + ".");
				}
				if (z == x + 1) {
					// System.out.println(x + " is prime.");
				}
				if (z == x && y >= x - 1) { // x != 24 && x != 8190 && x != 2016
					System.out.println(x + " is a perfect number.");
				}
			}
		}
	}
}
