import java.util.*;
public class Test {
	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		Scanner reader = new Scanner(System.in);
		int lines = reader.nextInt();
		int printedRow = 1;
		while (printedRow <= lines) {
			int spaces = 1;
			String interNumberSpace = " ";
			String extraNumberSpace = " ";
			while (spaces <= lines - printedRow) {
				System.out.print(extraNumberSpace);
				System.out.print(interNumberSpace);
				if (printedRow > 9) {
					extraNumberSpace = "  ";
				}
				spaces++;
			}
			int count = printedRow;
			while (count > 1) {
				System.out.print(count + interNumberSpace);
				count--;
			}
			while (count <= printedRow) {
				System.out.print(count + interNumberSpace);
				count++;
			}
			printedRow++;
			System.out.println();
		}
	}
}
