/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
			boolean tof;
			System.out.println("Enter your first integer");
		int num = sc.nextInt();
	
	System.out.println("Enter your seccond integer");
		int num2 = sc.nextInt();
	
		
		if( num==num2){
			tof = true;
			System.out.println("true "+ num +" Equals " +num2);
		}else{
			tof = false;
			System.out.println("False "+ num +" Does not equal " +num2);
		}
	}
}
