/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int average;
	int [] arr;
	public BaseClass() {
	this.arr = new int[0];
		
	}
	public BaseClass(int x){
		this.arr = new int[x];
	}
	public void setvalues(){
		for(int i = 0; i< this.arr.length; i++){
			int x = (int)(1+(Math.random() * 100));
			this.arr[i] = x;
		}
	}
	public void min(){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i< this.arr.length; i++){
			if(this.arr[i]<min){
				min = this.arr[i];
			}
		}
		System.out.println(min);
	}
	public void max(){
	
		int max = 0;
			for(int i = 0; i < this.arr.length; i++){
			if(this.arr[i]>max){
				max = this.arr[i];
			}
		}
		System.out.println(max);
}
	public void average(){
		int temp= 0;
		for(int i = 0; i< this.arr.length; i++){
			temp = temp+this.arr[i];
		}
		this.average = temp/ this.arr.length;
		System.out.println(this.average);
	}

}

