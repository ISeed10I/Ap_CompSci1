

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Role {
	String role;
	int dex;
	int charisma;
	int intel;
	int stre;

	public Role(){
	role = " No Role";
	dex = 0;
	charisma = 0;
	intel = 0;
	stre = 0;
    
		
	}
	public void myToString(){
		System.out.println("----------------------");
		System.out.println("Your role is : "+ role);
		System.out.println("Your dexterity is : " + dex);
		System.out.println("Your charisma is : " + charisma);
		System.out.println("Your intelegence is : "+intel);
		System.out.println("Your strength is : "+stre);
		System.out.println("-----------------------");
	}
	public void setRole(String userRole){
	
	if(userRole.equals("Wizard")|| userRole.equals("wizard")||userRole.equals("Rogue")||userRole.equals("rogue")|| userRole.equals("Warrior")||userRole.equals("warrior") ){
	userRole = "Incorect class entered";	
	}
	role = userRole;
	}
	public void setDex(int userdex){
		dex = userdex;
		if(userdex <= 0){
			dex = 0;
		}
	
	}
	public void setCharisma(int usercharisma){
		charisma = usercharisma;
		if(usercharisma <= 0){
			charisma = 0;
		}
	
	}
	public void setIntel(int userintel){
		intel = userintel;
		if(userintel <= 0){
			intel = 0;
		}
	
	}
	public void setStrength(int userstrength){
		stre = userstrength;
		if(userstrength <= 0){
			stre = 0;
		}
	
	}
	public boolean setAll(String s, int a, int b , int c , int d){
	boolean tof = true;
		if(s.equals(" No Role")){
			tof = true;
		}else{
			tof = false;
		}
		if(a <= 0 || b <= 0 || c <= 0 || d <= 0 ){
			tof = false;
		}
		else{
			tof = true;
		}
		return tof;
	}
	

}

