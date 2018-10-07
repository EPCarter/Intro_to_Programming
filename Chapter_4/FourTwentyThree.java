package Chapter_4;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("resource")

public class FourTwentyThree {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

//name
		System.out.print("Employee’s name (e.g., Smith): ");
		String name = reader.nextLine();

//hours
		float hoursPre = 0;
		float hours = 0;

		while (hoursPre <= 0) {
			System.out.print("Hours per Week (e.g., 10): ");
			try {
				hoursPre = reader.nextFloat();
			}

			catch (InputMismatchException ex) {
				hoursPre = 0;
				reader.nextLine();
				System.out.println("");
				System.out.print("Enter a positive number.");
				System.out.println("");
			}
		}
		hours = hoursPre;

//pay rate			
		float prePayRate = 0;
		float payRate = 0;

		while (prePayRate <= 0) {
			System.out.print("Enter Pay Rate: $");
			try {
				prePayRate = reader.nextFloat();
			}

			catch (InputMismatchException ex) {
				prePayRate = 0;
				reader.nextLine();
				System.out.println("");
				System.out.print("Enter a positive number.");
				System.out.println("");
			}
		}

		payRate = prePayRate;
		float gross = payRate * hours;

//fed rate
		float preFedTaxRate = 0;
		float fedTaxRate = 0;

		while (preFedTaxRate <= 0) {
			System.out.print("Federal tax withholding rate (e.g., 20%): ");
			try {
				preFedTaxRate = reader.nextFloat();
			}

			catch (InputMismatchException ex) {
				preFedTaxRate = 0;
				reader.nextLine();
				System.out.println("");
				System.out.print("Enter a positive number.");
				System.out.println("");
			}
		}

		fedTaxRate = preFedTaxRate;
		float fedWithheld = fedTaxRate / 100 * gross;

//state rate
		float preStateTaxRate = 0;
		float stateTaxRate = 0;

		while (preStateTaxRate <= 0) {
			System.out.print("State tax withholding rate (e.g., 9%): ");
			try {
				preStateTaxRate = reader.nextFloat();
			}

			catch (InputMismatchException ex) {
				preStateTaxRate = 0;
				reader.nextLine();
				System.out.println("");
				System.out.print("Enter a positive number.");
				System.out.println("");
			}
		}

		stateTaxRate = preStateTaxRate;
		float stateWithheld = stateTaxRate / 100 * gross;
		float totalWithheld = stateWithheld + fedWithheld;
		float net = gross - stateWithheld - fedWithheld;

//Print
		System.out.println();
		System.out.println("Employee's Name:  " + name);
		System.out.println("Hours per Week:   " + hours + " hrs/wk");
		System.out.println("Hourly pay rate:  $" + payRate + " /hr");
		System.out.println("Gross:            $" + gross);
		System.out.println("Federal tax rate: (" + fedTaxRate + "%) $" + fedWithheld);
		System.out.println("State tax rate:   (" + stateTaxRate + "%) $" + stateWithheld);
		System.out.println("Tax Withheld:     $" + totalWithheld);
		System.out.println("Net Income:       $" + net);
	}
}