/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		System.out.println("Please enter a word:");
		String User = sc.nextLine();
		for(int i = 0; i < User.length(); i++){
		System.out.println(i+" "+ User.substring(i,i+1));
		}
		
		

		
	}
}
