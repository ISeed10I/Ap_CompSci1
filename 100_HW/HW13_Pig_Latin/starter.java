/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);		
		System.out.println("please enter a sentence");
		String sentence = sc.nextLine();
String [] arr = new String[]{"B", "b", "C", "c", "D", "d", "F", "f", "G", "g", "H", "h", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "P", "p", "Q", "q", "R", "r", "S", "s", "T", "t", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"};
String [] arr2 = new String[]{"A", "a","E", "e","I", "i","O", "o","U", "u"};
String Nw = " ";

String word = " ";
String temp1 = " ";
String temp2 = " ";
int a2 = 10;
int c = 0;
int space = 1;
sentence = sentence+" ";
while(sentence.indexOf(" ") != -1){

		for (int i = 0; i < arr.length; i++) {
					if(sentence.indexOf(" ") == -1){
					break;
					}

                space = sentence.indexOf(" ");
                word = sentence.substring(0, space);
                if(word.length()>0){
                temp1 = word.substring(0, 1); 
                }
                if(word.length()>1){
                temp2 = word.substring(1, 2); 
                }
                if (temp1.contains(arr2[c])) {
                    word = word + "-way";  
                    Nw = Nw + " " + word; 
                    c= 0;
                    sentence = sentence.substring(space + 1);
                }

                if(temp1.contains(arr[i])) {
                    word = word.substring(1); 
                    word = word + "-" + temp1 + "ay";  
                    Nw = Nw + " " + word;

                    c = 0;
                    i=0;
                    sentence = sentence.substring(space + 1);
                }else if(temp2.contains(arr[i])){
                    word = word.substring(2);  
                    word = word + "-" + temp1 +temp2+ "ay";  
                    Nw = Nw + " " + word;
                    c = 0;
                    i=0;
                    sentence = sentence.substring(space + 1);
                   
                }

                c++;
                if(c==10){
                	c=0;
                }
}
} 
                	word = sentence.substring(0);
                   System.out.println(Nw);

                
	}
	
}

