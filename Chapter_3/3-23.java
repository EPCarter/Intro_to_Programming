/* 

 "//?" Precede my questions

 Author: Erik Carter
 Email: Carter.Eri7200@stu.stech.edu
 Course: CSCI 1105 - Introduction to Programming
 Assignment: 3-23 //? Can
 Date: Sept. 12, 2018
 
 Summary: (Geometry: point in a rectangle?) Write a program that 
           prompts the user to enter a point (x, y) and checks 
           whether the point is within the rectangle centered at 
           (0, 0) with width 10 and height 5. For example, (2, 2) 
           is inside the rectangle and (6, 4) is outside the rectangle, 
           as shown in Figure 3.7b.
 
           (Hint: A point is in the rectangle if its horizontal distance 
           to (0, 0) is less than or equal to 10 / 2 and its vertical 
           distance to (0, 0) is less than or equal to 5.0 / 2. Test 
           your program to cover all cases.)
 */

import java.util.Scanner; //? Can I import this anywhere so long as it's before it's actually called? (eg. line 23.5)

public class Main {	//? What are the principles in correct naming of classes?	
  public static void main(String[] args) //? What about here?		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Rectangle Width: ");
		float w = reader.nextFloat()/2;
		if(w % 1 <= 0){	
			int w = w  //? Will this overwrite float w as an int w?
		} //? Are my } correct throughout?
		
		System.out.print("Rectangle Height: ");
		float h = reader.nextFloat()/2;
		if(h % 1 <= 0){	
			int h = h
		}	
	
		System.out.print("Enter X Coordinate: ");
		float x = reader.nextFloat();
		if(x % 1 <= 0){	
			int x = x
		}
		
		System.out.print("Enter Y Coordinate: ");
		float y = reader.nextFloat();
		if(y % 1 <= 0){	
			int y = y
		}
	
		reader.close();		
 
/*  
TODO Remove blank decimals (eg. 2.0 >> 2)
 	if(x % 1 <= 0){
   		x = x;     
		}
   	
	if(y % 1 <= 0){
         	y = y;
		}
*/

	if(-w <= x && x <= w && -h <= y && y <= h){
		System.out.println("Coordinates (" + x + ", " + y + ") are Inside (+-"x ", +-" y")";
		}

	else{
		System.out.println("Coordinates (" + x + ", " + y + ") are Outside (+-"x ", +-" y");
		}
	}
}
