/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 5-11
Date: .  2018
Summary: (Find numbers divisible by 5 or 6, but not both) 
					Write a program that displays all the numbers 
					from 100 to 200, ten per line, that are divisible 
					by 5 or 6, but not both. Numbers are separated by 
					exactly one space.
*/

public class fiveEleven{
	public static void main(String[] args) {
	
int x = 100;
float w = -1;
float y = -1;
float z = -1;
float zz = -1;
//Object[] numberArray = {,,,,,,,,,}; //arr.length
System.out.println("x = " + x);
	while(x <= 200){
		z = x % 5;
		zz = x % 6;
		
		if(z <= 0 && zz <= 0){
		w = x; 
		System.out.println("%5$%6: " + y);	
		} 
	
	else if(z <= 0) {
		y = x;
		System.out.println("%5: " + y);
		//push to array	
		}
	
	else if(zz <= 0) {
		y = x;
		System.out.println("%6: " + y);
		//push to array	
		}
	
	else{
		System.out.println("Not: " + x);
		}	
	
			x++;
		}
	//print array

	}
}
