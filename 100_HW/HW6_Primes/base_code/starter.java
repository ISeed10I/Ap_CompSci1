import java.util.Scanner;
            
class starter {

        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer  ");    
        int prime = sc.nextInt();
        System.out.println("The prime numbrs lower than " + prime + " are: ");
        printPrimes(prime);


    }
    
        public static boolean checkPrime(int a){
        int b = a - 1;
        boolean c = false;
        while(b > 1){
        if(a % b == 0){
        c = false;
        break;
    }
            
        c = true;
        b--;
    }
        return c;
    }


        public static void printPrimes(int b){
        boolean tof;
        while(b >=0){
        tof = checkPrime(b);
        if(tof == true){
       System.out.println(b);
    }
        else if(b == 2){
        System.out.println(b);
    }
        b--;
    }
        return;
    }

}
