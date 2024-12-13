/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("please enter a sentence");
		String sentence = sc.nextLine();

String Nw = "";
while(true){
         
         if(sentence.indexOf(" ")==-1){
             Nw = sentence +" "+Nw;
             System.out.println(Nw);
             break;
         }
         int space = sentence.indexOf(" ");
			String word = sentence.substring(0,space);
			Nw = word +" "+Nw;
			sentence = sentence.substring(space+1);
	}

}

}
