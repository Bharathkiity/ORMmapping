class myCalci{
	//methoad overload different parameters,arguments
	public static int findMax(int a ,int b) {
	return (a>b)? a:b;
	
}
	public static long findMax(long a ,long b) {
		return (a>b)? a:b;
		
	}
	public static double findMax(double a ,double b) {
		return (a>b)? a:b;
		
	}
	 public static void sum(int...a) {
//varaible length argument methoad or var arg methoad
//System.out.println(a); //... implemeneted array methoad
//added in java1.5 version//any type of arguments we call pass string,double ,float
		 int total=0;
		 for(int x:a) {//for each loop,enhanced loop
			 total=total+x;		 
		 }
		 System.out.println(total); 
	 } 
}

public class OverloadDemo {
	public static void main(String...args) {//strings args ...
		myCalci.sum(10);
		myCalci.sum();
		myCalci.sum(10,20);
		myCalci.sum(10,20,30);
		myCalci.sum(10,20,30,40);
		myCalci.sum(new int[] {10,20});
		
		
		 int maxInt= myCalci.findMax(100,200);
		 System.out.println(maxInt); 
		
		 long maxlong=myCalci.findMax(9988776655l,9988556665l);
		 System.out.println(maxlong);
		 
		 double maxdouble=myCalci.findMax(955.00,99.00);
		 System.out.println(maxdouble);
		 
	}

}
