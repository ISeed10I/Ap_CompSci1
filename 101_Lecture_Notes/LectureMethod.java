/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        greeting("Mathew");
        greeting("Amberdingus");
        greeting("Taqqurias#");
        double newSalery = raise(100000.0,3);
        System.out.println(newSalery);
	    newSalery = raise(newSalery, 6);
	    newSalery = raise(newSalery, 6);
	    newSalery = raise(newSalery, 6);
	    newSalery = raise(newSalery, 6);
	    System.out.println(newSalery);
        
    }
	private static double raise(double salery, int percent ){
	    double amount = salery + ( salery * (percent/100.0));
	    
	    return amount;
	} 
	public static void greeting(String name){
	    System.out.println("Yo "+ name+" the empire is pretty chill. Maybe like you could like, join it, or something");
	}
	public static void printAnimal(){
	    System.out.println(" _._      _,-'\"\"`-._");
	    System.out.println("(,-.`._,'(       |\\`-/|");
	    System.out.println("    `-.-' \\ )-`( , o o)");
	    System.out.println("         `-    \\`_'\"''-");
	}
	
	
	
}