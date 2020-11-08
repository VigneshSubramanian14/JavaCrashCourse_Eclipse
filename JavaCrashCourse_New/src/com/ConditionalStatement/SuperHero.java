package com.ConditionalStatement;

// Switch statement

public class SuperHero {
	
	String hero = "Captain America";
	
	
	public void SuperHeroOrNot() {
	
		switch (hero) {
		case "Ironman":
			System.out.println("You have guessed ironman");
			break;
		case "Thor":
			System.out.println("You have guessed Thor");
			break;
		case "Captain America":
			System.out.println("You have guessed Captain America");
			break;
		case "Captain Marvel":
			System.out.println("You have guessed Captain Marvel");
			break;
		case "Antman":
			System.out.println("You have guessed Antman");
			break;
		case "BlackWidow":
			System.out.println("You have guessed BlackWidow");
			break;
			

		default:
			
			System.out.println("You did guess the correct Superhero");
			
		}
		
		
	}


	public static void main(String[] args) {
		
		SuperHero hero = new SuperHero();
				
				hero.SuperHeroOrNot();
	
	}

}
