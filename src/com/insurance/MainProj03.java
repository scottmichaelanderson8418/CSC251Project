package com.insurance;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

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
public class MainProj03 {

	/**
	 * Formats the output of decimal variables
	 */

	public static int numberSmokers = 0;

	public static void main(String[] args) throws IOException {
		// Scanner scanner = new Scanner(System.in);
		// getInput(policy01, scanner);

		// Use File class to create a new file called "PolicyInformation.txt"
		File file = new File("PolicyInformation.txt");

		// Print message about file creation status
		if (file.createNewFile()) {
//			System.out.println("New File created");
		} else {
//			System.out.println("No file created");
		}

		//
		String k = "";

		// Create an ArrayList of the policyStr objects
		ArrayList<String> policyStr = new ArrayList<String>();

		// Create an ArrayList of the policyList objects
		ArrayList<Policy> policyList = new ArrayList<Policy>();

		try {
			// Create FileReader object "fr"
			FileReader fr = new FileReader(file);

			// Use BufferedReader class to read one line at a time
			// Create BufferedReader object "br"
			// Send FileReader object "fr" into BufferedReader object
			BufferedReader br = new BufferedReader(fr);

			// while the String k = "something" then continue reading
			while ((k = br.readLine()) != null) {

				// System.out.println("Attempting to read file");

				// System.out.println(st);
				if (k.isEmpty()) {

//					System.out.println("Continue to read next line");
					continue;
				}

				// if there is text on the line then add it to the ArrayList "policyStr"
				policyStr.add(k);

			}

			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// Create new policy object and Iterate through the policyStr ArrayList
		// Create a PolicyHolderObject using default constructor
		// Create Policy object using default constructor

		// 1. Fill the default Policy constructor without the "policyHolderObj"
		// 2. Fill the default PolicyHolder Constructor with values
		// 3. Create a Policy Object using the Policy Aggregation Constructor
		// 4. Fill the Policy Aggregation Constructor with Policy Object and
		// PolicyHolder Object

		for (int kk = 0; kk < policyStr.size(); kk++) {

			PolicyHolder policyHolderObj = new PolicyHolder();

			Policy policy = new Policy();

			policy.setPolicyNumber(Integer.parseInt(policyStr.get(kk)));
			kk += 1;

			// System.out.println(policy.getPolicyNumber());

			policy.setProviderName(policyStr.get(kk));

			// System.out.println(policy.getProviderName());
			kk += 1;

			policyHolderObj.setHolderFirstName(policyStr.get(kk));

			kk += 1;
			policyHolderObj.setHolderLastName(policyStr.get(kk));
			kk += 1;
			policyHolderObj.setHolderAge(Integer.parseInt(policyStr.get(kk)));
			kk += 1;
			policyHolderObj.setHolderSmokingStatus(policyStr.get(kk));

			if (policyStr.get(kk).equals("smoker")) {

				numberSmokers = countSmokers(numberSmokers);

			}
			kk += 1;

			policyHolderObj.setHolderHeight(Integer.parseInt(policyStr.get(kk)));
			kk += 1;

			policyHolderObj.setHolderWeight(Integer.parseInt(policyStr.get(kk)));

			// Create Policy Aggregation Constructor and fill it with values
			Policy policyAgg = new Policy(policy.getPolicyNumber(), policy.getProviderName(),
					policyHolderObj);

			policyList.add(policyAgg);
		}

		// Print out each object in the ArrayList "policyList"
		for (int x = 0; x < policyList.size(); x++) {
			// Implicitly call the toString() method for each Policy Object in the policy
			// ArrayList
			System.out.println(policyList.get(x).toString());

		}

		System.out.println();

		// policyList.get(policyList.size()-1)
		System.out.println(
				"There were " + Policy.getPolicyObjectCount() + " Policy objects created.");
		System.out.println("The number of policies with a smoker is: " + numberSmokers);

		System.out.println("The number of policies with a non-smoker is: " +
				(policyList.size() - numberSmokers));

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
	// public static Policy getInput(Policy policy01, Scanner scanner) {
	//
	// System.out.print("Please enter the Policy Number: ");
	// policy01.setPolicyNumber(scanner.nextInt());
	//
	// scanner.nextLine(); // Consume the newline character
	//
	// System.out.print("Please enter the Provider Name: ");
	// policy01.setProviderName(scanner.nextLine());
	//
	// System.out.print("Please enter the Policyholder�s First Name: ");
	// policy01.getPolicyHolderObj().setHolderFirstName(scanner.nextLine());
	//
	// System.out.print("Please enter the Policyholder�s Last Name: ");
	// policy01.getPolicyHolderObj().setHolderLastName(scanner.nextLine());
	//
	// System.out.print("Please enter the Policyholder�s Age: ");
	//
	// policy01.getPolicyHolderObj().setHolderAge(scanner.nextInt());
	//
	// scanner.nextLine(); // Consume the newline character
	//
	// System.out.print("Please enter the Policyholder�s Height (in inches): ");
	//
	// policy01.getPolicyHolderObj().setHolderHeight(scanner.nextInt());
	// scanner.nextLine();
	//
	// System.out.print("Please enter the Policyholder�s Weight (in pounds): ");
	//
	// policy01.getPolicyHolderObj().setHolderWeight(scanner.nextInt());
	//
	// return policy01;
	// }
	//

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
	// public static boolean validate(Policy policy01, String smokingStatusStr) {
	//
	// boolean scottBoolean = false;
	//
	// // Define the words to check
	// String[] wordsToCheck = { "non", "non-smoker", "smoker" };
	//
	// // Create the regex pattern
	// String patternString = "\\b(" + String.join("|", wordsToCheck) + ")\\b";
	// Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
	//
	// // Match the input against the pattern
	// Matcher matcher = pattern.matcher(smokingStatusStr);
	//
	// if (matcher.find()) {
	//
	// scottBoolean = true;
	// } else {
	// System.out.println("Input does not contain any of the specified words.");
	// }
	//
	// return scottBoolean;
	// }

}
