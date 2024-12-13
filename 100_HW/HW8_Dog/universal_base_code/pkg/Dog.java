package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	        Random rand = new Random();

	String name;
	int age;
	String breed;
	boolean tof = true;
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big Red Dog";
	}
		//	Name
		public Dog(String Nameuser){
			name = Nameuser;
			age = 1;
			breed = "dog dog";
		}
		//Age
		public Dog(int ageuser,String Nameuser){
			name = Nameuser;
			age = ageuser;
			breed = "dog dog ";
		}
		//Breed
		public Dog(String breedUser,String Nameuser){
			name = Nameuser;
			age = 1;
			breed = breedUser;
		}
	// Methods
	public void setName(String user){
		name = user;
	}

	public void setAge(int user){
		age = user;
	}
	public void setBreed(String user){
		breed = user;
	}

	// Set methods?
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	public String getBreed(){
		return breed;
	}
	// More methods+dlc+expansionpack+postlaunchcontent+newgameplus+Onlinemultipayer+co-op multiplayer+couch-co-opmultiplayer+more+gta6+idkwhyimdoingthis+releasedate+2089
	public boolean isSleeping(){
		int rand_int = rand.nextInt(101);
		if (rand_int <= 50){
			tof = true;
		}else if ( rand_int > 50){
			tof = false;
		}
		return tof;
	}

	public void bark(){
		tof = isSleeping();
	if(tof == false){
		System.out.println(name + " barks!" );
	}else if(tof == true){
		System.out.println(name + " is asleep");
	}
}


}
