
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: Final Project
Date: Oct. 16, 2018
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
		finder(cleanedData);
		printer(cleanedData);
	}

	public static String inputer() {// Takes an address input
		System.out.println("Lookup (comma for more criteria): ");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		return input;
	}

	public static List<List<String>> importer(String input) { // imports csv file to raw array list
		List<List<String>> rawData = new ArrayList<>();
		if (input != "") {
			String inputRow = input;
			String[] values = inputRow.split(",");
			rawData.add(Arrays.asList(values));
		}
		String fileName = "/Users/Administrator/Git/Intro_to_Programming/Final_Project/Database.csv";
		File file = new File(fileName);
		Scanner inputStream;
		try {
			inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String line = cleaner(inputStream.nextLine());
				String[] values = line.split(",");
				rawData.add(Arrays.asList(values));
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<List<String>> cleanedData = new ArrayList<>();
		cleanedData = rawData;
		return cleanedData;
	}

	public static List<List<String>> finder(List<List<String>> cleanedData) {
		List<List<String>> found = new ArrayList<>();
		for (int j = 0; j < cleanedData.get(0).size(); j++) {
			for (int i = 1; i < cleanedData.size(); i++) {
				String inputRow = cleanedData.get(0).get(j).toString();
				String row = cleanedData.get(i).toString();
				boolean contains = row.toUpperCase().contains(inputRow.toUpperCase());
				if (contains) {
					found.add(Arrays.asList(row));
				}
			}
		}
		String founded = found.toString();
		String[] founds = founded.split(",");
		cleanedData.add(Arrays.asList(founds));
		return cleanedData; // including found rows in last row
	}

	public static String regex(int k) {
		String regex = "";
		String address = "()"; // number word word
		String city = "()"; // word
		String state = "(UT|NV)"; // always ut or nv
		String zip = "()"; // always 5 digit (maybe +4)
		String lon = "()"; // always pos 2 digit
		String lat = "()"; // always neg 3 digit
		String type = "()"; // word

		switch (k) {
		case 1:
			regex = address;
			break;
		case 2:
			regex = city;
			break;
		case 3:
			regex = state;
			break;
		case 4:
			regex = zip;
			break;
		case 5:
			regex = lon;
			break;
		case 6:
			regex = lat;
			break;
		case 7:
			regex = type;
			break;
		default:
			regex = "";
			break;
		}
		return regex;
	}

	public static void printer(List<List<String>> cleanedData) {
		for (int i = 0; i < cleanedData.get(cleanedData.size() - 1).get(0).length(); i++) {
			try {
				String output = cleaner(cleanedData.get(cleanedData.size() - 1).get(i));
				System.out.println(output);
			} catch (IndexOutOfBoundsException e) { // figure out what's up
			}
		}
	}

	public static String cleaner(String toClean) {
		String cleanedString = toClean.replaceAll("\\,|\\*|\\(|\\)|\\[|\\]|\\:|\\'|\\^|\\?|\"|\\.", " ");
		cleanedString = cleanedString.replaceAll("\\s{2,}", " ");
		cleanedString = cleanedString.replaceAll("\\s{2,}", " ");
		return cleanedString;
	}
}