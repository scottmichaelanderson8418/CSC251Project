package com.insurance;

public class PolicyHolder {

	private String holderFirstName; // policy holder's First Name
	private String holderLastName;// Policy Holder's Last Name
	private int holderAge;
	private double holderHeight; // inches
	private double holderWeight; // lbs
	private String holderSmokingStatus;

	public PolicyHolder(PolicyHolder policyHolderObj) {
		holderFirstName = policyHolderObj.holderFirstName;
		holderLastName = policyHolderObj.holderLastName;
		holderAge = policyHolderObj.holderAge;
		holderHeight = policyHolderObj.getHolderHeight();
		holderWeight = policyHolderObj.getHolderWeight();
		holderSmokingStatus = policyHolderObj.getHolderSmokingStatus();
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
	public double getHolderHeight() {
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
	public String getHolderSmokingStatus() {
		return holderSmokingStatus;
	}

	/**
	 * Retrieves the weight of policy holder
	 * 
	 * @return weight of policy holder
	 */
	public double getHolderWeight() {
		return holderWeight;
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
	public void setHolderHeight(double holderHeight) {
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
	public void setHolderSmokingStatus(String holderSmokingStatus) {
		this.holderSmokingStatus = holderSmokingStatus;
	}

	/**
	 * Sets weight of policy holder in lbs
	 * 
	 * @param holderWeight weight of policy holder in lbs
	 */
	public void setHolderWeight(double holderWeight) {
		this.holderWeight = holderWeight;
	}

	@Override
	public String toString() {

		return "***** PolicyHolder ****" + "\n this.holderFirstName= " + this.holderFirstName +
				"\n this.holderLastName=" + this.holderLastName + "\n this.holderAge=" +
				this.holderAge + "\n this.holderHeight=" + this.holderHeight +
				"\n this.holderWeight = " + this.holderWeight + "\n this.holderSmokingStatus=" +
				this.holderSmokingStatus;
	}

}
