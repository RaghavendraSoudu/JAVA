package TwoD.java;

public class Multiplication {
	
	public static void main(String[] args) {
		int A[][]= {{1,2,3},{6,8,4},{5,2,8}};
		int B[][]= {{4,7,2},{5,8,9},{32,78,34}};
		
		int C[][]=new int[3][3];
		//We are traverse with A and B array here
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A[0].length;j++) {
				//HERE WE Require 3 loops the third loop is required to traverse between K
				//C[0][1]=A{00}B{00}+A{01}B{10}+A{02}B{20}
				//C[0][1]=A{00}B{01}+A{01}B{11}+A{02}B{21} here first 0 is i and last 0or 1 is J in between there is a value which is common so we need to ake thisas K
				
				C[i][j]=0;
				//running another loop for K
				for(int K=0;K<3;K++) {
					C[i][j]=C[i][j]+A[i][K]+B[K][j];
				}
				
			}
		}
		
		for(int x[]:C) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println("");
		}
	}

}
