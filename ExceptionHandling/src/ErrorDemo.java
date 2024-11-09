
public class ErrorDemo {
 
	public void m1() {
		m2();
		System.out.println("java");
		
	}
	public void m2() {
		m1();
		System.out.println("python");
		
	}
	public static void main(String[] args)
	
	{
		 ErrorDemo e=new  ErrorDemo();
		 e.m2();
	}
	

}
