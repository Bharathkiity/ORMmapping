
public class Customer {
	private int customerId;
	private String customerName;
	BankAccount[] customerBankAccounts;
	public Customer(int customerId, String customerName, BankAccount[] customerBankAccounts) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBankAccounts = customerBankAccounts;
	}
	
	public void customerDetails(){
		System.out.println("customer id:"+customerId);
		System.out.println("customer name :"+customerName);
		System.out.println("customer bank details ");
		
		
	for(BankAccount account:customerBankAccounts) {
		account.displayAccountDetails();
		System.out.println("-------------");
		
	}
	}
	
	

}
