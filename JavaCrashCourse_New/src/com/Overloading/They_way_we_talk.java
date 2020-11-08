package com.Overloading;

public class They_way_we_talk {

	public void talk(Parents StyleOfTalking) {
		
		System.out.println("We talk in a Obedient manner");
	}
	
	public void talk(Partner StyleOfTalking) {
		
		System.out.println("We talk in a friendly manner");
	}
	
	public void talk(Boss StyleOfTalking) {
		
		System.out.println("We talk in a Respectful manner");
	}
	
	
	public static void main(String[] args) {

		They_way_we_talk talk = new They_way_we_talk();
		
		Parents parents = new Parents();
		talk.talk(parents);
		
		Partner partner = new Partner();
		talk.talk(partner);
		
		Boss boss = new Boss();
		talk.talk(boss);

	}

}
