
public class BillProcess {
	public void displayFinalBill(int totalBillAmount) {
		DiscountClaci c=new DiscountClaci();
		double discount=c.findDiscount(totalBillAmount);
				
	System.out.println(totalBillAmount);	
	System.out.println(discount);	
	System.out.println((totalBillAmount-discount));	
	}

}
