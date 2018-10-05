//package Chapter_6;

/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 6-37
Date: Oct. 4 2018
Summary: (Format an integer) Write a method with the following 
          header to format the inte- ger with the specified width.
          
              public static String format(int number, int width)
              
          The method returns a string for the number with one or 
          more prefix 0s. The size of the string is the width. For 
          example, format(34, 4) returns 0034 and format(34, 5) 
          returns 00034. If the number is longer than the width, 
          the method returns the string representation for the number.
          For example, format(34, 1) returns 34.

          Write a test program that prompts the user to enter a number
          and its width and displays a string returned by invoking 
          format(number, width).
*/
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("resource")
class SixThirtyseven {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			input();
		}
	}

	public static void input() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = reader.nextInt();
		System.out.println("Enter the width: ");
		int width = reader.nextInt();
		System.out.println(format(number, width));
	}

	public static String cleaner(String format) {
		String cleanedFormat = format;
		String cleanPattern = "(\\[+|\\]+|,+|\\s+)";
		cleanedFormat = cleanedFormat.replaceAll(cleanPattern, "");
		return cleanedFormat;
	}

	public static String format(int number, int width) {
		String format = "";
		String cleanedFormat = "";
		for (int i = 0; i < width; i++) {
			ArrayList<Integer> formatList = new ArrayList<Integer>(width);
			for (int j = 0; j < width - String.valueOf(number).length(); j++) {
				formatList.add(0);
			}
			formatList.add(number);
			format = formatList.toString();
			cleanedFormat = cleaner(format);
		}
		return cleanedFormat;
	}
}