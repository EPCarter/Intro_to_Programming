
/*
	Author: Erik Carter
	Email: Carter.Eri7200@stu.stech.edu
	Course: CSCI 1105 - Introduction to Programming
	Assignment: 4-17
	Latest Update: Sept. 17,  2018
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
		int year = 2801;
		String month = "Jan"; // (1-13)
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

/*
 * Month Permutations
 * 
 * 1, January, Jan*, Ja*, *nu*, 2, February, Feb*, F*, *ru*, 3, March, Mar,
 * Mar*, *ch, *h 4, April, Ap*, *il, *ri* 5, May, May, *ay 6, June, Jun*, *un,
 * *ne 7, July, Jul*, *ul*, *ly, 8, August, Aug*, *st, *Au, 9, September, Sept*,
 * *pt 10, October, Oct*, 11, November, Nov*, 12, December, Dec*, 13,
 * Mercedonius Mensis Intercalari, Wages, Wag*,
 * 
 ** 
 * 
 * // import java.util.regex; //import java.util.Scanner;
 *****
 * 
 * String ly = "normal"; int days =
 * 0;*System.out.print("Enter a year (YYYY): "); int year =
 * reader.nextInt();**if(year>=2800) { // Revised Julian (after 1923 CE) if
 * (year % 900 == 200 || year % 900 == 600) { ly = "normal"; }
 * 
 * else if (year % 100 == 0) { ly = "normal"; }
 * 
 * else if (year % 4 == 0) { ly = "leap"; }
 * 
 * else { ly = "normal"; } }**else if(year>=1582&&year<2800) { // Gregorian
 * (After AD 1582 CE) if (year % 400 == 0) { ly = "leap"; if (year % 100 == 0) {
 * ly = "normal"; } }
 * 
 * else if (year % 4 == 0) { ly = "leap"; }
 * 
 * else { ly = "normal"; } }**else if(year<1582&&year>-45) { // Julian ( After
 * 45 BCE and 12 CE) if (year < 12) { int earlyJulianLeapYears = year;
 * System.out.println("Leap Years during this time period included: ");
 * 
 * while (earlyJulianLeapYears < 12) { earlyJulianLeapYears += 3;
 * System.out.print(earlyJulianLeapYears + ", ");
 * 
 * if (earlyJulianLeapYears == year) { ly = "leap"; } else { ly = "normal"; } }
 * 
 * 
 * int JulianLeapYears = 12; while(JulianLeapYears < 1582){ JulianLeapYears +=
 * 4; if(JulianLeapYears == year){ ly = "leap";
 * 
 * 
 * else{ ly = "normal"; }
 * 
 * 
 * } }
 * 
 * 
 * else{ System.out.println("How did you get in here? Error 001"); String
 * error001 = Scanner.nextString();
 * 
 * File file = new File("error001.txt"); PrintWriter writer = new
 * PrintWriter(error001.txt); writer.write(error001.txt);
 * //~/Desktop/Calendar/error001.txt }
 * 
 * 
 * if (year < -45) { ly = "normal"; }
 * 
 * 
 * else{ System.out.println("How did you get in here? Error 002"); String
 * error002 = Scanner.nextString();
 * 
 * File file = new File("error002.txt"); PrintWriter writer = new
 * PrintWriter(error002.txt); writer.write(error002.txt); }
 * 
 * 
 * String hads = "has"; String wis = "is";
 * 
 * if (year < 2018) { hads = "had"; wis = "was"; }
 * 
 * else { hads = "has"; wis = "is"; }
 * 
 * System.out.print("Enter a month (Mmm): "); String month = reader.next();
 * 
 * if (ly == "leap" && month == "Feb") { days = 29; }
 * 
 * else if (month == "Feb") { days = 28; }
 * 
 * else if (year >= 1582) {
 * 
 * 
 * if(month == [Apr, Jun, Sep, Nov]){ days = 30; }
 * 
 * else if(month == [Jan, Mar, May, Jul, Aug, Oct, Dec]){ days = 31; }
 * 
 * else{
 * 
 * }
 * 
 * }
 * 
 * else if (year < 1582 && year > -45) {
 * 
 * 
 * if(month == [Apr, Jun, Sep, Nov]){ days = 30; }
 * 
 * else if(month == [Jan, Mar, May, Jul, Aug, Oct, Dec]){ days = 31; }
 * 
 * else{ System.out.println("Error 004"); }
 * 
 * }
 * 
 * else if (year < -45) { // Roman Republic if (month == "Wag") { // Month of
 * wages (Mercedonius Mensis Intercalari) days = 24; }
 * 
 * else if(month == [Jan, Apr, Jun, Aug, Sep, Nov, Dec]){ days = 29; }
 * 
 * else if(month == [Mar, May, Jul, Oct]){ days = 31; }
 * 
 * else{ System.out.println("Error 005"); } }
 * 
 * else{ System.out.println("How did you get in here? Error 003"); String
 * error003 = Scanner.nextString();
 * 
 * File file = new File("error003.txt"); PrintWriter writer = new
 * PrintWriter(error003.txt); writer.write(error003.txt); }
 * 
 * System.out.println("The month of " + month + " in year " + year + " " + hads
 * + " " + days + " days in it, and" + wis + " a " + ly + " year.");
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * System.out.println("Enter a date: "); //accept any permutation //room for: (a
 * day) (a month) (a year) (a day of the week) (a day of the year) (holiday)
 * 
 * mar || 03 || 3 || march || Mar || nar || *arch || *rch || *ch || **h**
 * 
 * January February March April May June July August September October November
 * December
 * 
 * uary Ju t t**** ember J* F M
 * 
 * int intArray[];** // TODO format month correctly (Take three letters, 1st
 * uppercase, 2-3 lowercase)**for( int i =
 * 0;i<arr.length;i++)System.out.println("Element at index "+*i+" : "+arr[i]);*
 */
