package Chapter_8;

/*
Author: Erik Carter
Email: Carter.Eri7200@stu.stech.edu
Course: CSCI 1105 - Introduction to Programming
Assignment: 8-5
Date: Oct. 2,  2018
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
		int k = -1;
		int l = -1;
		int m = 0;
		int n = 0;

		System.out.println("Matrices must be the same size.");
		do {
			System.out.print("First box width: ");
			k = reader.nextInt();
			System.out.print("First box height: ");
			l = reader.nextInt();
			System.out.print("Second box width: ");
			m = reader.nextInt();
			System.out.print("Second box height: ");
			n = reader.nextInt();
		} while (k != m || l != n);

		double[] matrix0 = new double[(k * l) * 2];
		double[][] matrix1 = new double[k][l];
		double[][] matrix2 = new double[m][n];
		double[][] matrix3 = new double[k][l];
		int o = (k * l) * 2;

		for (int i = 0; i < o; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			double input = reader.nextDouble();
			matrix0[i] = input;
		}
		reader.close();
		int x = 0;
		for (int p = 0; p < k; p++) {
			for (int q = 0; q < l; q++) {
				matrix1[p][q] = matrix0[x];
				x++;
			}
		}

		for (int r = 0; r < m; r++) {
			for (int s = 0; s < n; s++) {
				matrix2[r][s] = matrix0[x];
				x++;
			}
		}

		matrix3 = addMatrix(matrix1, matrix2);

		for (int w = 0; w < matrix3.length; w++) {
			for (int c = 0; c < matrix3[0].length; c++) {
				System.out.print(matrix3[w][c] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		int z = a.length;
		int y = a[0].length;
		double[][] c = new double[z][y];
		for (int w = 0; w < z; w++) {
			for (int x = 0; x < y; x++) {
				c[w][x] = a[w][x] + b[w][x];
			}
		}
		return c;
	}
}