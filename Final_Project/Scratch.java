
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
		printer(rawData); // print results
	}

	public static List<List<String>> inputer(List<List<String>> rawData) {
		System.out.println("Address: ");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		if (input != "") {
			String line = input;
			String[] values = line.split("   "); // .split(",");
			rawData.add(Arrays.asList(values));
		}
		return rawData;
	}

	public static List<List<String>> importer(List<List<String>> rawData) {
		String fileName = "/Users/Administrator/Git/Intro_to_Programming/Final_Project/Database.csv";
		File file = new File(fileName);
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
		return rawData;
	}

	public static List<List<String>> finder(List<List<String>> rawData, List<List<String>> cleanedData) {
		// find regex in row 0 in all other slots
		// if found, add to pertinent cleanedList slot
		// for (int i = 0; i < cleanedData.size(); i++) {
		// System.out.println(cleanedData.replaceAll(i));
		// }
		// cleanedData = cleanedData[i].replaceAll(",,", "");
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
		for (int i = 0; i < 8; i++) { // cleanedData.size()
			System.out.println(cleanedData.get(i));
		}
	}

	public static List<List<String>> listCleaner(List<List<String>> rawData) {
		List<List<String>> cleanedData = new ArrayList<>();
		int lineNo = 1;
		for (List<String> line : rawData) {
			int columnNo = 1;
			for (String value : line) {
				String line2 = value;
				// line2 = stringCleaner(line2, rawData);
				finder(cleanedData);
				String[] values = line2.split(",");
				cleanedData.add(Arrays.asList(values));
				columnNo++;
			}
			lineNo++;
		}
		return cleanedData;
	}

	public static String stringCleaner(String input, List<List<String>> rawData) { // removes garbage from input and
																					// database if needed
		String cleanedString = input;
		String cleanPattern = ",";
		cleanedString = cleanedString.replaceAll(cleanPattern, "");
		return cleanedString;
	}

	public static void puller() { // gets info from google maps api
	}

	public static void printer(List<List<String>> cleanedData) { // prints info
		int lineNo = 1;
		for (List<String> line : cleanedData) {
			int columnNo = 1;
			for (String value : line) {
				System.out.println("[" + lineNo + "]" + "[" + columnNo + "] " + value);
				columnNo++;
			}
			lineNo++;
		}
		/*
		 * System.out.println(cleanedData.get(4));
		 * 
		 */

	}

	// ListIterator<List<String>> liter = cleanedData.listIterator();
	Iterator<List<String>> iter = cleanedData.iterator();while(iter.hasNext())
	{
				Iterator<String> siter = iter.next().iterator();
				while (siter.hasNext()) {
					String s = siter.next();
					// System.out.println(s);

					String cleanPattern = ""; // remove dashes //extra spaces
					line = line.replaceAll(cleanPattern, " ");
					try {
					} catch (IndexOutOfBoundsException e) {
					}
					// String regex = regex(k);
					// find inputRow in row (return row)
					// find regex in row or column (return whole row)
					// add found row to next column spot of the last row of cleanedData
					// add closest ten to next column spot of the last row of cleanedData
					// k++; // next regex
					// for (int j = 0; j < cleanedData.get(i).size(); j++) {
					// String column = cleanedData.get(i).get(j).toString();
					// }
				}
				//if (isMatched) {
				//	System.out.println("Matched" + row);
				//}
				//boolean isMatched = row.regionMatches(true, 0, inputRow, 0, inputRow.length());
				// inputRow = inputRow.replaceAll(",|\\*|\\[|\\]|\\:|\\'|\\^|\\?", " ");
				for (int j = 0; j < inputList.size(); j++) {
					inputRow = inputList.get(j).toString();
					
				
				}
				List<List<String>> inputList = new ArrayList<>();
				String[] inputValues = inputRow.split(",");
				inputList.add(Arrays.asList(inputValues));
				inputRow = inputList.toString();