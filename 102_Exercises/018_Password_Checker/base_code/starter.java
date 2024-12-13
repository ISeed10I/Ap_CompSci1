import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int x = 0;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            if(passwords[x].length()>= 8){
                s1++;
                f1 = true;
            }
            if(passwords[x].indexOf("!")!=-1||passwords[x].contains("#")||passwords[x].contains("@")||passwords[x].contains("$")||passwords[x].contains("%")||passwords[x].contains("*")||passwords[x].contains("^") ){
                s2++;
                f2=true;
            }
            if(f1 && f2 ){
                s3++;
            }
            x++;
            if(passwords.length == x){
                System.out.println("There are "+ s1 + " valid passwords for strength lv 1");
            System.out.println("There are "+ s2 + " valid passwords for strength lv 2");
            System.out.println("There are "+ s3 + " valid passwords for strength lv 3");
                break;
            }
	}
	        
}
}