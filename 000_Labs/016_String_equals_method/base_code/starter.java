/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please pick a class.\n Wizard, Warrior, or Rogue");
		String class2 = sc.nextLine();
		if(class2.equals("Wizard")){
			System.out.println("You chose to be a "+class2);
		}else if(class2.equals("wizard")){
			System.out.println("You chose to be a "+class2);
		}
		if(class2.equals("Warrior")){
			System.out.println("You chose to be a "+class2);
		}else if(class2.equals("warrior")){
			System.out.println("You chose to be a "+class2);
		}
		if(class2.equals("Rouge")){
			System.out.println("You chose to be a "+class2);
		}else if(class2.equals("rouge")){
			System.out.println("You chose to be a "+class2);
		}
		else{
			System.out.print("You entered something that was not set, please try again")
		}

	}
}

