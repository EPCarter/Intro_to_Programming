package Chapter_8;

/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 8-37
Date: Oct. 2,  2018
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

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class eightThirtyseven {
	public static void main(String[] args) {
		for (int l = 0; l < 5; l++) {
			menu();
		}
	}

	public static void menu() {
		System.out.println("-------------------------------------");
		System.out.println("What would you like to do?");
		System.out.println();
		int menuItems = 5;
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
			case 3:
				b = "Canada";
				break;
			case 4:
				b = "Mexico";
				break;
			default:
				b = "Menu";
				break;
			}
			System.out.println(a + ": " + b);
			a++;
		}
		System.out.println("-------------------------------------");
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
			System.out.println("-------------------------------------");
			unitedStates();
			break;
		case 3:
			System.out.println("-------------------------------------");
			canada();
			break;
		case 4:
			System.out.println("-------------------------------------");
			mexico();
			break;
		case 5:
			System.out.println("-------------------------------------");
			all();
			break;
		default:
			break;
		}
	}

	public static void all() {
		System.out.println("All North American States, Provinces, Territories, and Capitals:");
		System.out.println("-------------------------------------");
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
		String question = "";
		double score = 0;
		int answerIndex = 0;
		for (int m = 0; m < 10; m++) {
			System.out.println();
			int number = ThreadLocalRandom.current().nextInt(1, 3);
			if (number == 1) {
				answerIndex = ThreadLocalRandom.current().nextInt(0, unitedStatesLong.length);
				question = unitedStatesLong[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(unitedStatesLong[answerIndex] + ", " + unitedStates[answerIndex] + ", "
							+ capitals[answerIndex]);
				}
			} else if (number == 2) {
				answerIndex = ThreadLocalRandom.current().nextInt(0, unitedStates.length);
				question = unitedStates[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(unitedStatesLong[answerIndex] + ", " + unitedStates[answerIndex] + ", "
							+ capitals[answerIndex]);
				}
			} else {
				answerIndex = ThreadLocalRandom.current().nextInt(0, capitals.length);
				question = capitals[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(unitedStatesLong[answerIndex] + ", " + unitedStates[answerIndex] + ", "
							+ capitals[answerIndex]);
				}
			}
			System.out.println("-------------------------------------");
		}
		System.out.println("Score:" + (score / 10) * 100 + "%");
	}

	public static void canada() {
		System.out.println("Canadian Provinces, Territories, and Capitals:");
		System.out.println("-------------------------------------");
		String[] provinceTerritory = { "AB", "BC", "MB", "NB", "NL", "NS", "ON", "PE", "QC", "SK", "YT", "NU", "NT" };
		String[] provinceTerritoryLong = { "Alberta", "British Columbia", "Manitoba", "New Brunswick",
				"Newfoundland and Labrador", "Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan",
				"Yukon", "Nunavut", "Northwest Territories" };
		String[] provCapitals = { "Edmonton", "	Victoria", "Winnipeg", "Fredericton", "St. John's", "Halifax",
				"Toronto", "Charlottetown", "Quebec City", "Regina", "Whitehorse", "Iqaluit", "	Yellowknife" };
		String question = "";
		double score = 0;
		int answerIndex = 0;
		for (int m = 0; m < 10; m++) {
			System.out.println();
			int number = ThreadLocalRandom.current().nextInt(1, 3);
			if (number == 1) {
				answerIndex = ThreadLocalRandom.current().nextInt(0, provinceTerritoryLong.length);
				question = provinceTerritoryLong[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(provinceTerritoryLong[answerIndex] + ", " + provinceTerritory[answerIndex] + ", "
							+ provCapitals[answerIndex]);
				}
			} else if (number == 2) {
				answerIndex = ThreadLocalRandom.current().nextInt(0, provinceTerritory.length);
				question = provinceTerritory[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(provinceTerritoryLong[answerIndex] + ", " + provinceTerritory[answerIndex] + ", "
							+ provCapitals[answerIndex]);
				}
			} else {
				answerIndex = ThreadLocalRandom.current().nextInt(0, provCapitals.length);
				question = provCapitals[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(provinceTerritoryLong[answerIndex] + ", " + provinceTerritory[answerIndex] + ", "
							+ provCapitals[answerIndex]);
				}
			}
			System.out.println("-------------------------------------");
		}
		System.out.println("Score: " + (score / 10) * 100 + " %");
	}

	public static void mexico() {
		System.out.println("Mexican States and Capitals");
		System.out.println("-------------------------------------");
		String[] mexicanStates = { "", "", "", "", "", "", "", "", "", "" };
		String[] mexicanStatesLong = { "", "", "", "", "", "", "", "", "", "" };
		String[] mexicanCapitals = { "", "", "", "", "", "", "", "", "", "" };
		String question = "";
		int answerIndex = 0;
		double score = 0;
		for (int m = 0; m < 10; m++) {
			System.out.println();
			int number = ThreadLocalRandom.current().nextInt(1, 3);
			if (number == 1) {
				answerIndex = ThreadLocalRandom.current().nextInt(0, mexicanStatesLong.length);
				question = mexicanStatesLong[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(mexicanStatesLong[answerIndex] + ", " + mexicanStates[answerIndex] + ", "
							+ mexicanCapitals[answerIndex]);
				}
			} else if (number == 2) {
				answerIndex = ThreadLocalRandom.current().nextInt(0, mexicanStates.length);
				question = mexicanStates[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(mexicanStatesLong[answerIndex] + ", " + mexicanStates[answerIndex] + ", "
							+ mexicanCapitals[answerIndex]);
				}
			} else {
				answerIndex = ThreadLocalRandom.current().nextInt(0, mexicanCapitals.length);
				question = mexicanCapitals[answerIndex];

				if (userInput(question, answerIndex)) {
					score++;
				} else {
					System.out.println(mexicanStatesLong[answerIndex] + ", " + mexicanStates[answerIndex] + ", "
							+ mexicanCapitals[answerIndex]);
				}
			}
			System.out.println("-------------------------------------");
		}
		System.out.println("Score:" + (score / 10) * 100 + "%");
	}

	public static boolean userInput(String question, int answerIndex) {
		// Help returns 0-4 options
		System.out.println(question + answerIndex);

		Scanner reader = new Scanner(System.in);
		// String answerInput = reader.nextLine();
		// convert input to answer index to compare
		int answerCleaned = reader.nextInt();
		// int answerCleaned = Integer.parseInt(answerInput);
		if (answerCleaned == answerIndex) {
			return true;
		} else {
			return false;
		}
	}
}