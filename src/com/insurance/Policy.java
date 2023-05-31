package com.insurance;

public class Policy {

	// Added ncode to Policy Class
	private String providerName; // Provider Name
	private String holderFirstName; // policy holder's First Name
	private String holderLastName;// Policy Holder's Last Name

	
	private int holderAge;
	private int holderHeight; // inches
	private int holderWeight; // lbs
	private int policyNumber; // Policy Number
	private boolean holderSmokingStatus;


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

	public int bmiCalc(int holderWeight, int holderHeight) {

		return (holderWeight * 703) / (holderHeight * holderHeight);
	}

	public int getHolderAge() {
		return holderAge;
	}

	public String getHolderFirstName() {
		return holderFirstName;
	}

	public int getHolderHeight() {
		return holderHeight;
	}

	public String getHolderLastName() {
		return holderLastName;
	}

	public boolean getHolderSmokingStatus() {
		return holderSmokingStatus;
	}

	public int getHolderWeight() {
		return holderWeight;
	}

	public int getPolicyNumber() {
		return policyNumber;
	}

	
	public void setHolderAge(int holderAge) {
		this.holderAge = holderAge;
	}

	public void setHolderFirstName(String holderFirstName) {
		this.holderFirstName = holderFirstName.toUpperCase();
	}

	public void setHolderHeight(int holderHeight) {
		this.holderHeight = holderHeight;
	}

	public void setHolderLastName(String holderLastName) {
		this.holderLastName = holderLastName.toUpperCase();
	}

	public void setHolderSmokingStatus(boolean holderSmokingStatus) {
		this.holderSmokingStatus = holderSmokingStatus;
	}

	public void setHolderWeight(int holderWeight) {
		this.holderWeight = holderWeight;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName.toUpperCase();
	}


	public String getProviderName() {
		return providerName;
	}



}

//