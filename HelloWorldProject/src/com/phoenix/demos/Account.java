package com.phoenix.demos;

public class Account {
	private int actId;
	String actName;
	public float actBalance = 5.00f;
	
	public void setActId(int v1) {
		
		actId = v1;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public float getActBalance() {
		return actBalance;
	}

	public void setActBalance(float actBalance) {
		this.actBalance = actBalance;
	}

	public int getActId() {
		return actId;
	}
	
	

}
