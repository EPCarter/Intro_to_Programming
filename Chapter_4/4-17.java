
/*
	Author: Erik Carter
	Email: Carter.Eri7200@stu.stech.edu
	Course: CSCI 1105 - Introduction to Programming
	Assignment: 4-17
	Latest Update: Sept. 19,  2018
	Summary: (Days of a month) Write a program that prompts the user to enter a year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month.
*/

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class FourSeventeen {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = 0;

		while (count < 5) { // Do five rounds before ending, unless year = 0
			System.out.println("");

			System.out.print("Enter a Month: ");
			String date = reader.next();

			System.out.print("Enter a year: "); // catch strings
			int year = reader.nextInt();

			String month = "";
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
			String days = "";

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
			System.out.println("");

			// System.out.print("Enter a month (Mmm): "); // numerical or letters
			// String month = reader.next();

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

			String janPattern = "(?i)January|Jan|Ja|nu|1|01";
			String febPattern = "(?i)February|Feb|F|ru|2|02";
			String marPattern = "(?i)March|Mar|Mar|ch|h|3|03";
			String aprPattern = "(?i)April|Ap|il|ri|4|04";
			String mayPattern = "(?i)May|May|ay|5|05";
			String junPattern = "(?i)June|Jun|un|ne|6|06";
			String julPattern = "(?i)July|Jul|ul|ly|7|07";
			String augPattern = "(?i)August|Aug|st|Au|8|08";
			String sepPattern = "(?i)September|Sept|pt|9|09";
			String octPattern = "(?i)October|Oct|ober|10";
			String novPattern = "(?i)November|Nov|v|no|11";
			String decPattern = "(?i)December|Dec|d|12";
			String wagPattern = "(?i)Mercedonius Mensis Intercalari|Wages|Wag|13";

			if (date.matches(janPattern)) {
				countJan++;
			}

			if (date.matches(febPattern)) {
				countFeb++;

			}
			if (date.matches(marPattern)) {
				countMar++;
			}

			if (date.matches(aprPattern)) {
				countApr++;
			}

			if (date.matches(mayPattern)) {
				countMay++;
			}

			if (date.matches(junPattern)) {
				countJun++;
			}

			if (date.matches(julPattern)) {
				countJul++;
			}

			if (date.matches(augPattern)) {
				countAug++;
			}

			if (date.matches(sepPattern)) {
				countSep++;
			}

			if (date.matches(octPattern)) {
				countOct++;
			}

			if (date.matches(novPattern)) {
				countNov++;
			}

			if (date.matches(decPattern)) {
				countDec++;
			}

			if (date.matches(wagPattern)) {
				countWag++;
			}

			int largest = 0;

			int[] ranking = { countJan, countFeb, countMar, countApr, countMay, countJun, countJul, countAug, countSep,
					countOct, countNov, countDec, countWag };

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
				days = "Error";
				month = "Error";
			}
			if (largest == 1) {
				days = january;
				month = "January";
			}

			else if (largest == 2) {
				days = february;
				month = "February";
			}

			else if (largest == 3) {
				days = march;
				month = "March";
			}

			else if (largest == 4) {
				days = april;
				month = "April";
			}

			else if (largest == 5) {
				days = may;
				month = "May";
			}

			else if (largest == 6) {
				days = june;
				month = "June";
			}

			else if (largest == 7) {
				days = july;
				month = "July";
			}

			else if (largest == 8) {
				days = august;
				month = "August";
			}

			else if (largest == 9) {
				days = september;
				month = "September";
			}

			else if (largest == 10) {
				days = october;
				month = "October";
			}

			else if (largest == 11) {
				days = november;
				month = "Nobember";
			}

			else if (largest == 12) {
				days = december;
				month = "December";
			}

			else if (largest == 13) {
				days = wages;
				month = "Wages";
			}

			System.out.println("According to the " + calendar + ", " + year + " " + era + " " + wis + " a " + ly
					+ " year and " + month + " " + hads + " " + days + " days in it.");

		}
		count++;
		reader.close();
	}
}
