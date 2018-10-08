
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: Final_Project
Date: .  2018
Summary: Think of a project that uses multiple items you have learned 
         from this class (using arrays is required). Please create a 
         write-up proposal for your project following the format stated below.

              1. Introduction: Overview of your project (1 paragraph)
              2. Target Population: Who are you directing this software and 
                  what are you doing to make it appeal to them? (2 paragraphs)
              3. Purpose to the consumer: what makes your program unique, 
                  what makes it a better option than other software or is 
                  there a lack of software in this field? Is it helpful, how so? 
                  (3 paragraphs)
              4. Constraints: List possible bugs and what factors you will 
                  be considering beforehand to avoid those bugs. (Numbered list 
                  and 2 paragraphs)
              5. Conclusion: Why you are moving forward with this project. 
                  Overview of project strategy. (1 - 2 paragraphs)
                  
           GitHub is a great way to market your product and show off your code.  
           The formatting and information of your README page is especially helpful 
           to give your target audience the best impression of your code.  Here is
           a template (Links to an external site.)Links to an external site. for a 
           GitHub README page along with general guidelines (Links to an external 
           site.)Links to an external site. to follow and reasons (Links to an external 
           site.)Links to an external site.why someone wouldn't use your code.  Read 
           through these and use Mr. Perkins's Angular.io repository to help shape 
           your own README page.
           
           Please add all files needed to run your code, a JavaDoc for your code, 
           and a README for your project using the examples above onto your GitHub 
           and submit the link here.
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@SuppressWarnings("resource")

class finalProject {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() { // rewrite to take menu options for submenu
		System.out.println("-------------------------------------");
		System.out.println("What would you like to do?");
		System.out.println();
		int menuItems = 7;
		int a = 0;
		String b = "";
		for (int j = 0; j < menuItems; j++) {
			switch (j) {
			case 0:
				b = "Exit";
				break;
			case 1:
				b = "Menu";
				break;
			case 2:
				b = "Import Data";
				break;
			case 3:
				b = "Fill in Data Gaps";
				break;
			case 4:
				b = "Location Lookup";
				break;
			case 5:
				b = "Estimates";
				break;
			case 6:
				b = "Add Data";
				break;
			case 7:
				b = "Upload";
				break;
			default:
				b = "Menu";
				break;
			}
			System.out.println(a + ": " + b);
			a++;
		}

		System.out.println("-------------------------------------");
		Scanner reader = new Scanner(System.in);
		int inputCleaned = Integer.parseInt(reader.nextLine());

		switch (inputCleaned) {
		case 0:
			System.exit(0);
			break;
		case 1:
			menu();
			break;
		case 2:
			dataImport();
			menu();
			break;
		case 3:
			gaps();
			menu();
			break;
		case 4:
			query();
			menu();
			break;
		case 5:
			estimates();
			menu();
			break;
		case 6:
			addData();
			menu();
			break;
		case 7:
			upload();
			menu();
			break;
		default:
			break;
		}
	}

	public static void dataImport() {
		// download file
		// https://docs.google.com/spreadsheets/d/1vKJRWIkHcJ-InBp9SUJOUAAQYrGQhXxxlQG3IeLvIPg/edit?usp=sharing
		String fileName = "/Users/Administrator/Git/Intro_to_Programming/Final_Project/UncleanedData.csv";
		File file = new File(fileName);
		List<List<String>> lines = new ArrayList<>();
		Scanner inputStream;
		try {
			inputStream = new Scanner(file);
			while (inputStream.hasNext()) {
				String line = inputStream.nextLine();
				String[] values = line.split(",");
				lines.add(Arrays.asList(values));
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		arrayList(lines);
		dataCleanup(lines);
	}

	public static void dataCleanup(List<List<String>> lines) {
		// find things and put copy in right place
		// query into array 0, others into 1+
		// Read line (all columns)
		// find street address
		// find city
		// find state
		// find zip
		// find zip+4
		// find county
		// find north/south
		// find what
		// find how deep
		// find total cost
		// find realtor
		// find phone number
		// find everything else
	}

	public static void gaps() {
		// google search return string
		// return results that match (or votes for return match)
	}

	public static List<String> inputCleanup(String input) {
		// format given string to array[0] boxes
		List<String> inputData = new ArrayList<>();
		// input to array
		return inputData;
	}

	public static void query() {
		// check arary[0] against all other boxes
		// return matches
		// math on matches
		Scanner reader = new Scanner(System.in);
		System.out.print("Location lookup: ");
		String input = reader.nextLine();
		inputCleanup(input);
		lookup(input);
		printOut(input);
	}

	public static void lookup(String input) {
		// clean input
		// compare
		// averages for area
	}

	public static void arrayList(List<List<String>> lines) {
		int lineNo = 1;
		for (List<String> line : lines) {
			int columnNo = 1;
			for (String value : line) {
				System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
				columnNo++;
			}
			lineNo++;
		}
	}

	public static void addData() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Data to add: ");
		String input = reader.nextLine();
		inputCleanup(input);
		List<String> inputData = new ArrayList<>();
		// dataCleanup(inputData);
		// append data to
		// "/Users/Administrator/Git/Intro_to_Programming/Final_Project/UncleanedData.csv";
	}

	public static void estimates() {
		// data = ;
		// addData(data);
	}

	public static void upload() {
		// https://docs.google.com/spreadsheets/d/1vKJRWIkHcJ-InBp9SUJOUAAQYrGQhXxxlQG3IeLvIPg/edit?usp=sharing
	}

	public static void printOut(String input) {
		String address = "";
		String city = "";
		String state = "";
		String county = "";
		String zip = "";
		String plusFour = "";
		String northSouth = "";
		String type = "";
		String depth = "";
		String cost = "";
		String avgCost = "";
		String avgDepth = "";
		String realtor = "";
		String realtorAddress = "";
		String phoneNumber = "";
		String email = "";

		System.out.println(
				address + ", " + city + ", " + state + ", " + county + ", " + zip + "-" + plusFour + ", " + northSouth);
		System.out
				.println(type + ": " + depth + "ft (" + avgDepth + "ft avg.) $" + cost + " (*" + avgCost + " avg cost");
		System.out.println(realtor + " " + realtorAddress + " " + phoneNumber + " " + email);
	}
}