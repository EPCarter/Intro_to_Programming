
import java.util.*;

public class Test {
	public static void main(String[] args) {
		System.out.print("Enter the number of lines: ");
		Scanner reader = new Scanner(System.in);
		int lines = reader.nextInt();
		reader.close(); // 10, 12, 13 break
		int printedRow = 1;
		while (printedRow <= lines && printedRow <= 150 && printedRow >= 1) {
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
			while (spaces > 1) {
				System.out.print(interNumberSpace);
				spaces--;
			}
			printedRow++;
			System.out.println();
		}
	}
}
