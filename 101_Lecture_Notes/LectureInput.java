/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
        String Name = sc.nextLine();
        System.out.println("Hello "+ Name);
        
        System.out.println("please enter a number");
        int number1 = sc.nextInt();
        sc.nextLine();
         System.out.println("please enter a number");
        int number2 = sc.nextInt();
        sc.nextLine();
        System.out.println("The sum of these two numbers are:"+ (number1 + number2) );
        
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();
	}
}