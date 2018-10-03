
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

import java.util.Scanner;

class eightThirtyseven {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

	}

	String[] states = { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY",
			"LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH",
			"OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY" };

	String[] capitals = { "Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento",
			"Denver Hartford Dover Tallahassee Atlanta Honolulu Boise Springfield Indianapolis Des Moines Topeka Frankfort Baton Rouge Augusta Annapolis Boston Lansing Saint Paul Jackson Jefferson City Helena Lincoln Carson City Concord Trenton Santa Fe Albany Raleigh Bismarck Columbus Oklahoma City Salem Harrisburg Providence Columbia Pierre Nashville Austin Salt Lake City Montpelier Richmond Olympia Charleston Madison Cheyenne" };
}
