
		/*
		Author: Erik Carter
		Email: Carter.Eri7200@stu.stech.edu
		Course: CSCI 1105 - Introduction to Programming
		Assignment: 4-17
		Date: Sept. 17,  2018
		Summary: (Days of a month) Write a program that prompts the user to enter a year and the first three letters of a month  name (with the first letter in uppercase) and displays the number of days in the month.
		*/
		
		//import java.util.regex;
		import java.util.Scanner;

class fourSeventeen {
		public static void main(String[] args) {
				
				Scanner reader = new Scanner(System.in);
				System.out.println("Enter Year (YYYY): ");
				int year = reader.nextInt();
				System.out.println("Enter Month (Mmm): ");
				String month = reader.next(); 
				String hads = "has";
				int days = 0;
				String lr = "leap";
							
	//TODO format month correctly (Take three letters, 1st uppercase, 2-3 lowercase)
					
			leapYearList{
				1584 + 4
				
			}	
						
			if(){
				lr = "leap";
			}
			
			else{
				lr = "normal";
			}
			
				if(year < 2018){
					hads = "had";
					}
				
				else{
					hads = "has";
					}
							 
				if(lr == "leap" && month == "Feb"){
					days = 29;
					}
				
				else if(month == "Feb"){
					days = 30;
							 }
				 else{
					days = 31;
							 }
							 
				if(year > 1582){
				//Gregorian 1584AD + 4
					//28 [Feb]
					//29 [Feb]
					//30 [Apr, Jun, Sep, Nov]
					//31 [Jan, Mar, May, Jul, Aug, Oct, Dec]
					}
												
				else if(year >= -45 && year <= 1582){
				//Julian Jan 45BCE - Oct 1582AD
					//28 [Feb]
					//29 [Feb]
					//30 [Apr, Jun, Sep, Nov]
					//31 [Jan, Mar, May, Jul, Aug, Oct, Dec]
					}
												
				else if(year < -45){
				//Roman Republic
					//23 [Wag] //Month of wages (Mercedonius Mensis Intercalari)
					//28 [Feb]
					//29 [Jan, Apr, Jun, Aug, Sep, Nov, Dec]
					//31 [Mar, May, Jul, Oct]
					}

							
			System.out.println("The month of " + month + " in year " + year + " " + hads + " " + days + " days in it, and was a " + lr + " year.");
		}
}
