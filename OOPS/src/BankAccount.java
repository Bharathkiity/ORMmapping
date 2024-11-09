
public class BankAccount {
	long accountNo;
	String name;//properties initiliase by construtors
	String ifsc;
	String branch;
	public BankAccount(long accountNo, String name, String ifsc, String branch) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.ifsc = ifsc;
		this.branch = branch;
	}
	public void displayAccountDetails() {
		
	System.out.println(" accountno:"+accountNo);
	System.out.println("accountname:"+name);
	System.out.println("ifsc:"+ifsc);
	System.out.println("brancha:"+branch);
	}
	
}
