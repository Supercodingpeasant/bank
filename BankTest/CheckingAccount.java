package com.jxlg.software.Demon3;

public class CheckingAccount extends Account {
	private double overdraft;
	public CheckingAccount(double balance,double overdraft){
		super(balance);
		this.overdraft=overdraft;
	}
	public CheckingAccount(double balance){
		this(balance, 0.0);
	}
	public boolean withdraw(double amount){
		if(amount<balance+overdraft){
			balance-=amount;
			return true;
		}
		else
			return false;
	}
	public double getOverdraft(){
		return overdraft;
	}
}
