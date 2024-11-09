
public class DiscountClaci{
	public double findDiscount(int totalBillAmount){
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
}


