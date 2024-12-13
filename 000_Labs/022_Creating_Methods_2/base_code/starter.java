/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {

	public static void main(String args[]) {
		
	System.out.print(pow(5,3) );
	}
	public static int pow( int a, int b){
	int a2 = 1;
	int count = 0;
	while( count < b){
		a2 = a2*a;
		count++;
	}
	return a2;
}


}
