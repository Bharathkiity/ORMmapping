
public class AtmService {
	public static int balance=5000;
	public int balance(){
		
		return balance;	
	}
	public void depoist(int amount){
		
		balance=balance+amount;
	}
	public void withdraw(int amount){
		  balance = balance-amount;	
	}

}
