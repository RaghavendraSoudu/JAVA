








package arrays.java;

public class arrays {
	
	public static void main(String[] args) {
		int A[]=new int[10];
		int B[]= {1,2,3,4,5};
		int C[];
		C=new int[10];
		System.out.println(B[0]);//here we can print only index value refence at one only
		
//		for(int i=0;i<B.length;i++) {
//			System.out.println(B[i]);    //This is the for loop in below we use for each loop
//		}
		
		for(int i:B) {
			System.out.println(i);
		}
	}

}
