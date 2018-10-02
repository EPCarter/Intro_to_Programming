package Chapter_8;
/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 8-5
Date: .  2018
Summary: (Algebra: add two matrices) Write a method to add two matrices. 
          The header of the method is as follows:
          
              public static double[][] addMatrix(double[][] a, double[][] b)
          
          In order to be added, the two matrices must have the same dimensions
          and the same or compatible types of elements. Let c be the resulting 
          matrix. Each element c[i][j] is a[i][j]+b[i][j].
          
              Example:

                  1.0   2.0   3.0   0.0  2.0  4.0   1.0  4.0  7.0
                  4.0   5.0   6.0 + 1.0  4.5  2.2 = 5.0  9.5  8.2
                  7.0   8.0   9.0   1.1  4.3  5.2   8.1  12.3  14.2
*/

import java.util.Scanner;

class eightFive {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double[] matrix0 = new double[19];
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] matrix3 = new double[3][3];

		for (int i = 1; i <= 18; i++) {
			System.out.print("Enter number " + i + ": ");
			String input = reader.nextLine();
			matrix0[i] = Double.parseDouble(input);
		}
		reader.close();

		matrix1[0][0] = matrix0[1];
		matrix1[0][1] = matrix0[2];
		matrix1[0][2] = matrix0[3];
		matrix1[1][0] = matrix0[4];
		matrix1[1][1] = matrix0[5];
		matrix1[1][2] = matrix0[6];
		matrix1[2][0] = matrix0[7];
		matrix1[2][1] = matrix0[8];
		matrix1[0][2] = matrix0[9];

		matrix2[0][0] = matrix0[10];
		matrix2[0][1] = matrix0[11];
		matrix2[0][2] = matrix0[12];
		matrix2[1][0] = matrix0[13];
		matrix2[1][1] = matrix0[14];
		matrix2[1][2] = matrix0[15];
		matrix2[2][0] = matrix0[16];
		matrix2[2][1] = matrix0[17];
		matrix2[0][2] = matrix0[18];

		matrix3 = addMatrix(matrix1, matrix2);
		System.out.println(matrix3[0][0] + " " + matrix3[0][1] + " " + matrix3[0][2]);
		System.out.println(matrix3[1][0] + " " + matrix3[1][1] + " " + matrix3[1][2]);
		System.out.println(matrix3[2][0] + " " + matrix3[2][1] + " " + matrix3[2][2]);
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] c = new double[3][3];
		c[0][0] = a[0][0] + b[0][0];
		c[0][1] = a[0][1] + b[0][1];
		c[0][2] = a[0][2] + b[0][2];
		c[1][0] = a[1][0] + b[1][0];
		c[1][1] = a[1][1] + b[1][1];
		c[1][2] = a[1][2] + b[1][2];
		c[2][0] = a[2][0] + b[2][0];
		c[2][1] = a[2][1] + b[2][1];
		c[2][2] = a[2][2] + b[2][2];
		return c;
	}
}