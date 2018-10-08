package Side_Projects;
import java.util.Scanner;

@SuppressWarnings("resource")

public class Life {
	public static void main(String[] args) {
		String sex = "Not Set";
		String preConsentParsed = "Not Set";
		menu(preConsentParsed, sex);
	}

	public static void menu(String preConsentParsed, String sex) {
		Scanner reader = new Scanner(System.in);

		System.out.println("-------------------------------------");
		System.out.println("Sex? (M | F | It's complicated): ");
		System.out.println("-------------------------------------");

		sex = reader.nextLine();
		String sexParsed = parseSex(sex);
		System.out.println("-------------------------------------");
		System.out.println("When are you next planning on getting laid?");
		System.out.println("-------------------------------------");
		int menuItems = 8;
		int a = 0;
		String b = "";
		for (int j = 0; j < menuItems; j++) {
			switch (j) {
			case 0:
				b = "Exit";
				break;
			case 1:
				b = "Help";
				break;
			case 2:
				b = "As we speak";
				break;
			case 3:
				b = "Today";
				break;
			case 4:
				b = "Two-Days-ish";
				break;
			case 5:
				b = "A few weeks out";
				break;
			case 6:
				b = "Months at least";
				break;
			case 7:
				b = "I don't know";
				break;
			default:
				b = "Menu";
				break;
			}
			System.out.println(a + ": " + b);
			a++;
		}
		reader = new Scanner(System.in);
		int inputCleaned = Integer.parseInt(reader.nextLine());
		switch (inputCleaned) {
		case 0:
			System.exit(0);
			break;
		case 1:
			help();
			break;
		case 2:
			triage(preConsentParsed, sexParsed);
			menu(preConsentParsed, sexParsed);
			break;
		case 3:
			urgent(preConsentParsed, sexParsed);
			menu(preConsentParsed, sexParsed);
			break;
		case 4:
			sharpish(preConsentParsed, sexParsed);
			menu(preConsentParsed, sexParsed);
			break;
		case 5:
			shortTerm(preConsentParsed, sexParsed);
			menu(preConsentParsed, sexParsed);
			break;
		case 6:
			medTerm(preConsentParsed, sexParsed);
			menu(preConsentParsed, sexParsed);
			break;
		case 7:
			longTerm(preConsentParsed, sexParsed);
			menu(preConsentParsed, sexParsed);
			break;
		default:
			break;
		}
	}

	public static void help() {
		System.out.println("-------------------------------------");
		System.out.println("Are you in danger?");
		System.out.println("-------------------------------------");
		Scanner reader = new Scanner(System.in);
		String emergencyInput = reader.nextLine();
		if (emergencyInput
				.matches("Y | y | Yes | yes | Yep | Yup | Yarp | Uh-huh | Roger Dodger | Afirmative | Thumb's-up")) {
			System.out.println(
					"Call 911 immediately!; Stop, Drop, and Roll; Put pressure on the wound; Run, Hide, Fight!");
		}

		else if (emergencyInput.matches("N | n | No | no | Nope | Narp | Nuh-uh | Negative | Thumb's-down | Maybe")) {
			System.out.println("Okay cool, just checking. How can I help?");
		}

		else {
			System.out.println(
					"I'll just assume yes. Call 911 immediately!; Stop, Drop, and Roll; Put pressure on the wound; Run, Hide, Fight!");
		}
	}

	public static String parsePreConsent(String preConsentInput) {
		String preConsentParsed = "";
		if (preConsentInput.contains("Y | Yes | Yep | Yup | Yarp | Uh-huh | Roger Dodger | Afirmative | Thumb's-up")) {
			preConsentParsed = "Y";
		}

		else if (preConsentInput.contains("N | No | Nope | Narp | Nuh-uh | Negative | Thumb's-down | Maybe")) {
			preConsentParsed = "N";
		}

		else {
			preConsentParsed = "N";
		}
		return preConsentParsed;
	}

	public static String parseSex(String sex) {
		String sexParsed = "";
		if (sex.contains("fe+ | f+ | female+ | F+ | Female+")) {
			sexParsed = "M";
		} else if (sex.contains("^fe+ (m+ | M+ | Male+ | male+)")) {
			sexParsed = "F";
		} else {
			sexParsed = "O";
		}
		return sexParsed;
	}

	public static void triage(String preConsentParsed, String sex) {
		System.out.println("-------------------------------------");
		System.out.println("Here are some tips:");
	}

	public static void urgent(String preConsentParsed, String sex) {
		Scanner reader = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("Does the other person know yet?");
		System.out.println("-------------------------------------");
		String preConsentInput = reader.nextLine();
		preConsentParsed = parsePreConsent(preConsentInput);
		System.out.println("Use what you have on hand or can get from a store locally, here are some tips:");
	}

	public static void sharpish(String preConsentParsed, String sex) {
		Scanner reader = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("Does the other person know yet?");
		System.out.println("-------------------------------------");
		String preConsentInput = reader.nextLine();
		preConsentParsed = parsePreConsent(preConsentInput);
		System.out.println("Amazon has Two-Day Shipping on orders over $35 or with Prime (or Prime Student)");
	}

	public static void shortTerm(String preConsentParsed, String sex) {
		Scanner reader = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("Does the other person know yet?");
		System.out.println("-------------------------------------");
		String preConsentInput = reader.nextLine();
		preConsentParsed = parsePreConsent(preConsentInput);
		System.out.println("-------------------------------------");
		System.out.println("Romantic Comedy Recommendations: ");
	}

	public static void medTerm(String preConsentParsed, String sex) {
		Scanner reader = new Scanner(System.in);
		System.out.println("-------------------------------------");
		System.out.println("Does the other person know yet?");
		System.out.println("-------------------------------------");
		String preConsentInput = reader.nextLine();
		preConsentParsed = parsePreConsent(preConsentInput);
		System.out.println(
				"It's a perfect time to get blood tests and maybe get some shots, do some exercises, and build your knowledge!");
	}

	public static void longTerm(String preConsentParsed, String sex) {
		System.out.println("-------------------------------------");
		System.out.println("Let's look at long term goals...");
	}
}