
public class FinallyDemo{
public static void main(String[] args) {
	String s=null;
	//System.out.println("hello");
	try {
		//System.exit(0);
		System.out.println(s.charAt(0));
		System.out.println("risky code");
	}
	catch(NullPointerException e) {
		System.out.println("nothing");
		System.out.println("handling code");
	}
	finally{//whether exception handle it will execute
		System.out.println("finally");
		System.out.println("clean up down");
	}
	System.out.println("tata");
}
}
