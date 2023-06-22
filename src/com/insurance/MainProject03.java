package com.insurance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author SCOTT MICHAEL ANDERSON
 *
 *         The program gets input from the user for his/hers insurance policy
 *         information
 *
 *         The users policy object with fields is output The BMI is calculated
 *         and is output The Policy Price is output
 *
 */
public class MainProject03 {

	/**
	 * Formats the output of decimal variables
	 */
	public static DecimalFormat f = new DecimalFormat("##.0");
	public static DecimalFormat ff = new DecimalFormat("###,###.00");

	public static int numberSmokers = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Scanner scanner = new Scanner(System.in);

		// getInput(policy01, scanner);

		File file = new File("PolicyInformation.txt");

		if (file.createNewFile()) {
			System.out.println("New File created");
		} else {
			System.out.println("No file created");
		}
		String k = "";
		ArrayList<String> policyStr = new ArrayList<String>();
		ArrayList<Policy> policyList = new ArrayList<Policy>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			if ((k = br.readLine()) == null) {
				System.out.println("Null file");

			}

			// while the String k = "something" then continue reading
			while ((k = br.readLine()) != null) {

				// System.out.println("Attempting to read file");

				// System.out.println(st);

				if (k.isEmpty()) {

					System.out.println("Continue to read next line");
					continue;
				}

				policyStr.add(k);

			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create new policy object and Iterate through the policyStr ArrayList to give
		// the Policy Object values
		for (int kk = 0; kk < policyStr.size(); kk++) {

			Policy policy = new Policy();

			// Use the captured information as needed

			policy.setPolicyNumber(Integer.parseInt(policyStr.get(kk)));
			kk += 1;

			policy.setProviderName(policyStr.get(kk));
			kk += 1;

			policy.getPolicyHolderObj().setHolderFirstName(policyStr.get(kk));
			System.out.println("policy.getPolicyHolderObj().getHolderFirstName() = " +
					policy.getPolicyHolderObj().getHolderFirstName());
			kk += 1;
			policy.getPolicyHolderObj().setHolderLastName(policyStr.get(kk));
			kk += 1;
			policy.getPolicyHolderObj().setHolderAge(Integer.parseInt(policyStr.get(kk)));
			kk += 1;
			policy.getPolicyHolderObj().setHolderSmokingStatus(policyStr.get(kk));

			if (policyStr.get(kk).equals("smoker")) {

				numberSmokers = countSmokers(numberSmokers);

			}
			kk += 1;

			policy.getPolicyHolderObj().setHolderHeight(Integer.parseInt(policyStr.get(kk)));
			kk += 1;

			policy.getPolicyHolderObj().setHolderWeight(Integer.parseInt(policyStr.get(kk)));

			policyList.add(policy);
		}

		for (int x = 0; x < policyList.size(); x++) {

			System.out.print("Policy Number: ");
			System.out.println(policyList.get(x).getPolicyNumber());
			System.out.println();

			System.out.print("Provider Name: ");
			System.out.println(capitalize(policyList.get(x).getProviderName()));
			System.out.println();

			System.out.println("Policyholder's First Name: " +
					capitalize(policyList.get(x).getPolicyHolderObj().getHolderFirstName()));
			System.out.println();

			System.out.println("Policyholder's Last Name: " +
					capitalize(policyList.get(x).getPolicyHolderObj().getHolderLastName()));
			System.out.println();

			System.out.println(
					"Policyholder's Age: " + policyList.get(x).getPolicyHolderObj().getHolderAge());
			System.out.println();

			System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " +
					policyList.get(x).getPolicyHolderObj().getHolderSmokingStatus());
			System.out.println();

			System.out.println("Policyholder's Height: " +
					policyList.get(x).getPolicyHolderObj().getHolderHeight() + " inches");
			System.out.println();

			System.out.println("Policyholder's Weight: " +
					f.format(policyList.get(x).getPolicyHolderObj().getHolderWeight()) + " pounds");
			System.out.println();

			System.out.println("Policyholder's BMI: " + ff.format(policyList.get(x).bmiCalc(
					policyList.get(x).getPolicyHolderObj().getHolderWeight(),
					policyList.get(x).getPolicyHolderObj().getHolderHeight())));
			System.out.println();

			System.out.println("Policy Price: $" + ff.format(policyPriceCalc(policyList.get(x))));
			System.out.println();
			System.out.println();
			System.out.println();

		}

