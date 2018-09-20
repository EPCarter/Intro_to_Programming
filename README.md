
/*
	Author: Erik Carter
	Email: Carter.Eri7200@stu.stech.edu
	Course: CSCI 1105 - Introduction to Programming
	Assignment: 4-17
	Latest Update: Sept. 19,  2018
	Summary: (Days of a month) Write a program that prompts the user to enter a year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month.
*/

import java.util.*;

public class Examples {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		String janPattern = "(?i)January|Jan|Ja|nu|1|01";
		String febPattern = "(?i)February|Feb|F|ru|2|02";

		System.out.print("Enter a Month: ");
		String date = reader.next();

		int countJan = 0;
		int countFeb = 0;

		if (date.matches(janPattern)) {
		}

		else if (date.matches(febPattern)) {
		}

		int largest = 0;
		int[] ranking = { countJan, countFeb };

		for (int i = 1; i < ranking.length; i++) {
			if (ranking[i] > ranking[largest])
				largest = i;
		}
		reader.close();
	}
}
