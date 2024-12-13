/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

public class starter{
    public static void main(String args[]) {
        // Your Code Goes here!
        Potato fry = new Potato();
            
        boolean x = fry.getEdibility();
        System.out.println(x);
        Potato sp = new Potato("blue","baked",100.0);
        System.out.println(sp.getEdibility());
        
	}
}