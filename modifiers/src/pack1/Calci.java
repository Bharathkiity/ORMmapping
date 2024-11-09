package pack1;
//default scope //no var upto pack we can acess

public class Calci {
   static final double PI_VALUE=3.14;
   // PUBLIC ACESS ANYWHERE within pack (pack1)outside package(pack2)
	public static final int  MATHS_VALUE=10;
	
	private  int length=5;
	protected int size=5;
	//default access with in pack1
	 int findSquare(int num) {
		return num*num;	
	}
	public int findCube(int num) {
		return num*num*num;	
	}
	//access with in class
	private int findTotal(int a,int b) {
		return a+b;
	}
	protected int doubleIt(int num) {
		return num;
	}
	
}
