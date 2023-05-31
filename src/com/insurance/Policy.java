package com.insurance;

public class Policy {

	int policyNumber; // Policy Number
	String providerName; // Provider Name
	String holderFirstName; // policy holder's First Name
	String holderLastName;// Policy Holder's Last Name
	int holderAge;
	String holderSmokingStatus;// true or false
	int holderHeight; // inches
	int holderWeight; // lbs

	public Policy() {
		this.policyNumber = 0;
		this.providerName = "";
		this.holderFirstName = "";
		this.holderLastName = "";
		this.holderAge = 0;
		this.holderSmokingStatus = "";
		this.holderHeight = 0;
		this.holderWeight = 0;

	}

	public Policy(
			int policyNumber,
			String providerName,
			String holderFirstName,
			String holderLastName,
			int holderAge,
			String holderSmokingStatus,
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

	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName.toUpperCase();
	}

	public String getHolderFirstName() {
		return holderFirstName;
	}

	public void setHolderFirstName(String holderFirstName) {
		this.holderFirstName = holderFirstName.toUpperCase();
	}

	public String getHolderLastName() {
		return holderLastName;
	}

	public void setHolderLastName(String holderLastName) {
		this.holderLastName = holderLastName.toUpperCase();
	}

	public int getHolderAge() {
		return holderAge;
	}

	public void setHolderAge(int holderAge) {
		this.holderAge = holderAge;
	}

	public String getHolderSmokingStatus() {
		return holderSmokingStatus;
	}

	public void setHolderSmokingStatus(String holderSmokingStatus) {
		this.holderSmokingStatus = holderSmokingStatus.toUpperCase();
	}

	public int getHolderHeight() {
		return holderHeight;
	}

	public void setHolderHeight(int holderHeight) {
		this.holderHeight = holderHeight;
	}

	public int getHolderWeight() {
		return holderWeight;
	}

	public void setHolderWeight(int holderWeight) {
		this.holderWeight = holderWeight;
	}

	public double policyPriceCalc(int holderAge, int holderWeight, int holderHeight,
			String holderSmokingStatus) {

		double policyPrice = 600.00;

		if (this.holderAge > 50) {
			policyPrice += 75.00;
		}

		if (this.holderSmokingStatus.matches("smoker")) {
			policyPrice += 100;
		}

		if (bmiCalc(this.holderWeight, this.holderHeight) > 35) {
			policyPrice += (bmiCalc(this.holderWeight, this.holderHeight) - 35) * 20;
		}
		return policyPrice;
	}

}

//