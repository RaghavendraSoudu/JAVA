package arrays.java;
//import java.util.*;

public class Rotationarray {
	
	public static void main(String[] args) {
		int A[]= {1,2,5,8,4,6735,78,98};
		int temp=A[0];
		
		//Running for loop to change the positions
		
		for(int i=1;i<A.length;i++) {
			A[i-1]=A[i];//Here if the value or index less than of actual index value i.e index-1 then we can assigned to A array
		}
		A[A.length-1]=temp;//Here again we can assign the values to temp 
		
		//Here we are using for each loop to print the array values
	
	

	for(int x:A) {
		System.out.print(x+",");
	System.out.print("");
	
	}

	}
	
}


