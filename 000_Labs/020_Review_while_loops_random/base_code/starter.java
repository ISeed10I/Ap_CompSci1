/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		// Your code goes below here
	int guess = 0;
	int secret = (int)(Math.random() * 100);
	while(true){
		System.out.println("please enter an integer.( 1-100) ");
		guess = sc.nextInt();
		if(guess == secret){
			System.out.println("you guess correctly!!");
			break;
		}
	
	}


		
	}
}
