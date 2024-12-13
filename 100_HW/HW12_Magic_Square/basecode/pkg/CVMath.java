package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static int MagicSquare(int counter){
		boolean tof = true;
		int c = 1;
		int square = 1;
		
			for(int i = 2; counter > 0; i++ ){
				if(c == square*square){
					if(counter==1){
					return c;
					}
					System.out.println(c);
					counter--;
				}
				if(c> square*square){
					square++;
				}
				c = c +i;
			}
		return c;
	}
	
}
