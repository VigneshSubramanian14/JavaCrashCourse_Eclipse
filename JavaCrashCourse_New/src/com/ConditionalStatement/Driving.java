package com.ConditionalStatement;

//if else condition

public class Driving {

	boolean tyre=true;
	
	
	public static void main(String[] args) {
		
		Driving driver = new Driving();
		
		if(driver.tyre) {// This line will only check the condition is true
			
			System.out.println("Take the car");
		}else {
			System.out.println("Fill the Air");
		}
		
		
		
	}

}
