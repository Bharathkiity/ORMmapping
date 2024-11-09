package project2;

public class ControlFlowStatements {
	public static boolean isEven(int num) {
		boolean status=false;
		if(num%2==0){
			status=true;
		}
		return status;
		}	
	public static void findEvenOrOdd(int num) {
		if(isEven(num)) {
			System.out.println(num + "  is even number");
		}else {
			System.out.println(num+  "  is  odd number");
		}		
	}
	public static void main(String[] args) {
		ControlFlowStatements.isEven(10); 
		findEvenOrOdd(10);
		findEvenOrOdd(11);
		
	}
}
