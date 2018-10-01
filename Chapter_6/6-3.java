
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 6-3
Date: .  2018
Summary: (Palindrome integer) Write the methods with the following headers:
            
              // Return the reversal of an integer, i.e., reverse(456) returns 654
              public static int reverse(int number) 
              // Return true if number is a palindrome
              public static boolean isPalindrome(int number)

          Use the reverse method to implement isPalindrome. A number is a palindrome 
          if its reversal is the same as itself. Write a test program that prompts the 
          user to enter an integer and reports whether the integer is a palindrome.

          (Hint: The isPalindrome method should call the reverse method.)
*/
import java.util.Scanner;

class Spaces2 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String input = reader.nextLine();
		reader.close();
		char[] inputChars = input.toCharArray();
		char[] reverseChars = new char[inputChars.length];
		String reverseString = reverseChars.toString();

		for (int i = 0; i < inputChars.length; i++) {
			reverseChars[i] = inputChars[inputChars.length - i];
		}

		if (input == reverseString) {
			System.out.println(input + " is a palindrome.");
		}

		else {
			System.out.println(input + " is not a palindrome.");
		}
	}
}
