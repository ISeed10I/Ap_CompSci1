/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("please enter a word");
		String sentence = sc.nextLine();
		while(true){
			if(sentence.indexOf(" ") == -1){
			break;
			}
			int space = sentence.indexOf("");
			String word = sentence.substring(0,space);
			System.out.println(spongeCase(word));
			sentence = senetnce.subString(space+1);
		}
		
	}
	public static String spongeCase(String Word){
		String Nw = "";
		for( int i = 0; i < word.length; i++){
			String Check = word.substring(i,i+1);
			if(i%2!=0){
				Check = Check.toUpperCase();
				Nw = Nw+Check;
			}if(i%2==0){
				Check = Check.toLowerCase();
				Nw = Nw+Check;
			}
			return Nw;
		}
	}
}
