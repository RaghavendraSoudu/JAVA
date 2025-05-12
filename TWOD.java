package TwoD.java;

public class TWOD {
	
	public static void main(String[] args) {
		int A [][]=new int[5][5];//Here its one of the method to create 5*5 arrays 
		int B[][]= {{1,2,3,4},{4,5,6,7},{8,9,10,11}};//This one also one of the method which are 
//		using to create array elemets directly and this is 3*4 Array
		
		for(int i=0;i<B.length;i++) {//Here we are using nasted loop to target row and column and i is targeted the row
			for(int j=0;j<B[0].length;j++) {//Here we can target the column using J and we can use any of the row either [0] or[1]or[2]or[3] this all are same level
				System.out.print(B[i][j]+" ");//Here we can print i and j value
			}
			System.out.println("");
			
			
//			//For each loop
//			for(int x[]:B) {//this is for each loop we can here target the row reference valie so ewe can use the x[] here
//				for(int y:x) {//here we can jump into another loop here we can assigned another variable to previous so we can get the valuuws column
//					System.out.println(y);
//				}
//			}
		}
	}

}
