		
/*
		Author: Erik Carter
		Email: Carter.Eri7200@stu.stech.edu
		Course: CSCI 1105 - Introduction to Programming
		Assignment: 3-3
		Date: Sept. 17  2018
		Summary: (Algebra: solve 2 * 2 linear equations) A linear equation can 
							be solved using Cramer’s rule given in Programming Exercise 1.13
							(shown below). Write a program that prompts the user to enter 
							a, b, c, d, e, and f and displays the result. If ad - bc is 0, 
							report that “The equation has no solution.”
									
									ax + by = e
									cx + dy = f
									x = (ed - bf) / (ad - bc)
									y = (af - ec) / (ad - bc)

							(Hint: Only solve the equations below if ad - bc is not 0.)
*/

import java.util.Scanner;

class threeThree {
		public static void main(String[] args) {
				Scanner reader = new Scanner(System.in);
				
				System.out.print("Enter 0 for Example: ");
				double zero = reader.nextDouble();
				double a = 0;
				double b = 0;
				double c = 0;
				double d = 0;
				double e = 0;
				double f = 0;
				double x = 0;
				double y = 0;
				
				
		if(zero == 0){
				a = 3.4;
					System.out.println("a = " + a);
				b = 50.2;
					System.out.println("b = " + b);
				c = 2.1;
					System.out.println("c = " + c);
				d = 0.55;
					System.out.println("d = " + d);
				e = 44.5;
					System.out.println("e = " + e);
				f = 5.9;
					System.out.println("f = " + f);	
					
				x = ((e * d) - (b * f)) / ((a * d) - (b * c)); 
				y = ((a * f) - (e * c)) / ((a * d) - (b * c));
				
				}
				
		else{
			
					System.out.print("Input a: ");
					a = reader.nextDouble();
				
					System.out.print("Input b: ");
					b = reader.nextDouble();
				
					System.out.print("Input c: ");
					c = reader.nextDouble();
				
					System.out.print("Input d: ");
					d = reader.nextDouble();
				
					System.out.print("Input e: "); 
					e = reader.nextDouble();
				
					System.out.print("Input f: ");
					f = reader.nextDouble();
					
					x = ((e * d) - (b * f)) / ((a * d) - (b * c)); 
					y = ((a * f) - (e * c)) / ((a * d) - (b * c));	
				 }
				
						
		double test = (a * d) - (b * c);					
		
		if(test == 0){
			System.out.println("The equation has no solution.");
			}	

			else{						
			System.out.println("The Answer is: (" + x + ", " + y + ")");
			}
		}
	}
