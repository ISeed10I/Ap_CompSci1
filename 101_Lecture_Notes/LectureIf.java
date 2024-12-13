/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        			Scanner sc = new Scanner(System.in);
    System.out.println("You find yourself in a dimly lit room, heart racing. A countdown timer on the wall reads 60 seconds.\n You have no idea how you got here, but a voice crackles through a speaker\n: “You have one minute to make your choice. Choose wisely, or it’s game over.”");
       System.out.println( "You see three doors in front of you, each labeled with a different word:");
        System.out.println( "1. Open the door labeled 'escaped'");
        System.out.println( "2. Open the door labeled 'Truth.'");
        System.out.println( "3. Open the door labeled 'Sacrifice.'");
        int awns = sc.nextInt();
        
        if(awns == 1){
            awns = 0;
            System.out.println("You rush through the door labeled 'Escape' and find a narrow hallway. At the end, there are two exits: one leading outside and another to a staircase.");
	        System.out.println("1. Take the exit to the outside. ");
	        System.out.println("2. Run up the staircase. ");
	        int awns = sc.nextInt();
	        if (awns == 1){ 
	            System.out.println("Right as you had fully opened the door, a spear is thrown at you as it peirces your body you hear a mocking laugh.");
	        }
	        else if(awns == 2){
	            System.out.println("As you ran up the staircase, your exhaustion takes overand you fall over. With not safty railings to protect you, you fall off the stairs and hit the floor your head flatened due to the impact, You died.");
	        }
            
        }
    	    else if(awns == 2){
                
    	    }
	    else if(awns == 3){
            
	    }
	    else{
	        System.out.println("Just follow the guidlines breh");
	    }
}
}