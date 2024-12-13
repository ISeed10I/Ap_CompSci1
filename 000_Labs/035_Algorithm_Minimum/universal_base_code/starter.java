/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int x = (int)(50+(Math.random() * 151));
		BaseClass test = new BaseClass(x);
		test.setvalues();
		System.out.println("----------");
		test.min();
		System.out.println("----------");
		test.max();
		System.out.println("----------");
		test.average();
		
		
	}
}
