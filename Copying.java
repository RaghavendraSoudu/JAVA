package arrays.java;

public class Copying {

	
	public static void main(String[] args)
{
		
		int A[]= {3,6,3,64,79,5,35,89,4,2,22,45,78,89};
		int B[]= new int[15];
		
		for(int i=0;i<A.length;i++) {
			
			int index=0;
			B[i]=A[i];
		}
		
		for(int x:B) {
			System.out.println(x);
			
			
		}

		}

	
}

