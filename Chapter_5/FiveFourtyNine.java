
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 5-49
Date: Sept. 26, 2018
Summary: (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels. Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
		 Hint: Use the method "toUpperCase()" on your character to simplify the conditions of your if statement.
*/
import java.util.*;

public class Spaces {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = reader.nextLine();
		reader.close();
		String mInput = input;
		int vowCount = 0;
		int conCount = 0;
		int punctuation = 0;
		int number = 0;
		int spaces = 0;
		boolean aFlag = false;
		boolean eFlag = false;
		boolean iFlag = false;
		boolean oFlag = false;
		boolean uFlag = false;
		boolean yFlag = false;
		int flags = 0;
		int character = 0;
		while (character < mInput.length()) {
			char let = mInput.charAt(character);
			if (let == 'a' | let == 'A') {
				aFlag = true;
				vowCount++;
				character++;
			} else if (let == 'e' | let == 'E') {
				eFlag = true;
				vowCount++;
				character++;
			} else if (let == 'i' | let == 'I') {
				iFlag = true;
				vowCount++;
				character++;
			} else if (let == 'o' | let == 'O') {
				oFlag = true;
				vowCount++;
				character++;
			} else if (let == 'u' | let == 'U') {
				uFlag = true;
				vowCount++;
				character++;
			} else if (let == 'y' | let == 'Y') {
				yFlag = true;
				vowCount++;
				character++;
			} else if (let == ',' | let == '.' | let == '"' | let == '=' | let == '+' | let == '-' | let == '_'
					| let == ')' | let == '(' | let == '*' | let == '&' | let == '^' | let == '%' | let == '$'
					| let == '#' | let == '@' | let == '!' | let == '`' | let == '~' | let == ';') {
				punctuation++;
				character++;
			} else if (let == '0' | let == '1' | let == '2' | let == '3' | let == '4' | let == '5' | let == '6'
					| let == '7' | let == '8' | let == '9') {
				number++;
				character++;
			} else if (let == ' ') {
				spaces++;
				character++;
			} else {
				conCount++;
				character++;
			}
		}
		if (aFlag == true) {
			System.out.print("A ");
			flags++;
		}
		if (eFlag == true) {
			System.out.print("E ");
			flags++;
		}
		if (iFlag == true) {
			System.out.print("I ");
			flags++;
		}
		if (oFlag == true) {
			System.out.print("O ");
			flags++;
		}
		if (uFlag == true) {
			System.out.print("and U ");
			flags++;
		}
		if (yFlag == true) {
			System.out.print("and sometimes Y ");
			flags++;
		}

		String ire = "are ";
		if (flags == 0) {
			ire = "There are no ";
		} else if (flags == 1) {
			ire = "is one of the ";
		}

		System.out.println(ire + "vowels.");
		System.out.println("_______________");
		System.out.print("Vowels:      " + vowCount);
		System.out.println();
		System.out.println("Consonents:  " + conCount);
		System.out.println("Punctuation: " + punctuation);
		System.out.println("Numbers:     " + number);
		System.out.println("Spaces:      " + spaces);
	}
}
