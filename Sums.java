package arrays.java;

public class Sums {
	
	public static void main(String[] args) {
	
	int A[]= {2,4,6,0,3,8,3};
	int  sum=0;
	for(int i=0;i<A.length;i++) {
		sum=sum+A[i];
		
	}
	int add=0;
	//For each looop
	for(int x:A) {
		add=add+x;
	}
	
	
	System.out.println(sum);
	System.out.println(add);
}

}
