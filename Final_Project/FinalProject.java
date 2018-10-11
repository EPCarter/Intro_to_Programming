
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
public class FinalProject {
	public static void main(String[] args) {
		String input = inputer();
		List<List<String>> cleanedData = importer(input);
		printer(cleanedData);
	}

	public static String inputer() {// Takes address input
		System.out.println("Address: ");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		return input;
	}

	public static List<List<String>> importer(String input) { // imports csv file to raw array list
		String fileName = "/Users/Administrator/Git/Intro_to_Programming/Final_Project/Database.csv";
		File file = new File(fileName);
		List<List<String>> rawData = new ArrayList<>();
		List<List<String>> cleanedData = new ArrayList<>();

		if (input != "") {
			String line = input;
			String[] values = line.split("   "); // .split(",");
			rawData.add(Arrays.asList(values));
		}

		Scanner inputStream;
		try {
			inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String line = inputStream.nextLine();
				String[] values = line.split("   "); // .split(",");
				rawData.add(Arrays.asList(values));
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		cleanedData = listCleaner(rawData);
		return cleanedData;
	}

	public static List<List<String>> listCleaner(List<List<String>> rawData) {
		List<List<String>> cleanedData = new ArrayList<>();
		int lineNo = 1;
		for (List<String> line : rawData) {
			int columnNo = 1;
			for (String value : line) {
				String line2 = value;
				line2 = stringCleaner(line2, rawData);
				String[] values = line2.split("   "); // .split(",");
				cleanedData.add(Arrays.asList(values));
				columnNo++;
			}
			lineNo++;
		}
		return cleanedData;
	}

	public static String stringCleaner(String input, List<List<String>> rawData) { // finds data in given string
		String cleanedString = input;
		// compare to array spot
		// for (int i = 0; i < rawData.size(); i++) {
		// if(rawData[i].matches(input)) { //if input matches array spot i
		System.out.println("add to array at spot i");

		// }
		// cleanedString = cleanedString.replaceAll(cleanPattern, "");
		return cleanedString;

	}

	public static void puller() { // gets info from google maps api
	}

	public static void printer(List<List<String>> cleanedData) { // prints array
		int lineNo = 1;
		for (List<String> line : cleanedData) {
			int columnNo = 1;
			for (String value : line) {
				System.out.println("[" + lineNo + "]" + "[" + columnNo + "]-" + value);
				columnNo++;
			}
			lineNo++;
		}
	}
}