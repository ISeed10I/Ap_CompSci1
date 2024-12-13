/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
		System.out.println("please enter an integer");
		int numb1 = sc.nextInt();
		System.out.println("please enter a 2nd integer greater than the first");
		int numb2 = sc.nextInt();
		
		System.out.println("Your range is "+numb1 +", " + numb2 );
		int x = (int)( numb1+(Math.random() * (numb2- numb1) ));
		int c = (int)( numb1+(Math.random() * (numb2- numb1) ));
		int v = (int)( numb1+(Math.random() * (numb2- numb1) ));
		int b = (int)( numb1+(Math.random() * (numb2- numb1) ));
		int n = (int)( numb1+(Math.random() * (numb2- numb1) ));
		System.out.println("The five randomly generated numbers are");
		System.out.print(x +", " + c +", " + v +", " + b +", " + n);
	}
}
