/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5,7,9,2,8,3,8,1};
//        for(int i = 0;i<arr.length-1; i++){
//            System.out,print(arr[i]+arr[i+1]);
//        }
            int dupeCheck = 8;
        for(int i = 0; i < arr.length; i++){
            if(dupeCheck == arr[i]){
                System.out.println(i);
            }
        }
             for(int i = 0; i < arr.length; i++){
            if( arr[i] == arr[i++]){
            System.out.println(arr[i]+","+arr[i++]);
            }
        }
	
}