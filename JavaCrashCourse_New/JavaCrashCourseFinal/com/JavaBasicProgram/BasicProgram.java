package com.JavaBasicProgram;

public class BasicProgram {
	
	Integer MatrimonialNumber = 123456789;
	
	String Name ="Vignesh";
	
	Integer PersonSalary = 20000;
	
	Double Height =  5.9;
	
	
	public void MatrimonialSite() {
		
		System.out.println("The Number for the person: "+MatrimonialNumber);
		
		System.out.println("The Person Name is: "+Name);
		
		System.out.println("The Person Salary is: "+PersonSalary);
		
		System.out.println("The person height is: "+Height);
	}
	
	
	

	public static void main(String[] args) {
		
		BasicProgram program = new BasicProgram();
		
		program.MatrimonialSite(); 
		

	}

}
