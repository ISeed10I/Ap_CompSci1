/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Spiderman test = new Spiderman("bob");
	test.setage(32);
	test.setvillain("Joe");
	
	Spiderman two = new Spiderman("Tobey maguire",49,"Green Goblin");
	
	Spiderman three = new Spiderman("Andrew garfield", 41);
	three.setvillain("Electro");
	System.out.println("The villain is "+three.getvillain());
	}
}
