
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: Final Project
Date: Oct. 10, 2018
Summary: Display info about points near a given address.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@SuppressWarnings("resource")
public class Scratch {
	public static void main(String[] args) {
		List<List<String>> rawData = new ArrayList<>();
		List<List<String>> cleanedData = new ArrayList<>();
		inputer(rawData); // get user address input
		importer(rawData); // get database
		finder(rawData, cleanedData); // find criteria for new list
		filler(cleanedData); // google search for missing
		comparer(cleanedData); // compare input to others
		printer(cleanedData); // print results
	}

	public static List<List<String>> inputer(List<List<String>> rawData) {
		System.out.println("Address: ");
		System.out.println("Address: ");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		return rawData;
		// scanner input
		// add to rawData
	}

	public static List<List<String>> importer(List<List<String>> rawData) {
		// import cvs file
		// add to rawData
		return rawData;
	}

	public static List<List<String>> finder(List<List<String>> rawData, List<List<String>> cleanedData) {
		// find regex in row 0 in all other slots
		// if found, add to pertinent cleanedList slot
		return cleanedData;
	}

	public static List<List<String>> filler(List<List<String>> cleanedData) {
		// google search
		// add to pertinent gaps in cleanedData
		return cleanedData;
	}

	public static List<List<String>> comparer(List<List<String>> cleanedData) {
		// math on distance
		// add to new list
		return cleanedData;
	}

	public static void printer(List<List<String>> cleanedData) {
		// print top ten distance list of type
		System.out.println(".");
	}
}