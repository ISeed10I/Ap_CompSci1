/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Dog doguno = new Dog(2,"bob");
		doguno.setBreed("Alaskan Malamute");
		Dog dogdos = new Dog();
		System.out.println("What is your dogs name");
		String username = sc.nextLine();
		dogdos.setName(username);
		System.out.println("How old is " + dogdos.getName());
		int userage = sc.nextInt();
		dogdos.setAge(userage);
		System.out.println(doguno.getName()+ " is a dog and is "+ doguno.getName()+" years old");
		System.out.println(dogdos.getName()+ " is a dog and is "+ dogdos.getName()+" years old");
		
		boolean c = dogdos.isSleeping();
		boolean d = doguno.isSleeping();
		if(c == true && d == false ){
			doguno.bark();
			System.out.println(dogdos.getName() + " wakes up and barks	");
		}else if(c == false && d == false ){
			System.out.println(doguno.getName() + " Is asleep");
			System.out.println(dogdos.getName() + " stays asleep ");
		}

	}
}
