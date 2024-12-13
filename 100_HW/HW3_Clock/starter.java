/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a day of the week with its corresponding number\n 0 = Sunday, 1 = Mon, 2 = Tue, 3 = Wed, etc...");
		int dotw = sc.nextInt();
			if( dotw == 0 || dotw == 6){
				System.out.print("Wake up at 10:00am");
			} else if ( 1<= dotw && dotw >=5  ){
				System.out.print("Wake up at 07:00am");
			}
	}
}




/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
		public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter an int to check its prime numbers");
	int prime = sc.nextInt();
	printPrimes(prime);
	}
	public static boolean checkPrime(int a){

		
    	for(int i = 2; i <= Math.sqrt(a); i++ ){
    	     
    		if (a % i == 0) {
    			
                return true; 
                
            }else{
            	
            
			return false; 
            }
		
    	}
    	return false;
	}
	public static void printPrimes(int c){

	int counter =c - 1;
	
	while( counter <= c && counter >=1){
	
		if( checkPrime(c) == false){
			System.out.println(c);
			
		}
		    c=c-1;
			counter= counter - 1;
	}
	}
	
}
