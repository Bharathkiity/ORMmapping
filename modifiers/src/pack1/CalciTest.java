package pack1;

public class CalciTest {
public static void main(String[] args) {
	
	Calci c=new Calci();
	int result =c.findSquare(10);
	System.out.println(result);
	System.out.println(Calci.PI_VALUE);
	System.out.println(c.findCube(10));
	System.out.println(c.MATHS_VALUE);
	//System.out.println(c.length());
	System.out.println(c.doubleIt(10));
	
}
}
