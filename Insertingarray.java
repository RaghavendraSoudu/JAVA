package arrays.java;

public class Insertingarray {
	
	public static void main(String[] args) {
		
		int A[]=new int[10];
	
		A[0]=5;A[1]=432;A[2]=53;A[3]=6;A[4]=8;A[5]=13;A[6]=53;
		
		int n=7;//the elements are 7 so we can take n=7 for running the loop
		

	for(int i=0;i<n;i++) {  //here we can run the loop with the help of n=7
		System.out.println(A[i]+",");
		
		System.out.println("");
	}
	int x=30; //Here we can take int value as what we can assign to middle index want
	int index=2;//Here we can take index as reference variable so that we can assigned here
	
	for(int i=n;i>index;i--) {//We can run the loop based on index in reverse order so that the loop comes to mentioned index which is 2 then it willl stop
		A[i]=A[i-1];//Assigning or moving index values to next index
		A[index]=x;//Here we can assign x=30 at index 2
	}
	
	for(int i=0;i<n;i++) {
		System.out.println(A[i]+",");
		
		System.out.println("");
	}
	
	

}
}
