
//unchecked exception
class InvalidAgeException extends RuntimeException{
	public InvalidAgeException() {
		super();
		
	}
	public InvalidAgeException(String message) {
		super(message);
	}
}

//checked exception
class InvalidIncomeException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public InvalidIncomeException(){
		super();
	}
	public InvalidIncomeException(String message){
		super(message);
	}
}
public class CustomizeddExceptionDemo {
	public static void checkVoterAge(int age) {
		if(age>=18) {
			System.out.println("eligible to vote");
		}else {
			throw new InvalidAgeException("not eligible to vote");
		}
	}
	public static void checkIncome(int income) throws InvalidIncomeException{
		if(income<=80000) {
			System.out.println("eligible for admission");
		}else {
			throw new InvalidIncomeException("not eligible for admission");
		}
	}
	public static void main(String[] args) {
		try {
			checkVoterAge(17);
		}
		catch(InvalidAgeException e){
			System.out.println(e);
		}
		try {
			checkIncome(90000);
		}
		catch(InvalidIncomeException e){
			System.out.println(e);
		}
	}

}
