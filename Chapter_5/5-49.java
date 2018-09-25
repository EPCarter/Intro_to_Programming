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
import java.util.Scanner;

class fiveFourtynine {
          public static void main(String[] args) {
           Scanner reader = new Scanner(System.in);         
          import java.util.*;

public class Test3 {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = reader.next();

		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		int countY = 0;
		int countNot = 0;

		String aPattern = "(?i)[a]+";
		String ePattern = "(?i)[e]+";
		String iPattern = "(?i)i";
		String oPattern = "(?i)o";
		String uPattern = "(?i)u";
		String yPattern = "(?i)y";
		String notPattern = "(?i)^aeiou";

		if (input.matches(aPattern)) {
			countA++;
		}

		if (input.matches(ePattern)) {
			countE++;
		}
		if (input.matches(iPattern)) {
			countI++;
		}

		if (input.matches(oPattern)) {
			countO++;
		}

		if (input.matches(uPattern)) {
			countU++;
		}

		if (input.matches(yPattern)) {
			countY++;
		}
		if (input.matches(notPattern)) {
			countNot++;
		} else {
			System.out.println("Error 01");
		}

		int largest = 0;

		int[] ranking = { countA, countE, countI, countO, countU, countY, countNot };

		for (int i = 1; i < ranking.length; i++) {
			if (ranking[i] > ranking[largest])
				largest = i;
		}

		if (largest == 0) {
			largest = 0;
		}

		else {
			largest = largest + 1;
		}

		if (largest == 0) {
			System.out.println("Error 02");
		}
	}
}

          }
}
