//5!=1 2 3 4 5 =120
//5!=5 4 3 2 1 =120
public class FactorialNumber {
	public static void main(String[] args) {
		long number=100;
		long factorial=1;
		for(int i=1;i<=number;i++) {
			factorial=factorial*i;	
		} 
		System.out.println(factorial);
	}
}
