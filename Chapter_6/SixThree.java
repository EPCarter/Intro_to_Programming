package Chapter_6;

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

class SixThree {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter something: ");
		String input = reader.nextLine().toLowerCase();
		reader.close();
		int length = input.length();
		String reverse = reverse(input);
		if (isPalindrome(length, input, reverse)) {
			System.out.println(input + " is a Palindrome.");
		} else {

			System.out.println(input + " (" + reverse + ")" + " is NOT a Palindrome.");
		}
	}

	public static String reverse(String input) {
		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		return reverse;
	}

	public static boolean isPalindrome(int length, String input, String reverse) {
		int count = 0;
		boolean isOrNot = false;
		for (int j = 0; j < length; j++) {
			if (reverse.charAt(j) == input.charAt(j)) {
				count++;
			}
		}
		if (count == length)
			isOrNot = true;
		{
			return isOrNot;
		}
	}
}
