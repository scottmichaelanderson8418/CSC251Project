package com.insurance;

public class Policy {
	/**
	 * The Policy Class contains the blueprints for the Policy Object The Policy
	 * Class contains all information related to the insurance policy
	 * 
	 *
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	// Added code to Policy Class
	private String providerName; // Provider Name
	private String holderFirstName; // policy holder's First Name
	private String holderLastName;// Policy Holder's Last Name
	private int holderAge;
	private int holderHeight; // inches
	private int holderWeight; // lbs
	private int policyNumber; // Policy Number
	private boolean holderSmokingStatus;

	/**
	 * Default Policy constructor that initializes the fields with default values
	 * 
	 * 
	 */
	public Policy() {
		this.policyNumber = 0;
		this.providerName = "";
		this.holderFirstName = "";
		this.holderLastName = "";
		this.holderAge = 0;
		this.holderSmokingStatus = false;
		this.holderHeight = 0;
		this.holderWeight = 0;

	}

	/**
	 * Overloaded Policy Constructor that constructs a Policy object
	 * 
	 * @param providername:        the name of the insurance provider
	 * @param holderFirstName:     policy holder's First Name
	 * @param holderLastName:      Policy Holder's Last Name
	 * @param holderAge:           Policy Holder's age
	 * @param holderHeight:        height of policy holder in inches
	 * @param holderWeight:        weight of policy holder in lbs
	 * @param policyNumber:        indicates the policy number of the insurance plan
	 * @param holderSmokingStatus: indicates the policy holders smoking status
	 */
	// Policy constructor with fields
	public Policy(
			int policyNumber,
			String providerName,
			String holderFirstName,
			String holderLastName,
			int holderAge,
			boolean holderSmokingStatus,
			int holderHeight,
			int holderWeight) {
		super();
		this.policyNumber = policyNumber;
		this.providerName = providerName;
		this.holderFirstName = holderFirstName;
		this.holderLastName = holderLastName;
		this.holderAge = holderAge;
		this.holderSmokingStatus = holderSmokingStatus;
		this.holderHeight = holderHeight;
		this.holderWeight = holderWeight;

	}

	/**
	 * bmiCalc() method will calculate the BMI (Body Mass Index)
	 * 
	 * @return the body mass index
	 */
	public int bmiCalc(int holderWeight, int holderHeight) {

		return (holderWeight * 703) / (holderHeight * holderHeight);
	}

	/**
	 * 
	 * Retrieves the age of policy holder
	 * 
	 * @return Age of policy holder
	 */
	public int getHolderAge() {
		return holderAge;
	}

	/**
	 * Retrieves the first name of policy holder
	 * 
	 * @return first name of policy holder
	 */
	public String getHolderFirstName() {
		return holderFirstName;
	}

	/**
	 * Retrieves the height of policy holder
	 * 
	 * @return height of policy holder
	 */
	public int getHolderHeight() {
		return holderHeight;
	}

	/**
	 * Retrieves the last name of policy holder
	 * 
	 * @return last name of policy holder
	 */
	public String getHolderLastName() {
		return holderLastName;
	}

	/**
	 * Retrieves the smoking status of policy holder
	 * 
	 * @return smoking status of policy holder
	 */
	public boolean getHolderSmokingStatus() {
		return holderSmokingStatus;
	}

	/**
	 * Retrieves the weight of policy holder
	 * 
	 * @return weight of policy holder
	 */
	public int getHolderWeight() {
		return holderWeight;
	}

	/**
	 * Retrieves the policy number of policy holder
	 * 
	 * @return policy number of policy holder
	 */
	public int getPolicyNumber() {
		return policyNumber;
	}

	/**
	 * Retrieves the provider name of policy holder
	 * 
	 * @return provider name of policy holder
	 */
	public String getProviderName() {
		return providerName;
	}

	/**
	 * Sets Policy Holder's age
	 * 
	 * @param holderAge Policy Holder's age
	 */
	public void setHolderAge(int holderAge) {
		this.holderAge = holderAge;
	}

	/**
	 * Sets policy holder's First Name
	 * 
	 * @param holderFirstName
	 */
	public void setHolderFirstName(String holderFirstName) {
		this.holderFirstName = holderFirstName.toUpperCase();
	}

	/**
	 * Sets height of policy holder in inches
	 * 
	 * @param holderHeight height of policy holder in inches
	 */
	public void setHolderHeight(int holderHeight) {
		this.holderHeight = holderHeight;
	}

	/**
	 * Sets Policy Holder's Last Name
	 * 
	 * @param holderLastName Policy Holder's Last Name
	 */
	public void setHolderLastName(String holderLastName) {
		this.holderLastName = holderLastName.toUpperCase();
	}

	/**
	 * Sets the policy holders smoking status
	 * 
	 * @param holderSmokingStatus policy holders smoking status
	 */
	public void setHolderSmokingStatus(boolean holderSmokingStatus) {
		this.holderSmokingStatus = holderSmokingStatus;
	}

	/**
	 * Sets weight of policy holder in lbs
	 * 
	 * @param holderWeight weight of policy holder in lbs
	 */
	public void setHolderWeight(int holderWeight) {
		this.holderWeight = holderWeight;
	}

	/**
	 * Sets the policy number of the insurance plan
	 * 
	 * @param policyNumber indicates the policy number of the insurance plan
	 */
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	/**
	 * Sets the name of the insurance provider
	 * 
	 * @param providerName the name of the insurance provider
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName.toUpperCase();
	}

}

