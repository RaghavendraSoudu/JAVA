package Methods;

public class IsPrime {
	
	
	static boolean isPrimenumber(int n) 
	{
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0) 
				return false;
			}
			return true;
		}
		
	public static void main(String[] args) {
//		if(isPrimenumber(91));
		System.out.println(isPrimenumber(91));
	
	
	}

}
