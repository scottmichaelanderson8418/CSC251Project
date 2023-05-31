package com.insurance;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static DecimalFormat f = new DecimalFormat("##.00");

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Policy policy01 = new Policy();

		Scanner scanner = new Scanner(System.in);

		getInput(policy01, scanner);

		System.out.println(policyPriceCalc(policy01));

		// Use the captured information as needed
		System.out.println("Policy Number: " + policy01.getPolicyNumber());
		System.out.println("Provider Name: " + policy01.getProviderName());
		System.out.println("Policy Holder's First Name: " + policy01.getHolderFirstName());
		System.out.println("Policy Holder's Last Name: " + policy01.getHolderLastName());
		System.out.println("Policy Holder's Age: " + policy01.getHolderAge() + " yrs");
		System.out.println("Policy Holder's Smoking Status: " + policy01.getHolderSmokingStatus());
		System.out.println("Policy Holder's Height: " + policy01.getHolderHeight() + " inches");
		System.out.println("Policy Holder's Weight: " + policy01.getHolderWeight() + " lbs");
		System.out.println("Policy Holder's BMI: " +
				policy01.bmiCalc(policy01.getHolderWeight(), policy01.getHolderHeight()));

		System.out.println("Policy Price: $" + policyPriceCalc(policy01));

		// Close the scanner
		scanner.close();

	}

	public static Policy getInput(Policy policy01, Scanner scanner) {

		boolean scottBoolean = false;

		System.out.print("Please enter the Policy Number: ");
		policy01.setPolicyNumber(scanner.nextInt());

		scanner.nextLine(); // Consume the newline character

		System.out.print("Please enter the Provider Name: ");
		policy01.setProviderName(scanner.nextLine());

		System.out.print("Please enter the Policyholder’s First Name: ");
		policy01.setHolderFirstName(scanner.nextLine());

		System.out.print("Please enter the Policyholder’s Last Name: ");
		policy01.setHolderLastName(scanner.nextLine());

		System.out.print("Please enter the Policyholder’s Age: ");

		policy01.setHolderAge(scanner.nextInt());

		scanner.nextLine(); // Consume the newline character

		while (!scottBoolean) {
			System.out
					.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
			String smokingStatusStr = scanner.nextLine();

			scottBoolean = validate(policy01, smokingStatusStr);

			if (!smokingStatusStr.contains("non")) {
				policy01.setHolderSmokingStatus(true);
				System.out.println("SMOKER-----------------------------------------------");
			}
		}

		System.out.print("Please enter the Policyholder’s Height (in inches): ");

		policy01.setHolderHeight(scanner.nextInt());
		scanner.nextLine();

		System.out.print("Please enter the Policyholder’s Weight (in pounds): ");

		policy01.setHolderWeight(scanner.nextInt());

		return policy01;
	}

	public static boolean validate(Policy policy01, String smokingStatusStr) {

		boolean scottBoolean = false;

		// Define the words to check
		String[] wordsToCheck = { "non", "non-smoker", "smoker" };

		// Create the regex pattern
		String patternString = "\\b(" + String.join("|", wordsToCheck) + ")\\b";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);

		// Match the input against the pattern
		Matcher matcher = pattern.matcher(smokingStatusStr);

		if (matcher.find()) {

			scottBoolean = true;
		} else {
			System.out.println("Input does not contain any of the specified words.");
		}

		return scottBoolean;
	}

	public static double policyPriceCalc(Policy policy01) {

		double policyPrice = 600.00;

		if (policy01.getHolderAge() > 50) {
			policyPrice += 75.00;
		}

		if (policy01.getHolderSmokingStatus() == true) {
			policyPrice += 100;
			System.out.println("SMOKER-----------------------------------------------");
		}

		if (policy01.bmiCalc(policy01.getHolderWeight(), policy01.getHolderHeight()) > 35) {
			policyPrice += (policy01.bmiCalc(policy01.getHolderWeight(),
					policy01.getHolderHeight()) - 35) * 20;
		}
		return policyPrice;
	}

}
