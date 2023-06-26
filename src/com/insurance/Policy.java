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

	private int policyNumber; // Policy Number

	private PolicyHolder policyHolderObj; // Field to represent an instance of the PolicyHolder
											// class

	/**
	 * Default Policy constructor that initializes the fields with default values
	 * 
	 * 
	 */
	public Policy() {
		this.policyNumber = 0;
		this.providerName = "";
		this.policyHolderObj=null;

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
	// Policy constructor with fields (Aggregation)
	public Policy(int policyNumber, String providerName, PolicyHolder policyHolderObj) {
		super();
		this.policyNumber = policyNumber;
		this.providerName = providerName;

		this.policyHolderObj = new PolicyHolder(policyHolderObj);

	}

	// Modified for aggregation
	public PolicyHolder getpolicyHolderObj() {
		return new PolicyHolder(policyHolderObj);
	}

	// Modified for aggregation
	public void setPolicyHolder(PolicyHolder policyHolderObj) {
		this.policyHolderObj = new PolicyHolder(policyHolderObj);
	}

	/**
	 * bmiCalc() method will calculate the BMI (Body Mass Index)
	 * 
	 * @return the body mass index
	 */
	public double bmiCalc(double holderWeight, double holderHeight) {

		return (holderWeight * 703) / (holderHeight * holderHeight);
	}

	// this will return a copy of my PolicyHolder Object
	public PolicyHolder getPolicyHolderObj() {
		return new PolicyHolder(policyHolderObj);
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

	public void setPolicyHolderObj(PolicyHolder policyHolderObj) {

		this.policyHolderObj = new PolicyHolder(policyHolderObj);
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

	// @Override
	// public String toString() {
	// return "Policy [providerName=" + providerName + ", policyNumber=" +
	// policyNumber +
	// ", policyHolderObj=" + policyHolderObj + "]";
	// }
	//

	public String toString() {

		String str="";
		
		str= "this.policyNumber = " + this.policyNumber + "\n this.providerName = " +
				this.providerName + "\n this.policyHolderObj = " + this.policyHolderObj;
		
		return str;

	}

}
