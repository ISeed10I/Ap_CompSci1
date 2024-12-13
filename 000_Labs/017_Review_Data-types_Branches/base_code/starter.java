/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
			Scanner sc = new Scanner(System.in);
	//-------------------------------Name--------------------------------------------
			System.out.println("What is your name?");
			String Name = sc.nextLine();
			System.out.println("What is your title");
			String title = sc.nextLine();
	//------------------------------Class-------------------------------------------
		System.out.println("Please pick a class.\n Wizard, Warrior, or Rogue");
		String class2 = sc.nextLine();
		if(class2.equals("Wizard")){
			System.out.println("You chose to be a "+class2);
		}else if(class2.equals("wizard")){
			System.out.println("You chose to be a "+class2);
		}
		else if(class2.equals("Warrior")){
			System.out.println("You chose to be a "+class2);
		}else if(class2.equals("warrior")){
			System.out.println("You chose to be a "+class2);
		}
		else if(class2.equals("Rouge")){
			System.out.println("You chose to be a "+class2);
		}else if(class2.equals("rouge")){
			System.out.println("You chose to be a "+class2);
		}
		else{
			System.out.print("You entered something that was not set, please try again");
		}
		//------------------------------Points-------------------------------------------
int points = 20;
int dex = 0;
int stre= 0;
int intel=0;
int rizz=0;//Charisma
System.out.println("You have 20 points to spend on strength, dexterity, inteligence, and charisma.");
System.out.println("How many points would you like to put into strength?(1-10)");
int user = sc.nextInt();
if(user > 10 ){
	System.out.print("please select a lower integer");
}else{
	stre = user;
	System.out.println("Strength = "+ stre);
	points = points - user;
	System.out.println("You have "+ points+ " points left" );
}


System.out.println("How many points would you like to put into Dexterity?(1-10)");
int user1 = sc.nextInt();
if(user1 > 10 ){
	System.out.print("please select a lower integer");
}else{
	dex = user1;
	System.out.println("Strength = "+ dex);
	points = points - user1;
	System.out.println("You have "+ points+ " points left" );
}


System.out.println("How many points would you like to put into Inteligence?(1-10)");
int user2 = sc.nextInt();
if(user2 > 10 ){
	System.out.print("please select a lower integer");
}else{
	intel = user2;
	System.out.println("Strength = "+ intel);
	points = points - user2;
	System.out.println("You have "+ points+ " points left" );
}

System.out.println("How many points would you like to put into charisma?(1-10)");
int user3 = sc.nextInt();
if(user3 > 10 ){
	System.out.print("please select a lower integer");
}else{
	rizz = user3;
	System.out.println("Strength = "+ rizz);
	points = points - user3;
	System.out.println("You have "+ points+ " points left" );
}

//------------------------------end-------------------------------------------
System.out.println("----------------------------------------------------------------");
System.out.println("You are "+ Name + " the "+ title );
System.out.println("And you are a "+ class2);
System.out.println("Stats:\n Strength: "+ stre +"\n Dexterity: "+ dex+"\n Charisma: "+ rizz+"\n Inteligence: "+ intel);
	}
}
