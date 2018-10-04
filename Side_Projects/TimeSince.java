package Side_Projects;

import java.util.Scanner;

public class TimeSince {

	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		Scanner reader = new Scanner(System.in);
		int inputCleaned = Integer.parseInt(reader.nextLine());
		System.out.println("-------------------------------------");
		System.out.println(since());
	}

	public static void today() {

	}

	public static long since() {
		long day = (java.lang.System.currentTimeMillis() / 1000 / 60 / 60 / 24);
		long month = day/30;
		long year = day / 365;
		return year;
	}
	
}