		System.out.println();
		System.out.println();

		System.out.println("The number of policies with a smoker is: " + numberSmokers);
		System.out.println();

		System.out.println("The number of policies with a non-smoker is: " +
				(policyList.size() - numberSmokers));

	}

	public static String capitalize(final String line) {
		boolean found = false;
		char[] chars = line.toLowerCase().toCharArray();

		for (int k = 0; k < chars.length; k++) {

			if (!found && Character.isLetter(chars[k])) {
				chars[k] = Character.toUpperCase(chars[k]);
				found = true;

			} else if (Character.isWhitespace(chars[k]) || chars[k] == '.') {
				found = false;
			}
		}
		return String.valueOf(chars);

		// return line.substring(0,1).toUpperCase()+line.substring(1).toLowerCase();
	}

	public static int countSmokers(int numberSmokers) {

		numberSmokers += 1;
		return numberSmokers;

	}

	/**
	 * getInput() method will get user input for the Policy object
	 * 
	 * @param policy01 instance of the Policy Class
	 * @param scanner
	 * @return Returns the new Policy object/instance
	 */
	public static Policy getInput(Policy policy01, Scanner scanner) {

		System.out.print("Please enter the Policy Number: ");
		policy01.setPolicyNumber(scanner.nextInt());

		scanner.nextLine(); // Consume the newline character

		System.out.print("Please enter the Provider Name: ");
		policy01.setProviderName(scanner.nextLine());

		System.out.print("Please enter the Policyholder�s First Name: ");
		policy01.getPolicyHolderObj().setHolderFirstName(scanner.nextLine());

		System.out.print("Please enter the Policyholder�s Last Name: ");
		policy01.getPolicyHolderObj().setHolderLastName(scanner.nextLine());

		System.out.print("Please enter the Policyholder�s Age: ");

		policy01.getPolicyHolderObj().setHolderAge(scanner.nextInt());

		scanner.nextLine(); // Consume the newline character

		System.out.print("Please enter the Policyholder�s Height (in inches): ");

		policy01.getPolicyHolderObj().setHolderHeight(scanner.nextInt());
		scanner.nextLine();

		System.out.print("Please enter the Policyholder�s Weight (in pounds): ");

		policy01.getPolicyHolderObj().setHolderWeight(scanner.nextInt());

		return policy01;
	}

	/**
	 * policyPriceCalc() method will return the policy price after considering the
	 * age, smoking status, and BMI
	 * 
	 * @param policy01
	 * @return returns the Policy Price
	 */
	public static double policyPriceCalc(Policy policy01) {

		double policyPrice = 600.00;

		if (policy01.getPolicyHolderObj().getHolderAge() > 50) {
			policyPrice += 75.00;
		}

		if (policy01.getPolicyHolderObj().getHolderSmokingStatus().equals("smoker")) {
			policyPrice += 100;

		}

		if (policy01.bmiCalc(policy01.getPolicyHolderObj().getHolderWeight(),
				policy01.getPolicyHolderObj().getHolderHeight()) > 35) {
			policyPrice += (policy01.bmiCalc(policy01.getPolicyHolderObj().getHolderWeight(),
					policy01.getPolicyHolderObj().getHolderHeight()) - 35) * 20;
		}
		return policyPrice;
	}

	public static String smokingStatus(String st) {
		String smokerStr = "";

		if (!st.contains("non")) {
			smokerStr = "non-smoker";
		} else {
			smokerStr = "smoker";

		}

		return smokerStr;
	}

	/**
	 * validate() method will compare the String input for smokingStatusStr and
	 * return a boolean value for the smoking status
	 * 
	 * @param policy01
	 * @param smokingStatusStr
	 * @return boolean value for smoking status
	 */
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

}
