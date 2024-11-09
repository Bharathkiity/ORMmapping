

    
    //  to calculate the sum of digits of a number
	import java.util.Scanner;

	public class noOfDigit {

	    public static int countOfDigits(int num) {
	        int count = 0;
	        while (num > 0) {
	           int rem = num % 10;
	            count++;
	            num = num/ 10;
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);  
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt(); // user input
	        int count = countOfDigits(number);
	        // Output the result
	        System.out.println("count of digits: " + count);
	        
	        
	    }
	

    }
