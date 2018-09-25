import java.util.*;	

class Untitled {
	public static void main(String[] args) {
	
		System.out.print("Enter the number of lines: ");
		Scanner reader = new Scanner(System.in);  
		int lines = reader.nextInt();
		int printedRow = 1;
		
		while(printedRow <= lines && printedRow <= 15 && printedRow >= 1){
			
			int spaces = 1;
			
			while(spaces <= lines - printedRow){
				System.out.print(".");
				spaces++;
			}
	
	int count = printedRow;
	while(count >= 1 && count <= printedRow ){
		if(count > 1){
			System.out.print(count);
			count--;
		}
	}	

		
		//System.out.print(spaces);
		//System.out.print(" " + printedRow);
		//System.out.print(" " + lines);
			
		
			
		while(spaces > 1){
			System.out.print(".");
			spaces--;
		}			
			printedRow++;
			System.out.println();
		}
		
	}
}
