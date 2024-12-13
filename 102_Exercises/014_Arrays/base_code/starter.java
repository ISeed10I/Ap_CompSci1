/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001];
		 int [] arr2 = new int[1001];
		 int i = 0;
		 int e = 3;
		 int num = 1000;
		 while(i<10){
		 
		 	arr[i] = e;
		 	arr2[i] = num;
		 	System.out.println(arr[i]);
			System.out.println(arr2[i]);
		 	e = e + 3;
		 	num--;
		 	i++;
		 }
		 

	}
}
