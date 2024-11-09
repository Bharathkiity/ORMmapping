
public class DifferentWaysToPrintExceptionInfo {
public static void m1() {
	System.out.println(10/0);
}
public static void m2() {
	m1();
	
}
public static void m3() {
	m2();
}
public static void main(String[] args) {
	try {
		m3();
	}	
	catch(ArithmeticException e) {
		e.printStackTrace();//Get Complete information
		System.out.println("===========");
		System.out.println(e.toString());
		System.out.println("===========");
		System.out.println(e.getMessage());//get only description
		
		}
	}
	
}

