//Title: 		Lab 7
//Author: 		John Aoraha
//Date: 		04/30/2018

import java.util.Scanner;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Name Validation
		System.out.println("Please enter a valid name: ");
		String name = scan.nextLine();

		if (checkRegEx("^[A-Z]\\w{0,30}[^0-9]", name) == true) {
			System.out.println("This is a valid name!");
		} else {
			System.out.println("This is not a valid name!");
		}

		System.out.println("");

		// Email Validation
		System.out.println("Enter a valid email address: ");
		String email = scan.nextLine();

		if (checkRegEx("\\w+@\\w+\\.\\w{2,4}", email) == true) {
			System.out.println("This is a valid email address!");
		} else {
			System.out.println("This is not a valid email address!");
		}

		System.out.println("");

		// Phone number validation
		System.out.println("Enter a valid phone number: ");
		String phone = scan.nextLine();

		if (checkRegEx("\\d{3}\\-\\d{3}\\-\\d{4}", phone) == true) {
			System.out.println("This is a valid phone number!");
		} else {
			System.out.println("This is not a valid phone number!");
		}

		System.out.println("");

		// Date validation
		System.out.println("Enter a valid date (dd/mm/yyyy): ");
		String date = scan.nextLine();

		if (checkRegEx("^(1[0-2]|0[1-9])\\/(3[01]|[12][0-9]|0[1-9])\\/[0-9]{4}$", date) == true) {
			System.out.println("This is a valid date!");
		} else {
			System.out.println("This is not a valid date!");
		}

		scan.close();
	}

	public static boolean checkRegEx(String regex, String sentence) {

		// // compiles the given regular expression into a pattern.
		// Pattern check = Pattern.compile(regex);
		//
		// // create a matcher that will match the sentence to the regex pattern.
		// Matcher checkMatch = check.matcher(sentence);
		//
		// // returns checkMatch as boolean.
		// return checkMatch.matches();

		// This one line does all of the above!
		return Pattern.matches(regex, sentence);
	}
}
