
public class CustomerTest {
		public static void main(String[] args) {
			BankAccount account1=new BankAccount(12345605l,"bharath","hdfc","ammerpet");
			BankAccount account2=new BankAccount(12345606l,"bharath","sbi","ammerpet");
			
			BankAccount[] customerBankAccounts= {account1,account2};
			Customer customer=new Customer(111,"bhargav",customerBankAccounts);
			customer.customerDetails();
		}
		

}
