
public class BlocksDemo {
	static int x;
	static {	//one onlt time ex  
		
		x=10;
		System.out.println("static block");
	}
	{//object classs create call this instance
		System.out.println("instance block");
	}
	public BlocksDemo() {//can ex no of times --con and instance
		
		System.out.println("constructor");
	}
	public static void main(String[] args) {//main block
		//System.out.println(x);
		System.out.println("main()");
		System.out.println(x);
		new BlocksDemo();
		new BlocksDemo();
	}
	
	
}
