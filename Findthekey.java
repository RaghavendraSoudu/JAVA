package arrays.java;
import java.util.*;

public class Findthekey {
	
	public static void main(String[] args)
	{
		Scanner read=new Scanner(System.in);
		
		int D[]= {3,6,3,64,79,5,35,89,4,2,22,45,78,89};
		
		int key;
		
		System.out.println("Enter a key value");
		key=read.nextInt();
		
		for (int i=0;i<D.length;i++) {
			if(key==D[i])
			{
				System.out.println("ELement fount at index:"+i);
				System.exit(0);//This will used that after its matched with required statement then exit from the loop
			}
		}
		System.out.println("Key not found");
		
	}

}
