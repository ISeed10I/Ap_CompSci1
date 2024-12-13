/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a integer");
		int num = sc.nextInt();
		System.out.println("the next 5 integers after "+ num + " are");
		System.out.print(num+", ");
		num=num+1;
		System.out.print(num+", ");
		num=num+1;
		System.out.print(num+", ");
		num=num+1;
		System.out.print(num+", ");
		num=num+1;
		System.out.print(num+", ");
		num=num+1;
		System.out.println(num+", ");
		num=num-5;
		System.out.println("the next 5 mulitples of "+ num + " are");
		System.out.print(num*1+", ");
		System.out.print(num*2+", ");
		System.out.print(num*3+", ");
		System.out.print(num*4+", ");
		System.out.println(num*5+", ");
			System.out.println( num + " divided by a 100 is");
			double deci = 100;
			double deci2 = 10;
		System.out.println(num/deci);
			System.out.println( num + " divided by a 10 is");
		System.out.println(num/deci2);
	}
}
