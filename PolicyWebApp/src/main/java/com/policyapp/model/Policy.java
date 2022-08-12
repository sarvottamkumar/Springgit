package com.policyapp.model;

public class Policy {
	
	private String policyName;
	private int policyNumber;
	private double premium;
	private String type;
	private String category;
	private int duration;
	private String brand;
	private String coverage;
	private double sumAssured;
	
	
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public double getSumInsured() {
		return sumAssured;
	}
	public void setSumInsured(double sumInsured) {
		this.sumAssured = sumInsured;
	}
	
	@Override
	public String toString() {
		return "Plan [policyName=" + policyName + ", policyNumber=" + policyNumber + ", premium=" + premium + ", type="
				+ type + ", category=" + category + ", duration=" + duration + ", brand=" + brand + ", coverage="
				+ coverage + ", sumInsured=" + sumAssured + "]";
	}
	

}
