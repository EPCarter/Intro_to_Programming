import java.util.Scanner;
import java.util.*;

public class fourTwentyThree{
	public static void main(String[] args) {
	
						 Scanner reader = new Scanner(System.in);
					
						 
						//name
						System.out.print("Employee’s name (e.g., Smith): ");
						 String name = reader.nextLine();
						
						
						 //hours
						 float hours = 0;
						 float hoursPre = 0;
						
					while(hoursPre <= 0 ){	
						try{
							System.out.print("Number of hours worked in a week (e.g., 10): ");
							hoursPre = reader.nextFloat();
							} 
						
						catch(InputMismatchException ex){
							hoursPre = 0;
							System.out.print("Enter a number: ");
							hoursPre = reader.nextFloat();
							}						
										
						}
								
						hours = hoursPre;

						//pay rate			
						 System.out.print("Hourly pay rate (e.g., 9.75): $");
						 float prePayRate = reader.nextFloat();
						 float payRate = 0;
						
							while(prePayRate < 0 ){
								System.out.print("Enter a positive number: ");    
					 			prePayRate = reader.nextFloat();
								}
						
								payRate = prePayRate;
								
						//fed rate
						 System.out.print("Federal tax withholding rate (e.g., 20%): ");
						 float preFedTaxRate = reader.nextFloat();
						 float fedTaxRate = 0;
							
							while(preFedTaxRate < 0 ){
								System.out.print("Enter a positive number: ");
								preFedTaxRate = reader.nextFloat();
						}
						
						 fedTaxRate = preFedTaxRate;
						 
						//state rate
						 System.out.print("State tax withholding rate (e.g., 9%): ");
						 float preStateTaxRate = reader.nextFloat();
						 float stateTaxRate = 0;
						
							while(preStateTaxRate < 0 ){
								System.out.print("Enter a positive number: ");
								preStateTaxRate = reader.nextFloat();
						}
						
						 stateTaxRate = preStateTaxRate;
						
						//Print
						 System.out.println();
						 System.out.println("Employee’s Name:  " + name);
						 System.out.println("Hours per Week:   " + hours + " hrs/wk");
						 System.out.println("Hourly pay rate:  $" + payRate + " /hr");
						 System.out.println("Federal tax rate: " + fedTaxRate + "%");
						 System.out.println("State tax rate:   " + stateTaxRate + "%");
						 
			}
}
