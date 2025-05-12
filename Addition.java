package TwoD.java;

public class Addition {
	
	public static void main(String[] args) {
		int A[][]= {{1,2,3},{6,8,4},{5,2,8}};
		int B[][]= {{4,7,2},{5,8,9},{32,78,34}};
		
		//Here we decleare a new array wihch ois used to store the elements of addition
		
		
		int C[][]=new int[3][3];
		
		//Here we used to for loop to traverse between arrays
		//Here we can use either A or b for traverse reference
		for(int i=0;i<A/*or B*/.length;i++) {
			for(int j=0;j<A/*or B*/[0].length;j++) {
				//Here we addiding result into C 
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		
		//for each loop to print C array values
		
		for(int x[]:C) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println("");
			
			
		}
	}

}
