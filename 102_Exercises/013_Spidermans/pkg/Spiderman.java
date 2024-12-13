package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	public Spiderman(){
		actor = "Unknown";
		age = 0;
		villain = "Unknown"; 
	}
	public Spiderman(String a){
		actor = a;
		age = 0;
		villain = "Unkown";
	}
	public Spiderman(int ag){
		actor = "Unkown";
		age = ag;
		villain = "Unkown";
	}
	public Spiderman(String act, int a){
		actor = act;
		age = a;
		villain = "Unkown";
	}
	public Spiderman(int a, String v){
		actor = "Unkown";
		age = a;
		villain = v;
	}
	public Spiderman(String act,int a, String v){
		actor = act;
		age = a;
		villain = v;
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setage(int age){
		this.age = age;
	}
	public void setvillain(String villain){
		this.villain = villain;
	}
	public void setactor(String actor){
		this.actor = actor;
	}
	public int getAge(){
		return age;
	}
	public String getvillain(){
		return villain;
	}
	public String getactor(){
		return actor;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
