/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	 Cipher breh = new Cipher();
 	System.out.println("Please enter a cipher you would like to decode:");
	String User = sc.nextLine();
	
		//	Regular Enode
	 //System.out.println(breh.encode(User));
	 
			// User inputed Key
			int Key = 14;
			System.out.println(breh.keyedEncode(User,Key)+"   "+ Key);
			
			
		//	Loop to find they key because i was lazy	
			// int Key = 0;
			// while ( Key < 37){
			// System.out.println(breh.keyedEncode(User,Key)+"   "+ Key);
			// Key++;
			// }
	}
}



