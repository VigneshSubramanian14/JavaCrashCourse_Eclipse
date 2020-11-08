package com.ParameterizedConstructor;

public class DepartmentalStore {
	
	String Biscuit;
	
	
	DepartmentalStore(String name){
		Biscuit = name;

	}
	
	public void GeneralType() {
		
		System.out.println("The name is: "+Biscuit);
		
	}
	

	public static void main(String[] args) {
		DepartmentalStore store = new DepartmentalStore("Caramilk");
		store.GeneralType();
		
		DepartmentalStore store2 = new DepartmentalStore("DiaryMilk");
		store2.GeneralType();
		
		DepartmentalStore store3 = new DepartmentalStore("MilkyBar");
		store3.GeneralType();
		
		DepartmentalStore store4 = new DepartmentalStore("FerroRocher");
		store4.GeneralType();
		
		DepartmentalStore store5 = new DepartmentalStore("Thenmittai");
		store5.GeneralType();
		
		DepartmentalStore store6 = new DepartmentalStore("KadalaiMittai");
		store6.GeneralType();
		
		DepartmentalStore store7 = new DepartmentalStore("Mittai");
		store7.GeneralType();
		
		DepartmentalStore store8 = new DepartmentalStore("Gems");
		store8.GeneralType();
		
		DepartmentalStore store9 = new DepartmentalStore("Bubblegum");
		store9.GeneralType();
		
		DepartmentalStore store10 = new DepartmentalStore("Chicklet");
		store10.GeneralType();

	}

}
