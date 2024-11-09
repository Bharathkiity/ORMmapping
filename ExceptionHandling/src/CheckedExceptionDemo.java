
public class CheckedExceptionDemo {
	public void m1() throws InterruptedException {
	System.out.println("hi......");
	Thread.sleep(5000);
	System.out.println("java...");
}
	public void m2() throws InterruptedException {
		m1();
	}
	public void m3() throws InterruptedException {
		m2();
	}
	
	public static void main(String[] args) throws InterruptedException {
//		//Thread.sleep(5000);
//		System.out.println("hi......");
//		Thread.sleep(5000);
//		System.out.println("java...");
//		Thread.sleep(5000);
//		System.out.println("java...");
		CheckedExceptionDemo d=new CheckedExceptionDemo();
		//d.m3();
		try {
			d.m3();
		}
		catch(InterruptedException e){
			System.out.println("interrupted");
		}
	}	
}
