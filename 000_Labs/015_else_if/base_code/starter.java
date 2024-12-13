/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  integer");
		int num = sc.nextInt();
		
	
		int x = (int)(Math.random() * 1000);
		if(num == x){
			System.out.println("you guessed correctly horray");
		}
		if else(num > x){
			System.out.println("too high");
		}
		
		if else(num<x){
			System.out.println("too low");
		}else{
			
		}
		
		
	}
}
