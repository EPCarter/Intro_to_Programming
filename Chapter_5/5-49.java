
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 5-49
Date: Sept. 26, 2018
Summary: (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels. Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
		 Hint: Use the method "toUpperCase()" on your character to simplify the conditions of your if statement.
*/
import java.util.regex.*;
import java.util.*;

public class Space1 {
	int vowelCount = 0;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = reader.nextLine();
		//System.out.println("The String is:" + input);
		reader.close();
		
		String aPattern = "(()?(A+|a+)+()?)+";
		String ePattern = "(()?(E+|e+)+()?)+";
		String iPattern = "(()?(I+|i+)+()?)+";
		String oPattern = "(()?(O+|o+)+()?)+";
		String uPattern = "(()?(U+|u+)+()?)+";
		String yPattern = "(()?(Y+|y+)+()?)+";
		String vowelPattern = "(()?(a+|e+|i+|o+|u+|y+|A+|E+|I+|O+|U+|Y+)+()?)+";
		String nonvowelPattern = "[^aeiouyAEIOUY]+";

		regexChecker(aPattern, input);
		regexChecker(ePattern, input);
		regexChecker(iPattern, input);
		regexChecker(oPattern, input);
		regexChecker(uPattern, input);
		regexChecker(yPattern, input);
		System.out.println(" are vowels.");

		System.out.print("Vowels: ");
		regexChecker(vowelPattern, input);
		
		System.out.println();
		System.out.print("Consonants: ");
		regexChecker(nonvowelPattern, input);
	}

	public static void regexChecker(String theRegex, String str2Check) {
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		if (regexMatcher.find()) {
			System.out.print(" " + regexMatcher.group().trim());
		}
	}
}
