/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Role test = new Role();
		System.out.println(test.GiveRole());
		System.out.println(stats());
		System.out.println("==============================\n\n");
		System.out.println("Please pick a class:");
		String class2 = sc.nextLine();
		
			if(class2.equals("Wizard")|| class2.equals("wizard")||class2.equals("Rogue")||class2.equals("rogue")|| class2.equals("Warrior")||class2.equals("warrior") ){
				Role roletest = new Role(class2);
				System.out.println(roletest.GiveRole());
				System.out.println(stats());
			}else{
				Role roletest = new Role();
				System.out.println(roletest.GiveRole());
				System.out.println(stats());
			}

		
	}
	public static String stats(){
	String lazy = "Your strength trait is 0 \nYour dexterity trait is 0 \nYour intelligence trait is 0\nYour constitution trait is 0\nYour charisma trait is 0";
	return lazy;
		
	}
}
