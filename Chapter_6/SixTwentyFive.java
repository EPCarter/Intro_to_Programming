//package Chapter_6;
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 6-25
Date: .  2018
Summary: (Convert milliseconds to hours, minutes, and seconds) 
          Write a method that converts milliseconds to hours, 
          minutes, and seconds using the following header:
          
              public static String convertMillis(long millis)
              
          The method returns a string as hours:minutes:seconds. 
          For example, convertMillis(5500) returns a string 0:0:5, 
          convertMillis(100000) returns a string 0:1:40, and 
          convertMillis(555550000) returns a string 154:19:10.
*/

import java.util.Scanner;

class SixTwentyFive {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			input();
		}
	}

	public static void input() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter milliseconds: ");
		long millis = reader.nextLong();
		System.out.println(convertMillis(millis));
	}

	public static String convertMillis(long millis) {
		long millisInHr = 3600000;
		long millisInMin = 60000;
		long millisInSec = 1000;

		long hrInMillis = millis / millisInHr;
		long minInMillis = (millis - (hrInMillis * millisInHr)) / millisInMin;
		long secInMillis = (millis - (hrInMillis * millisInHr) - (minInMillis * millisInMin)) / millisInSec;

		int hr = (int) (hrInMillis);
		int min = (int) (minInMillis);
		int sec = (int) (secInMillis);

		String convert = hr + ":" + min + ":" + sec;
		return convert;
	}
}
