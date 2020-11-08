package com.Overriding;

public class Girl extends Parents { 
	
	
	
	
@Override
public void GroomType() {
	
	System.out.println("The Girl needs a good looking husband with 1lakh salary");
}
	

	public static void main(String[] args) {

		Parents parents = new Girl();

		parents.GroomExpectation();
		parents.GroomType();
		

	}

}
