package com.jxlg.software.Demon3;

public class SavingAccount extends Account {
	private double rate;
	public SavingAccount(double balance,double rate){
		super(balance);
		this.rate=rate;
	}
	public void setRate(double rate){
		this.rate=rate;
	}
	public double getRate(){
		return rate;
	}
}
