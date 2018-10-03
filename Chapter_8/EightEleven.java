package Chapter_8;
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 8-11
Date: Oct. 2,  2018
Summary: (Game: nine heads and tails) Nine coins are placed in a 3-by-3 
          matrix with some face up and some face down. You can represent 
          the state of the coins using a 3-by-3 matrix with values 0 (heads)
          and 1 (tails). Here are some examples:
          
              0 0 0     1 0 1     1 1 0     1 0 1     1 0 0
              0 1 0     0 0 1     1 0 0     1 1 0     1 1 1
              0 0 0     1 0 0     0 0 1     1 0 0     1 1 0
              
           Each state can also be represented using a binary number. For example, 
           the preceding matrices correspond to the numbers:
           
              000010000 101001100 110100001 101110100 100111110
              
            There are a total of 512 possibilities, so you can use decimal numbers 
            0, 1, 2, 3, . . . , and 511 to represent all states of the matrix. 
            Write a program that prompts the user to enter a number between 0 and 
            511 and displays the corresponding matrix with the characters H and T.
            
            The user entered 7 , which corresponds to 000000111 . Since 0 stands 
            for H and 1 for T , the output is correct.
*/

import java.util.Scanner;

class eightEleven {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter number: ");
		int input = reader.nextInt();
		reader.close();

		String input2 = Integer.toBinaryString(input);
		char[] inputArray = input2.toCharArray();
		char[] inputArray2 = new char[9];
		int zeros = 9 - input2.length();

		for (int j = 0; j < zeros; j++) {
			inputArray2[j] = 'H';
		}

		for (int j = 0; j < input2.length(); j++) {
			if (inputArray[j] == '0') {
				inputArray2[j + zeros] = 'H';
			} else if (inputArray[j] == '1') {
				inputArray2[j + zeros] = 'T';
			} else {
				inputArray2[j + zeros] = 'U';
			}
		}
		System.out.println(inputArray2[0] + " " + inputArray2[1] + " " + inputArray2[2]);
		System.out.println(inputArray2[3] + " " + inputArray2[4] + " " + inputArray2[5]);
		System.out.println(inputArray2[6] + " " + inputArray2[7] + " " + inputArray2[8]);
	}
}