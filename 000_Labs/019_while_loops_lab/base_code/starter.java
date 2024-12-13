/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
			Scanner sc = new Scanner(System.in);
System.out.println("What name would you like to print?");
			String Name = sc.nextLine();
System.out.println("How many times would you like to print this name?");
int user = sc.nextInt();
int b = 0;
	while(true){
		System.out.println(Name);
		if(b >= user){
			break;
		}
	b++;
	}


		
	}
}
