package Methods;

public class First {

	
	//signature methodtype methodname(Parameter type)
		
		static int  max(int a ,int b) {
			
			if (a>b) {
				return a;
			}
				else 
					return b;
			}
		
		public static void main(String[] args) {
			
			//This is used for if the method having static is included 
			//If there os no static included in method we used as 
//			First mt=new First();We can use this if we have non static method
			
			int a=3,b=15;
//			int C =(mt.max(a,b));This is for non static
			int C=(max(a,b));
			
			System.out.println(C);
		}
		

	}


