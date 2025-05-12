package Methods;

public class GCD {
	static int GCDs(int m, int n) {
		while(m!=n) 
		{//if the m not equals to n then devide it lare  num from small num
			if(m>n)m=m-n;
			else n=n-m;
		}
		return m;
		
	}
	public static void main(String[] args) {
		System.out.println(GCDs(35,56));
		
	}

}
