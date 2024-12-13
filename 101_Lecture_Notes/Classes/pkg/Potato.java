/* 
    Lecture note example - Classes
*/
package pkg;

public class Potato{
    //global variable
    String color;
    boolean isEdible;
    String type;
    double mass;
    
    //constructors
    public Potato(){
        color = "brown";
        isEdible = true;
        type = "French fry";
        mass = 170.5;
    }
    public Potato(String c, String t,double m){
        color = c;
        type = t;
        mass = m;
        isEdible = false;
    }
    //methods
    public boolean getEdibility(){
        return isEdible;
    }
}