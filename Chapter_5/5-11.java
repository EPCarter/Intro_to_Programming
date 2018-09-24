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
		int y = 2;
		
		while(x <= 200 && x >= 100 ){	
			if(x % 5 == 0 && x % 6 == 0){
				x++;
			}
			else if(x % 5 == 0 || x % 6 == 0){		
				System.out.print(x + " ");
				x++;
				
				if(y <= 10){
					y++;
				}
				else{
					System.out.println();
					y = 2;
				}
			}
			else{
				x++;
			}
		}
	}
}
