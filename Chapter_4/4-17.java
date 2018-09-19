
/*
	Author: Erik Carter
	Email: Carter.Eri7200@stu.stech.edu
	Course: CSCI 1105 - Introduction to Programming
	Assignment: 4-17
	Latest Update: Sept. 19,  2018
	Summary: (Days of a month) Write a program that prompts the user to enter a year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month.
*/

import java.util.*;

class FourSeventeen {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = 0;

		while (count < 5) { // Do five rounds before ending, unless year = 0
			System.out.println("");

			System.out.println("Enter a date: ");
			String date = reader.next();

			System.out.println("");

			System.out.print("Enter a year: "); // catch strings
			int year = reader.nextInt();

			String calendar = "Gregorian Calendar"; // or Roman Republic, Julian, or Revised Julian
			String hads = "has"; // or " had ";
			String wis = "is"; // or " was ";
			String ly = "normal"; // or " leap ";

			String era = "CE"; // or BCE

			String january = "31";
			String february = "28";
			String march = "31";
			String april = "30";
			String may = "31";
			String june = "30";
			String july = "31";
			String august = "31";
			String september = "30";
			String october = "31";
			String november = "30";
			String december = "31";
			String wages = "23";

			if (year == 0) {
				System.out.print(" Exiting...");
				System.exit(0);
			}

			if (year <= 2018) {
				hads = "had";
				wis = "was";
			}

			else {
				hads = "has";
				wis = "is";
			}

			if (year < 0) {
				era = "BCE";
			}

			else {
				era = "CE";
			}

			if (year < -45) { // Roman Republic Calendar
				calendar = "Roman Republic Calendar";
				ly = "normal";
				january = "29";
				april = "29";
				june = "29";
				august = "29";
				september = "29";
				november = "29";
				december = "29";
			}

			else if (year >= -45 && year < 12) { // Early Julian Calendar
				calendar = "Early Julian Calendar";
				int earlyJulianLeapYear = -45;

				while (earlyJulianLeapYear < 12) {
					if (year == earlyJulianLeapYear) {
						ly = "leap";
						System.out.println("Leap year! ");
						february = "29";
					}

					else {

					}

					earlyJulianLeapYear += 3;
					System.out.print(earlyJulianLeapYear + ", ");
				}
			}

			else if (year >= 12 && year < 1582) { // Julian Calendar
				calendar = "Julian Calendar";
				int julianLeapYear = 12;

				while (julianLeapYear <= 1576) {
					if (julianLeapYear == year) {
						ly = "leap";
						System.out.println("Leap year! ");
						february = "29";
					}

					else {

					}

					julianLeapYear += 4;
					// System.out.print(julianLeapYear + ", ");
				}
			}

			else if (year >= 1582 && year < 2800) { // Gregorian Calendar
				calendar = "Gregorian Calendar";

				if (year % 100 == 0) {
					if (year % 400 == 0) {
						ly = "leap";
						System.out.println("Leap year! ");
						february = "29";
					}

					else {
						ly = "normal";
					}
				}

				else if (year % 4 == 0) {
					ly = "leap";
					System.out.println("Leap year! ");
					february = "29";
				}

				else {
					ly = "normal";
				}

			}

			else if (year >= 2800) { // Revised Julian Calendar
				calendar = "Revised Julian Calendar";
				if (year % 900 == 200 || year % 900 == 600) {
					ly = "normal";
				}

				else if (year % 100 == 0) {
					ly = "normal";
				}

				else if (year % 4 == 0) {
					ly = "leap";
					System.out.println("Leap year! ");
					february = "29";
				}

				else {
					ly = "normal";
				}

			}
			System.out.print("");
			System.out.print("Enter a month (Mmm): "); // numerical or letters
			String month = reader.next();

			String monthStandardized = "31-ish";
			String days = monthStandardized; // (1-31)

			/*
			 * if (month == "Jan") { monthStandardized = january; }
			 * 
			 * else if (month == "Feb") { monthStandardized = february; }
			 * 
			 * else if (month == "Mar") { monthStandardized = march; }
			 * 
			 * else if (month == "Apr") { monthStandardized = april; }
			 * 
			 * else if (month == "May") { monthStandardized = may; }
			 * 
			 * else if (month == "Jun") { monthStandardized = june; }
			 * 
			 * else if (month == "Jul") { monthStandardized = july; }
			 * 
			 * else if (month == "Aug") { monthStandardized = august; }
			 * 
			 * else if (month == "Sep") { monthStandardized = september; }
			 * 
			 * else if (month == "Oct") { monthStandardized = october; }
			 * 
			 * else if (month == "Nov") { monthStandardized = november; }
			 * 
			 * else if (month == "Dec") { monthStandardized = december; }
			 * 
			 * else if (month == "Wag") { monthStandardized = wages; }
			 * 
			 * else { monthStandardized = wages; }
			 * 
			 * days = monthStandardized;
			 */

			int countJan = 0;
			int countFeb = 0;
			int countMar = 0;
			int countApr = 0;
			int countMay = 0;
			int countJun = 0;
			int countJul = 0;
			int countAug = 0;
			int countSep = 0;
			int countOct = 0;
			int countNov = 0;
			int countDec = 0;
			int countWag = 0;

			if (date.matches("/January|Jan|Ja|nu/gi")) {
				countJan++;
			}

			if (date.matches("/February|Feb|F|ru/gi")) {
				countFeb++;

			}
			if (date.matches("/March|Mar|Mar|ch|h/gi")) {
				countMar++;
			}

			if (date.matches("/April|Ap|il|ri/gi")) {
				countApr++;
			}

			if (date.matches("/May|May|ay/gi")) {
				countMay++;
			}

			if (date.matches("/June|Jun|un|ne/gi")) {
				countJun++;
			}

			if (date.matches("/July|Jul|ul|ly/gi")) {
				countJul++;
			}

			if (date.matches("/August|Aug|st|Au/gi")) {
				countAug++;
			}

			if (date.matches("/September|Sept|pt/gi")) {
				countSep++;
			}

			if (date.matches("/October|Oct|ober/gi")) {
				countOct++;
			}

			if (date.matches("/November|Nov|v|no/gi")) {
				countNov++;
			}

			if (date.matches("/December|Dec|d/gi")) {
				countDec++;
			}

			if (date.matches("/Mercedonius Mensis Intercalari|Wages|Wag/gis")) {
				countWag++;
			}

			List<Integer> ranking = new ArrayList<Integer>();
			ranking.add(countJan);
			ranking.add(countFeb);
			ranking.add(countMar);
			ranking.add(countApr);
			ranking.add(countMay);
			ranking.add(countJun);
			ranking.add(countJul);
			ranking.add(countAug);
			ranking.add(countSep);
			ranking.add(countOct);
			ranking.add(countNov);
			ranking.add(countDec);
			ranking.add(countWag);

			int monthRank = Collections.max(ranking);

			// System.out.println(monthRank + " is most likely.");
			System.out.println("");
			System.out.println("Month Likelihood Scores: ");
			System.out.println("Jan: " + countJan);
			System.out.println("Feb: " + countFeb);
			System.out.println("Mar: " + countMar);
			System.out.println("Apr: " + countApr);
			System.out.println("May: " + countMay);
			System.out.println("Jun: " + countJun);
			System.out.println("Jul: " + countJul);
			System.out.println("Aug: " + countAug);
			System.out.println("Sep: " + countSep);
			System.out.println("Oct: " + countOct);
			System.out.println("Nov: " + countNov);
			System.out.println("Dec: " + countDec);
			System.out.println("Wag: " + countWag);

			System.out.println("According to the " + calendar + ", " + year + " " + era + " " + wis + " a " + ly
					+ " year and " + month + " " + hads + " " + days + " days in it.");

		}
		count++;
		reader.close();
	}
}
