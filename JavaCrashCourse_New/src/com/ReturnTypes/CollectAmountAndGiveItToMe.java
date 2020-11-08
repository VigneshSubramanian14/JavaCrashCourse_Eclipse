package com.ReturnTypes;

public class CollectAmountAndGiveItToMe {
	
	public double amount = 1000;
	
	
	public double CollectAmount() {
		
		System.out.println("Amount got collected : "+amount);
		return amount;
	}
	
	

	public static void main(String[] args) {
		
		
		CollectAmountAndGiveItToMe me = new CollectAmountAndGiveItToMe();
		
		double amount=me.CollectAmount();
		
		System.out.println("Amount received: "+amount);

	}

}
