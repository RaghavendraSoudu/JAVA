package arrays.java;

import java.util.*;

import java.util.Scanner;

public class Secondlargest {
	public static void main(String[] args)
	{

		
		int D[]= {3,6,3,64,79,5,35,88,4,2,22,45,78,99};
		
		int max1,max2;//taking two variables 
		
		max1=max2=D[0];//Here Max1 and Max2 are assigned with arrays index variable
	
		
		for (int i=0;i<D.length;i++) {
			if(D[i]>max1)
			{
				max2=max1;//Here if the max 1 value greater than previo8us value then assihned it with max 2
				max1=D[i];//Again max 1 assigned with running highest index value
				}
			
			else if(D[i]>max2)
			{
				max2=D[i];//here if the element gnot greater than max 1 may be but greater than max 2 so wen check that
				
			
			}
		}
		System.out.println(max2);
		
	}


}
