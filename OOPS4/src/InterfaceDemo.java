
public class InterfaceDemo {

	public static void main(String[] args) {
		//Printer p1=new Printer();//no object creation
		EpsonPrinter ep=new EpsonPrinter();
		ep.printJob();
		ep.scanJob();
		ep.tshirtPrintJob();
		ep.coffeCupPrintJob();
		System.out.println("=======================");
		
		CanonPrinter cp=new CanonPrinter();
		cp.printJob();
		cp.scanJob();
		cp.tshirtPrintJob();
		cp.coffeCupPrintJob();
		System.out.println("====================");
		
		HpPrinter hp=new HpPrinter();
		hp.printJob();
		hp.scanJob();
		hp.tshirtPrintJob();
		hp.coffeCupPrintJob();
		System.out.println("================");
		
		//static methods use by interface name only
		Printer.threePrintJob();
		
		
		
		
//		Printer p1=new  EpsonPrinter();
//		p1.printJob();
		
	}

}
