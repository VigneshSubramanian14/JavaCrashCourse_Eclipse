package com.DefaultConstructor;

public class Student {
	
	//Complier will create a student constructor which we cannot see
	
	String Vignesh;
	int rollno; // int is an Access modifier
	Integer rollnos; // Integer is an wrapper class
	

	public static void main(String[] args) {
		
		Student student = new Student();
		
		System.out.println(student.Vignesh);
		System.out.println(student.rollno);
		System.out.println(student.rollnos);
		

	}

}
