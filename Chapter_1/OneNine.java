package Chapter_1;

/*
	Author: Erik Carter
	Email: Carter.Eri7200@stu.stech.edu
	Course: CSCI 1105 - Introduction to Programming
	Assignment: 1-9
	Date: Sept. 17, 2018
	Summary: (Area and perimeter of a rectangle) Write a program that displays the area and perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula: area = width * height
*/

class oneNine {
	public static void main(String[] args) {
			
			float width = 4.5f;
			float height = 7.9f;
			float area = width * height;
			float perimeter = (width + height) * 2;
						
			System.out.println("For a Width of: " + width + ", and a Height of: " + height);
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
	}
}
