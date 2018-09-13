/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 5-33
Date: .  2018
Summary: (Perfect number) A positive integer is called 
          a perfect number if it is equal to the sum of 
          all of its positive divisors, excluding itself. 
          For example, 6 is the first perfect number because 
          6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2 + 1. 
          There are four perfect numbers less than 10,000. 
          Write a program to find all these four numbers.
*/

class fiveThirtythree{
          public static void main(String[] args) {
                    int w = 0;
                    int x = 0;
                    int y = 0;
                    int z = 0;
                    
                   while(x <= 10000){
                     if(x % y <= 0){
                          //y is divisible
                          y++;
                    }
                    else{
                       y++;
                    }
                    
                    
                    System.out.println(z + "is a perfect number.");
                    x++;
          }
}
