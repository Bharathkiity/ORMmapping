import java.util.Scanner;


public class AtmApp {

	public static void main(String[] args) throws InterruptedException{
		
		AtmService service=new  AtmService();
		Scanner in = new Scanner(System.in);
		int option = 0;
		do {
		System.out.println(" ATM APP");
		System.out.println("------------");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Balance");
		System.out.println("0. Exit");
		System.out.println("Please choose option: ");
		option= in.nextInt();

		switch (option) {

		case 1:
		System.out.println("please enter amount");
		int depoistAmount=in.nextInt();
		service.balance=service.balance+depoistAmount;
		System.out.println("Deposit sucessful");
		break;
		
		case 2:
		System.out.println("enter withdraw amount : ");
		int withdrawAmount=in.nextInt();
		if(withdrawAmount>service.balance()) {	
		System.out.println("insufficent balance");
		}
		else if(withdrawAmount<100){
		System.out.println("minimum withdraw amount is RS 100");
		}
		else {
			System.out.println("withdraw processsing......");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		service.withdraw(withdrawAmount);
		System.out.println("withdraw is sucessfull");
		}
		case 3:
		int balance=service.balance();
		System.out.println("Balance: "+ balance);
		break;
		
		case 0:
		System.out.println("bye!!!");
		System.exit(0);//jvm shutdown
		default:
		System.out.println("Invalid Option");
		break;
		
	}
		}while(option!=0);
			
		}
	}
			

