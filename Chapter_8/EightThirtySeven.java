package Chapter_8;

/*
	Author: Erik Carter
	Email: Carter.Eri7200@stu.stech.edu
	Course: CSCI 1105 - Introduction to Programming
	Assignment: 8-37
	Date: Oct. 4,  2018
	Summary: (Guess the capitals) Write a program that repeatedly 
	          prompts the user to enter a capital for a state. Upon
	          receiving the user input, the program reports whether 
	          the answer is correct. Assume that 10 states and their 
	          capitals are stored in a two-dimensional array, as shown 
	          in Figure 8.10. The program prompts the user to answer 
	          states capitals and displays the total correct count. 
	          The user answer is not case-sensitive.

	          This assignment has been edited from the book version to 
	          use an array that stores only 10 states and capitals.
	*/
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@SuppressWarnings("resource")

public class EightThirtySeven {
	public static void main(String[] args) {
		for (int l = 0; l < 5; l++) {
			menu();
		}
	}

	public static void menu() {
		System.out.println("-------------------------------------");
		System.out.println("What would you like to do?");
		System.out.println();
		int menuItems = 3;
		int a = 0;
		String b = "";
		for (int j = 0; j < menuItems; j++) {
			switch (j) {
			case 0:
				b = "Exit";
				break;
			case 1:
				b = "Menu";
				break;
			case 2:
				b = "U.S. States and Capitals";
				break;
			default:
				b = "Menu";
				break;
			}
			System.out.println(a + ": " + b);
			a++;
		}
		System.out.println("-------------------------------------");
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int inputCleaned = Integer.parseInt(reader.nextLine());
		System.out.println("-------------------------------------");
		switch (inputCleaned) {
		case 0:
			System.exit(0);
			break;
		case 1:
			menu();
			break;
		case 2:
			unitedStates();
			break;
		default:
			break;
		}
	}

	public static void unitedStates() {
		System.out.println("U.S. Capitals and States:");
		System.out.println("-------------------------------------");

		String[] unitedStates = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN",
				"IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM",
				"NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV",
				"WI", "WY" };

		String[] unitedStatesLong = { "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
				"Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
				"Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
				"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
				"New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
				"Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia",
				"Washington", "West Virginia", "Wisconsin", "Wyoming" };

		String[] capitals = { "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford",
				"Dover", "Tallahassee", "Atlanta", "Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines",
				"Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis", "Boston", "Lansing", "Saint Paul",
				"Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton", "Santa Fe",
				"Albany", "Raleigh", "Bismarck", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence",
				"Columbia", "Pierre", "Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia",
				"Charleston", "Madison", "Cheyenne" };
		Scanner reader = new Scanner(System.in);
		String input = "";
		String question = "";
		double score = 0;
		int answerIndex = 0;
		for (int m = 0; m < 10; m++) {
			System.out.println();
			int number = ThreadLocalRandom.current().nextInt(1, 2);
			if (number == 1) {
				answerIndex = ThreadLocalRandom.current().nextInt(0, unitedStatesLong.length);
				question = unitedStatesLong[answerIndex];
				System.out.println("What is the capital of " + question + "?");
				input = reader.nextLine();
				if (checker(capitals, unitedStates, unitedStatesLong, input, answerIndex)) {
					System.out.println("Correct!");
					score++;
				} else {
					System.out.println(unitedStatesLong[answerIndex] + ", " + unitedStates[answerIndex] + ", "
							+ capitals[answerIndex]);
				}

			} else if (number == 2) {
				answerIndex = ThreadLocalRandom.current().nextInt(0, unitedStates.length);
				question = unitedStates[answerIndex];
				System.out.println("What is the capital of " + question + "?");
				input = reader.nextLine();
				if (checker(capitals, unitedStates, unitedStatesLong, input, answerIndex)) {
					System.out.println("Correct!");
					score++;
				} else {
					System.out.println(unitedStatesLong[answerIndex] + ", " + unitedStates[answerIndex] + ", "
							+ capitals[answerIndex]);
				}

			} else {
				answerIndex = ThreadLocalRandom.current().nextInt(0, capitals.length);
				question = capitals[answerIndex];
				System.out.println("What state has the capital of " + question + "?");
				input = reader.nextLine();

				if (checker(capitals, unitedStates, unitedStatesLong, input, answerIndex)) {
					System.out.println("Correct!");
					score++;
				} else {
					System.out.println(unitedStatesLong[answerIndex] + ", " + unitedStates[answerIndex] + ", "
							+ capitals[answerIndex]);
				}
			}
		}
		System.out.println("Score:" + (score / 10) * 100 + "%");
	}

	public static boolean checker(String[] capitals, String[] unitedStates, String[] unitedStatesLong, String input,
			int answerIndex) {
		int userInputId = 0;
		boolean check = false;

		for (int i = 0; i < unitedStates.length; i++) {
			Pattern searchPattern = Pattern.compile(capitals[i]);
			Matcher searchMatcher = searchPattern.matcher(input);

			if (searchMatcher.find()) {
				userInputId = i;
				// System.out.println("UserInput is in index:" + userInputId);
			}
			if (userInputId == answerIndex) {
				check = true;
			}
		}
		return check;
	}
}