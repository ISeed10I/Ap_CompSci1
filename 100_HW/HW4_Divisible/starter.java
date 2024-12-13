/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
					Scanner sc = new Scanner(System.in);
		boolean tof1 = false;
		boolean tof2 = false;
		boolean tof3 = false;
		System.out.println("Please enter 2 integers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1 % 2== 0){
			System.out.println(num1 + " is even");
		}else{
			System.out.println(num1 + " is odd");
		}
		if(num2 % 2== 0){
			System.out.println(num2 + " is even");
		}else{
			System.out.println(num2 + " is odd");
		}
//---------------------------------------------------------------------
	  if(num1 % 3== 0){
			tof1 =  true;
	} if(num1 % 4== 0){
			tof2 = true;
	} if(num1 % 5== 0){
			tof3 = true;
	}
	if(tof1 == true && tof2  == true && tof3 == true){
		System.out.println(num1+" is divisible by 3, 4, and 5");
	}else{
		System.out.println(num1+" is not divisible by 3, 4, and 5");
	}
//---------------------------------------------------------------------
	  if(num1 % 3== 0){
			tof1 =  true;
	} if(num1 % 4== 0){
			tof2 = true;
	} if(num1 % 5== 0){
			tof3 = true;
	}
	if(tof1 == true && tof2  == true && tof3 == true){
		System.out.println(num1+" is divisible by 3, 4, and 5");
	}else{
		System.out.println(num1+" is not divisible by 3, 4, and 5");
	}
	
	
	
	
	
	}
}

