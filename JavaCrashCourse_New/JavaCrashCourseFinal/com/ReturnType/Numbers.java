package com.ReturnType;

public class Numbers {

	public int add() {
		
		int english = 90;
		int tamil = 100;
		
		int total = tamil + english;
		
		System.out.println("The total mark is :"+total);
		return total;
	}
	
	
	
	public static void main(String[] args) {
		
		Numbers numbers  = new Numbers();
		
		int latest = numbers.add();
		
		numbers.subtract(latest);
	
	
	}

	public void subtract(int updatedvalue) {
	
		System.out.println("The latest value is :"+updatedvalue );
		
		int c = 100;
		
		int latestinput = updatedvalue-c;
		
		System.out.println("The corrected value is :"+latestinput);
		
		
		
	}



}
