
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 5-49
Date: .  2018
Summary: (Count vowels and consonants) Assume letters 
          A, E, I, O, and U as the vowels. Write a 
          program that prompts the user to enter a 
          string and displays the number of vowels 
          and consonants in the string.

          Hint: Use the method "toUpperCase()" on your 
          character to simplify the conditions of your 
          if statement
*/
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Space {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = reader.next();
		reader.close();

		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		int countY = 0;
		int countNot = 0;

		String aPattern = ".?(A|a).?";
		String ePattern = "(E|e)";
		String iPattern = "(I|i)";
		String oPattern = "(O|o)";
		String uPattern = "(U|u)";
		String yPattern = "(Y|y)";
		String notPattern = "^[AaEeIiOoUu]";

		regexChecker(aPattern, input);
		regexChecker(ePattern, input);
		regexChecker(iPattern, input);
		regexChecker(oPattern, input);
		regexChecker(uPattern, input);
		regexChecker(yPattern, input);
		regexChecker(notPattern, input);

	}

	public static void regexChecker(String theRegex, String str2Check) {
		Pattern checkRegex = Pattern.compile(theRegex);
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		while (regexMatcher.find()) {
			if (regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
		}
	}
}
