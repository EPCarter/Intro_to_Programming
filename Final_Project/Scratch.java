
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
public class Scratch {
	public static void main(String[] args) {

		double xOne = 41.7606232;
		double xTwo = 41.210068;
		double yOne = -111.8421865;
		double yTwo = -111.940491;
		double distance = 0;

		distance = Math.sqrt(((xTwo - xOne) * (xTwo - xOne)) + ((yTwo - yOne) * (yTwo - yOne)));
		System.out.println(38.38/distance);
	}
}