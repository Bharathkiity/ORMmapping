//
//public class SumOfDigit {
//	public static void main(String[] args) {
//		int n =347; int sum = 0; 
//		while (n > 0)
//		{
//		int temp =n % 10;
//		sum=sum+temp; 
//		n=n/10;
//		}
//		System.out.println(sum);
//	}
//
//}
//

    
    //  to calculate the sum of digits of a number
	import java.util.Scanner;

	public class SumOfDigit {

	    public static int sumOfDigits(int num) {
	        int sum = 0;
	        
	        while (num > 0) {
	            int rem = num % 10;
	            sum = sum + rem;
	            num = num / 10;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        // To read input from the user
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt(); // user input

	        // Call method
	        int result = SumOfDigit.sumOfDigits(number);

	        // Output the result
	        System.out.println("Sum of digits: " + result);
	        
	        
	    }
	

    }
