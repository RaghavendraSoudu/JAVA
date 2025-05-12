package TwoD.java;

public class Jaggedarrays {
	
	//this ome also samelike 2D array but the difference is we have different size of columns 
	public static void main(String[]args) {
		int A[][];
		A=new int [3][];//Here we passed the rows of the array only we need to give columns in below
		A[0]=new int[5];
		A[1]=new int[3];
		A[2]=new int [8];//Here we given the column length ususally we are not given any values so here the elements is 0's
		for(int i=0;i<A.length;i++) {//We can give ROW length here
			for (int j=0;j<A[i].length;j++) {// Here we dont know what is the bigger size ofcolumn so we can give j=A.[j] it will take max length
				System.out.print(A[i][j]);
			}
			System.out.println("");
		}
	}

}
