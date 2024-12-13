/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();

		System.out.println("How old are you??");
		int age = sc.nextInt();
	
		System.out.println("What is your birth month");
		int month = sc.nextInt();

		System.out.println("What is your birth day?");
		int day = sc.nextInt();
		
		System.out.println("What is your birth year?");
		int year = sc.nextInt();
		
		System.out.println("How much is a buck fifty?");
		double buck = sc.nextDouble();
		
		System.out.println("So you'r name is "+ name + " and you are " +age +" years old. And You were born on "+ month +"/"+ day+"/"+year+". And you think a buck fifty is "+buck);
	}
}
