/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int dex;
	int charisma;
	int intel;
	int stre;

	public BaseClass() {
	role = " No Role";
	dex = 0;
	charisma = 0;
	intel = 0 ;
	stre = 0;
		
	}
	public BaseClass(String userRole) {
	role = userRole;
	dex = 0;
	charisma = 0;
	intel = 0 ;
	stre = 0;
		
	}

}

