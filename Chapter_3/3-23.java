package com.example;
import java.util.Scanner;

public class Main {

		
  public static void main(String[] args) {
  

		
		Scanner reader = new Scanner(System.in);
		System.out.print("Rectangle Width: ");
		float w = reader.nextFloat()/2;
		
		System.out.print("Rectangle Height: ");
		float h = reader.nextFloat()/2;
		
		System.out.print("Enter X Coordinate: ");
		float x = reader.nextFloat();

		System.out.print("Enter Y Coordinate: ");
		float y = reader.nextFloat();
		
		reader.close();
		
   if(x % 1 <= 0){
   x = x;     
}
   if(y % 1 <= 0){
         y = y;
}


	if(-w <= x && x <= w && -h <= y && y <= h){
		System.out.println("Coordinates (" + x + ", " + y + ") are Inside box");
	}

else{		System.out.println("Coordinates (" + x + ", " + y + ") are Outside box");
	}
}
}