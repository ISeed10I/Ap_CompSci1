/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first integer");
		int num = sc.nextInt();
		System.out.println("Enter your seccond integer");
		int num2 = sc.nextInt();
		System.out.println("Enter your thid integer");
		int num3 = sc.nextInt();
		
		if(num>num2 && num >num3){
			System.out.println(num + " is the greatest value ");
		}
		else if(num2>num && num2 >num3){
			System.out.println(num2 + " is the greatest value ");
		}
		else if(num3>num && num3 >num2){
			System.out.println(num3 + " is the greatest value ");
		}
		
		if(num<num2 && num <num3){
			System.out.println(num + " is the lowest value ");
		}
		else if(num2<num && num2 <num3){
			System.out.println(num2 + " is the lowest value ");
		}
		else if(num3<num && num3 <num2){
			System.out.println(num3 + " is the lowest value ");
		}
		
		
	}
}
