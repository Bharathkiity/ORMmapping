
public class CanonPrinter implements Printer{

	@Override
	public void printJob() {
		System.out.println("print job using canonprinter");
		
	}

	@Override
	public void scanJob() {
		System.out.println("scan job using hpprinter");
		
	}
	public void coffeCupPrintJob() {
		System.out.println("scan job using hpprinter overriden");
		
	}
	//@Override
	static void threePrintJob() {
		System.out.println("4d job");
		
	}

}
