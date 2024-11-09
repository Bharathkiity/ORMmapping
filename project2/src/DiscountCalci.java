
public class DiscountCalci {

	public double findDiscount(int totalBillAmount) {
		double discount=0.0;
		if(totalBillAmount<100) {
			discount=totalBillAmount*.05;
		}else if(totalBillAmount<100) {
			discount=totalBillAmount*.1;
		}else if(totalBillAmount<100) {
			discount=totalBillAmount*.15;
		}else if(totalBillAmount<100) {
			discount=totalBillAmount*.2;
		}else if(totalBillAmount<100) {
			discount=totalBillAmount*.25;
		}else{
			discount=totalBillAmount*.3;	
			}
		return discount;
	}
	public void displayFinalBill(int totalBillAmount) {
		double discount=findDiscount(totalBillAmount);
			System.out.println(totalBillAmount-discount);
			System.out.println(discount);
			System.out.println(totalBillAmount);
	}
	public static void main(String args[]) {
	DiscountCalci c=new DiscountCalci();
	c.displayFinalBill(1500);
	
	}
}
