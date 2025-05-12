package arrays.java;

public class Reverse {
	
	public static void main(String[] args)
	{
			
			int A[]= {3,6,3,64,79,5,35,89,4,2,22,45,78,89};
			int B[]= new int[15];
			
			for(int i=A.length-1,j=0;i>=0;i--,j++) {
				
				
				B[j]=A[i];
			}
			
			for(int x:B) {
				System.out.println(x);
				
				
			}

			}

}
