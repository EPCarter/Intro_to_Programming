
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: Final Project
Date: Oct. 17, 2018
Summary: Display info about points near a given address.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@SuppressWarnings("resource")
public class FinalProject {
	public static void main(String[] args) {
		List<List<String>> inputList = new ArrayList<>();
		inputList = inputer(); // gets address to query
		List<List<String>> cleanedData = importer(); // adds it to first line of data, imports csv
		String[] myList = finder(cleanedData, inputList); // searches database for input
		myList = multiCheck(myList, inputList);
		printer(myList); // prints found matches
	}

	public static List<List<String>> inputer() {// Takes an address input
		System.out.println("Lookup: ");
		Scanner reader = new Scanner(System.in);
		String input = cleaner(reader.nextLine());
		List<List<String>> inputList = new ArrayList<>();
		if (input != "") {
			String[] values = input.split(" "); // splits input values by space for search criteria
			inputList.add(Arrays.asList(values)); // add input to raw array
		}
		return inputList;
	}

	public static List<List<String>> importer() { // imports csv file to raw array list
		List<List<String>> rawData = new ArrayList<>();
		String fileName = "/Users/Administrator/Git/Intro_to_Programming/Final_Project/Database.csv";
		File file = new File(fileName);
		Scanner inputStream;
		try {
			inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String line = cleaner(inputStream.nextLine());
				String[] values = line.split(","); // split inputs by comma
				rawData.add(Arrays.asList(values)); // add to array starting at row 1
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		List<List<String>> cleanedData = new ArrayList<>();
		cleanedData = rawData; // room for database cleanup method if needed
		return cleanedData;
	}

	public static String[] finder(List<List<String>> cleanedData, List<List<String>> inputList) {
		List<List<String>> found = new ArrayList<>(); // new array for found entries from database
		for (int j = 0; j < inputList.get(0).size(); j++) { // iterate for input criteria number
			String inputItem = inputList.get(0).get(j).toString();
			for (int i = 1; i < cleanedData.size(); i++) { // iterate database entries
				String row = cleanedData.get(i).toString(); // get database row
				boolean contains = (row.toUpperCase().contains(inputItem.toUpperCase()));
				if (contains) { // check if criteria matches row
					found.add(Arrays.asList(row)); // put found row in found array
				}
			}
		}
		String founded = found.toString(); // grab all found entries
		String[] founds = founded.split(","); // split them up
		return founds; // including found rows in last row
	}

	public static String[] multiCheck(String[] myList, List<List<String>> inputList) {
		List<List<String>> multiCheckArray = new ArrayList<>();
		for (int b = 0; b < myList.length; b++) {
			int counter = 0;
			for (int a = 0; a < inputList.get(0).size(); a++) {
				if (cleaner(myList[b]).contains(cleaner(inputList.get(0).get(a).toString()))) {
					counter++;
					if (counter == inputList.get(0).size()) {
						multiCheckArray.add(Arrays.asList(myList[b]));
					}
				}
			}
		}
		String[] multiCheck = multiCheckArray.toString().split(",");
		return multiCheck;
	}

	public static String regex(int k) { // differentiating data types from database rows
		String regex = "";
		String address = "()"; // number word word
		String city = "()"; // word
		String state = "(UT|NV)"; // always ut or nv
		String zip = "(8{4,8})"; // always 5 digit (maybe +4) 8****
		String lon = "()"; // always pos 2 digit
		String lat = "()"; // always neg 3 digit
		String type = "()"; // word
		String distance = "()";
		
		switch (k) { // iterate k for each data type to find
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

	public static void printer(String[] myList) {
		for (int i = 0; i < myList.length; i++) {
			try {
				String output = cleaner(myList[i]);
				System.out.println(output);
			} catch (IndexOutOfBoundsException e) { // todo figure out what's up
			}
		}
	}

	public static String cleaner(String toClean) { // removes most punctuation
		String cleanedString = toClean.replaceAll("\\,|\\*|\\(|\\)|\\[|\\]|\\:|\\'|\\^|\\?|\"|\\.", " ");
		cleanedString = cleanedString.replaceAll("\\s{2,}", " "); // removes extra spaces
		cleanedString = cleanedString.replaceAll("\\s{2,}", " ");
		cleanedString = cleanedString.toUpperCase();
		return cleanedString;
	}
}