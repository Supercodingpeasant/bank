package com.jxlg.software.Demon3;

public class Bank {
	private Customer[] customers;
	private int custNum;
	public Bank(){
		customers=new Customer[10];
		custNum=0;
	}
	public void addCustomer(Customer customer){
		customers[custNum]=customer;
		custNum++;
	}
	public Customer getCustomer(int index){
		if(index>=0 && index<custNum){
			return customers[index];
		}
		else
			return null;
	}
	public int getCustomerNum(){
		return custNum;
	}
}
