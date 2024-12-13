/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
					 		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules: \n 1. Each player starts with $100.\n 2. Input a wager less than your total amount of money.\n 3. The slot machine will roll 3 numbers from 1 to 10.\n a. If two numbers match, you double your money.\n b. If three numbers match, you triple your money. \n c. If none match, you lose your money.");
		System.out.println("-----------------------------------------");
		int money = 100;
		int bet;
		boolean t = true;
		boolean t2 = true;
		
while(t){

		System.out.println("You have "+ money + "$");
		System.out.println("Would you like to play? \n (yes/ Yes/ y / Y )");
		String awnser = sc.nextLine();
				t2 = true;
		 if ( awnser .equals("yes") ||awnser .equals("Yes")||awnser .equals("y")||awnser .equals("Y") ){
		 		System.out.println("How much money would you like to bet? :");
				 bet = sc.nextInt();
				 
				while(t2){
								 if(bet<= money&& bet > 0){ 
														int num = (int)(Math.random() * 10);
														int num2 = (int)(Math.random() * 10);
														int num3 = (int)(Math.random() * 10);
								 	System.out.println("-----------------------");
								    System.out.println("       "+num + " "+num2 + " "+num3 + " ");
								    System.out.println("-----------------------");
								    money = money -bet;
								    awnser = " ";
								    // Reminder you need to fix the double output for the continue maybe just switch it with would you like tto contine
								    // and just finish the check for double or ttripple  eqquals
								    			if(num == num2&& num2 == num3&& num == num3){
								    				System.out.println("JACKPOT"); 
								    				money = money +(bet*3);
								    			}
								    			else if(num == num2|| num2 == num3 || num == num3){
								    				System.out.println("Double");
								    				money = money +(bet*2);
								    			}else{
								    				System.out.println("You did not win");
								    			}
								    		break;
								    
								 }
										 else if(bet > money){
										 	System.out.println("please enter a lower integer");
										 	 bet = sc.nextInt();
										 }
								 else if(bet <0){
								 	System.out.println("Nice try, put a positive integer integer");
								 	 bet = sc.nextInt();
								 }else{
								 	System.out.println("please enter a valid integer");
								 	 bet = sc.nextInt();
								 }
								 awnser = " ";
							}
		 }
		 else if( awnser .equals("no") ||awnser .equals("No")||awnser .equals("n")||awnser .equals("N") ){
		 	System.out.print(" You finished with "+ money + " dollars");
		 	break;
		 }else if(awnser.equals("something")){
		 	System.out.println("Please enter a valid statement.");
		 	awnser = " ";
		 }
	

  }
}
}