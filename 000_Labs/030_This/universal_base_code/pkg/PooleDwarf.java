/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}
		public PooleDwarf(String name){
		this.name = name;
		this.age = 1;
		// Complete this constructor
	}


	public PooleDwarf(String name, int age){
		this.name = name;
		this.age = age;
		// Complete this constructor
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		// Fix this method
		
	}
	
	public void setAge(String age){
		// Fix this method
	}

	public boolean isSameName(String name){
		// Complete this method
		boolean tof = true;
		if(this.name.equals(name)){
			tof = true;
		}else{
			tof = false;
		}
		return tof;
	}
}

