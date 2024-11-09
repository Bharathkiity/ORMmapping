package singleton;

public class PinterUtils {
	 private static PinterUtils instance;
	  
	 private PinterUtils() {//stop object creation using private constructor
		 
	 }
	 public static PinterUtils getInstance() 
	 {
		if(instance==null) {
			instance=new PinterUtils();
		} 
		return instance;
	 }
	 
	 public void printJob() {
		 System.out.println("print....");
	 }
	 
}
