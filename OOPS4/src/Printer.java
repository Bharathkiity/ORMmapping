
public interface Printer {
	//public static final String version_no="v1.0.0";
	String version_no="v1.0.0";
	
	//decalarton allowed ,not implem,no body//by default public abstarct implicity
    //exp option //abstarct methods have no body
	//coantin propties 
	public void  printJob();//abstract method
	public void  scanJob();
	//java  8 feature 1
	default void tshirtPrintJob(){//use default to access all objects in implemented class 
		System.out.println("t shirt priting job");
		
	}
	default void coffeCupPrintJob(){
		System.out.println("coffe cup priting job");
		
	}
	//java  feature 2
	//static method not through impl class only access with interface name only
	//@Override not override//only abstrct method mandatray 
	static void threePrintJob() {
		System.out.println("3d job");
		
	}
	
}


