package singleton;

public class Test {
	public static void main(String[] args) {
		
		PinterUtils p1= PinterUtils.getInstance();
		PinterUtils p2= PinterUtils.getInstance();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
		p1.printJob();
		p2.printJob();
	}

}
