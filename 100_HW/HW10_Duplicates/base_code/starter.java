/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
				int [] arr = new int[20];
				int [] arr2 = new int[20];//where the dupes are
				int [] arr3 = new int[10];
				int amount = 0;
				int v  = 0;
			//value set
				for(int i = 0; i< arr.length; i++){
				int x = (int)(1+(Math.random() * 10));
				arr[i] = x;
				System.out.println(x + ", "+ i);
			}
			System.out.println("--------");
			int rand = (int)(1+(Math.random() * 10));
			System.out.println(rand);
			System.out.println("--------");
			
			for(int i = 0; i< arr.length; i++){
				if(arr[i] == rand){
					
					arr2[v] = i;
					v++;
					amount++;
				}
			}
			System.out.print("The duplicates of "+ rand + " are located at ");
				for(int g = 0; arr2[g] != 0; g++){
					System.out.print(arr2[g]+",");
				}
				System.out.println(" the total amount of duplicates are "+ amount);
			//checking for two in a row
			System.out.println("----------");
			int num1 = 0;
			int num2 = 0;
			v = 1;
			amount = 0;
			for(int i = 0; i< arr.length; i++){
				if(arr[i] == arr[v]){
					num1 = i;
					num2 = v;
				}
				if(v == 19){
					i = 19;
				}{
				v++;	
				}
				
			}while(num1 <=19){
			if(num1 == 19){
				System.out.println("There were no two in a rows");
			}
			else{
					System.out.println("The two in a row was located at "+ num1 +", "+num2+" and the number was "+ arr[num1]);
				}
			}
			
			
			

	}
}
