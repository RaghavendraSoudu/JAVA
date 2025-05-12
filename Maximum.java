package arrays.java;

import java.util.Scanner;

public class Maximum {
	
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		
		int D[]= {3,6,3,64,79,5,35,89,4,2,22,45,78,89};
		
		int max=D[0];//taking a variable that assigned with index of array elements
	
		
		for (int i=0;i<D.length;i++) {
			if(D[i]>max);//here if the array value greater than max then it will asiighn it so that here 
			//it will checking the values continuesly in a loop then assigned maximu value
			{
				max=D[i];//Here assigned max value to it then we can print it
				}
		}
		System.out.println(max);
		
	}

}

