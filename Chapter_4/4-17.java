
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

		System.out.print("Enter a date: ");
		String date = reader.next();
		reader.close();

		String calendar = "Gregorian Calendar";
		String hads = "has"; // or " had ";
		String wis = "is"; // or " was ";
		String ly = "normal"; // or " leap ";
		String month = "Jan"; // (1-13)
		int year = 2018;
		int days = 0; // (1-31)
		int day = 1; // (1-31)
		String era = "CE";

		if (year <= 2018) { // current year call is better
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
		}

		else if (year >= -45 && year < 12) { // Early Julian Calendar
			calendar = "Early Julian Calendar";
			int earlyJulianLeapYear = -45;

			while (earlyJulianLeapYear < 12) {
				if (year == earlyJulianLeapYear) {
					ly = "leap";
				}

				else {
					// earlyJulianLeapYear += 3;
				}

				earlyJulianLeapYear += 3;
				// System.out.println(earlyJulianLeapYear);
			}
		} else if (year >= 12 && year < 1582) { // Julian Calendar
			calendar = "Julian Calendar";
			int julianLeapYear = 12;

			while (julianLeapYear <= 1576) {
				if (julianLeapYear == year) {
					ly = "leap";
				}

				else {
					ly = "normalish";
				}

				julianLeapYear += 4;
				System.out.println(julianLeapYear);
			}
		}

		else if (year >= 1582 && year < 2800) { // Gregorian Calendar
			calendar = "Gregorian Calendar";

			if (year % 400 == 0) {
				ly = "leap";
			}

			else if (year % 100 == 0) {
				ly = "normal";
			}

			else if (year % 4 == 0) {
				ly = "leap";
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
			}

			else {
				ly = "normal";
			}
		}

		System.out.println("According to the " + calendar + ", " + year + " " + era + " " + wis + " a " + ly
				+ " year and " + month + " " + hads + " " + +days + " days in it.");

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
