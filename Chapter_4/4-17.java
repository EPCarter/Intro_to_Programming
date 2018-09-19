
/*
	Author: Erik Carter
	Email: Carter.Eri7200@stu.stech.edu
	Course: CSCI 1105 - Introduction to Programming
	Assignment: 4-17
	Latest Update: Sept. 18,  2018
	Summary: (Days of a month) Write a program that prompts the user to enter a year and the first three letters of a month  name (with the first letter in uppercase) and displays the number of days in the month.
*/

import java.util.*;

class FourSeventeen {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int count = 0;

		while (count < 5) {
			System.out.println("");
			System.out.print("Enter a year: "); // catch strings
			int year = reader.nextInt();

			System.out.print("Enter a month (Mmm): "); // numerical or letters
			String month = reader.next();

			String calendar = "Gregorian Calendar"; // or Roman Republic, Julian, or Revised Julian
			String hads = "has"; // or " had ";
			String wis = "is"; // or " was ";
			String ly = "normal"; // or " leap ";
			String days = "31-ish"; // (1-31)
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
						february = "29";
					}

					else {

					}

					earlyJulianLeapYear += 3;
					// System.out.println(earlyJulianLeapYear);
				}
			}

			else if (year >= 12 && year < 1582) { // Julian Calendar
				calendar = "Julian Calendar";
				int julianLeapYear = 12;

				while (julianLeapYear <= 1576) {
					if (julianLeapYear == year) {
						ly = "leap";
						february = "29";
					}

					else {

					}

					julianLeapYear += 4;
					// System.out.println(julianLeapYear);
				}
			}

			else if (year >= 1582 && year < 2800) { // Gregorian Calendar
				calendar = "Gregorian Calendar";

				if (year % 100 == 0) {
					if (year % 400 == 0) {
						ly = "leap";
						february = "29";
					}

					else {
						ly = "normal";
					}
				}

				else if (year % 4 == 0) {
					ly = "leap";
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
					february = "29";
				}

				else {
					ly = "normal";
				}
			}

			if (month == "Jan") {
				days = january;
			}

			else if (month == "Feb") {
				days = february;
			}

			else if (month == "Mar") {
				days = march;
			}

			else if (month == "Apr") {
				days = april;
			}

			else if (month == "May") {
				days = may;
			}

			else if (month == "Jun") {
				days = june;
			}

			else if (month == "Jul") {
				days = july;
			}

			else if (month == "Aug") {
				days = august;
			}

			else if (month == "Sep") {
				days = september;
			}

			else if (month == "Oct") {
				days = november;
			}

			else if (month == "Nov") {
				days = november;
			}

			else if (month == "Dec") {
				days = december;
			}

			else if (month == "Wag") {
				days = wages;
			}

			System.out.println("According to the " + calendar + ", " + year + " " + era + " " + wis + " a " + ly
					+ " year and " + month + " " + hads + " " + days + " days in it.");

		}
		count++;
		reader.close();
	}
}

// Month Permutations

// 1, January, Jan*, Ja*, *nu*, 
// 2, February, Feb*, F*, *ru*, 
// 3, March, Mar, Mar*, *ch, *h 
// 4, April, Ap*, *il, *ri* 
// 5, May, May, *ay 
// 6, June, Jun*, *un, *ne 
// 7, July, Jul*, *ul*, *ly,
// 8, August, Aug*, *st, *Au, 
// 9, September, Sept*, *pt 
// 10, October, Oct*, 
// 11, November, Nov*, 
// 12, December, Dec*, 
// 13, Mercedonius Mensis Intercalari, Wages, Wag*,
