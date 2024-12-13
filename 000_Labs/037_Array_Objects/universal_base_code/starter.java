/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior [] warrior = new Warrior[100];
		Wizard [] wizard = new Wizard[100];
		int wizzards_alive = 100;
		int warriors_alive = 100;
		int i = 0;
		int c = 0;
							for(int v = 0; v < warrior.length;v++){
							warrior[v] = new Warrior();
							}
							for(int v = 0; v < wizard.length;v\++){
							wizard[v] = new Wizard();
							}
		boolean tof = true;
		while( tof = true){
			wizard[i].attack(warrior[c]);
			warrior[c].attack(wizard[i]);
			if(wizard[i].isDead()){
				i++;
				wizzards_alive--;
		//		System.out.println("A wizzard died, remaing : "+ wizzards_alive);
			}
			if(warrior[c].isDead()){
				c++;
				warriors_alive--;
		// 		System.out.println("A warrior died, remaing : "+ warriors_alive);
			}
			if(wizzards_alive == 0){
				System.out.println("The warrior's won with "+warriors_alive + " warriors alive" );
				break;
			}
			if(warriors_alive == 0){
				System.out.println("The wizard's won with "+wizzards_alive + " wizards alive" );
				break;
			}
			
		}
		
		
	}
}
