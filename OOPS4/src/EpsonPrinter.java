
public class EpsonPrinter implements Printer{

	@Override
	public void printJob() {
		System.out.println("print job using epsonprinter");		
	}

	@Override
	public void scanJob() {
		System.out.println("scan job using epsonprinter");	
		
	}
	public void tshirtPrintJob() {
		System.out.println("thsirt job using override");	
		
	}
	
}
