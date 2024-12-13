/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = Math.max(a,b);
		double d = Math.sqrt(b);
		double e =Math.pow(a,b);
		System.out.println(c);
		System.out.println(d);
		System.out.print(e);
}
}
