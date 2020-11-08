package com.ReturnType;

public class Fight {

	String Bag1 = "Curd,";
	String Bag2 = "Rice";
	
	String TotalThingsWithMother = Bag1 + Bag2;
	
	public String MothersBag() {
		
		System.out.println("Current Things which mother is having: "+TotalThingsWithMother);
		return TotalThingsWithMother;
	}
	
	
	public static void main(String[] args) {
		
		Fight fight = new Fight();
		
		String Handover =fight.MothersBag();
		
		fight.SonsBag(Handover);
		


	}


	public void SonsBag(String SonsHandover) {
		
		
		System.out.println("The Bag got taken by son "+SonsHandover);
		
		String Bag1 = "Chocolate,";
		String Bag2 = "Biscuit,";
		
		String SonsCollection = Bag1+Bag2;
		
		String UpdatedBasket = SonsCollection + SonsHandover;
		
		System.out.printf("Son is updating the Basket "+UpdatedBasket);
		
		/*System.out.println(UpdatedBasket);*/
		
		
		
	}



}
