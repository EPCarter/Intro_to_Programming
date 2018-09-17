/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 1-13
Date: .  2018
Summary: (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
						
						ax + by = e
						x = (ed - bf) / (ad - bc)
						cx + dy - f
						y = (af - ec) / (ad - bc)
					
					Write a program that solves the following equation and displays the value for x and y:
						3.4x + 50.2y = 44.5
						2.1x + 0.55y = 5.9

					(Hint: Use the equations given first to identify what numeric value replaces which number. In this case, a is 3.4.)
					
					x = (ed - bf) / (ad - bc)
					cx = dy - f
					y = (af - ec) / (ad - bc)
					
					3.4x + 50.2y - 44.5 = 2.1x + 0.55y - 5.9
					1.3x + 49.65y - 38.6 = 0
*/

public class oneThirteen{	
	public static void main(String[] args) {		
	
				
				
				float x = 1;
					//x = (-33.1f * y) + 29.69f;
				float y = 1;
					//y = (-.0261f * x) + 0.77744f;
				System.out.println("X = " + x);
				System.out.println("Y = " + y);
	}
}

/*
			String firstEq = "3.4x + 50.2y = 44.5";
			String secondEq = "2.1x + 0.55y = 5.9";
			float aOne = 3.4f;
			float bOne = 50.2f;
			float aTwo = 2.1f;
			float bTwo = 0.55f;
			float cOne = ((dOne * yOne) - fOne) / xOne;
			float dOne = ((cOne * xOne) + fOne) / yOne;
			float c = ((d * y) - f) / x;
			float d = ((c * x) + f) / y;
			float eOne = 0;
			float eTwo = 0;
			float f = 0;
			float f = 0;
			float xOne = ((eOne * d) - (bOne * f)) / ((aOne * d) - (bOne * c));
			float yOne = ((aOne * f) - (eOne * c)) / ((aOne * d) - (bOne * c));
			float xTwo = ((eTwo * d) - (bTwo * f)) / ((aTwo * d) - (bTwo * c));
			float yTwo = ((eTwo * d) - (bTwo * f)) / ((aTwo * d) - (bTwo * c));

System.out.println("For the equations (ax + by = e): " + firstEq + " and " + secondEq + ": ");
System.out.println("");
System.out.println("xOne = " + xOne);
System.out.println("yOne = " + yOne);
System.out.println("xTwo = " + xTwo);
System.out.println("yTwo = " + yTwo);
System.out.println("aOne = " + aOne);
System.out.println("bOne = " + bOne);
System.out.println("aTwo = " + aTwo);
System.out.println("bTwo = " + bTwo);
System.out.println("c = " + c);
System.out.println("d = " + d);
System.out.println("eOne = " + eOne);
System.out.println("eTwo = " + eTwo);
System.out.println("f = " + f);
*/
