
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: Final Project
Date: Oct. 15, 2018
Summary: Display info about points near a given address.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("resource")
public class FinalProject {
	public static void main(String[] args) {
		String input = inputer();
		List<List<String>> cleanedData = importer(input);
		finder(cleanedData);
	}

	public static String inputer() {// Takes an address input
		System.out.println("Address: ");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		return input;
	}

	public static List<List<String>> importer(String input) { // imports csv file to raw array list
		List<List<String>> rawData = new ArrayList<>();
		if (input != "") {
			String line = input;
			String[] values = line.split(",");
			rawData.add(Arrays.asList(values));
		}
		String fileName = "/Users/Administrator/Git/Intro_to_Programming/Final_Project/Database.csv";
		File file = new File(fileName);
		Scanner inputStream;
		try {
			inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String line = inputStream.nextLine();
				String cleanPattern = "-"; // remove dashes
				line = line.replaceAll(cleanPattern, " ");
				String[] values = line.split(",");
				rawData.add(Arrays.asList(values));
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<List<String>> cleanedData = new ArrayList<>();
		cleanedData = rawData; // through cleaner method
		return cleanedData;
	}

	public static void finder(List<List<String>> cleanedData) {
		// 0 = input
		// 1 = title
		// 2 = regex
		// 3 = -blank-
		// 4 = database entry 1

		for (int i = 4; i < cleanedData.size(); i++) {
			String line = cleanedData.get(i).toString();
			for (int j = 0; j < 18; j++) {
				String input = cleanedData.get(0).toString();
				try {
					String regex = cleanedData.get(2).get(j).toString();
					//System.out.println(regex);
					if (input.matches(regex)) {
						System.out.println(line);
					}
				} catch (IndexOutOfBoundsException e) {
				}
			}
		}
	}
}