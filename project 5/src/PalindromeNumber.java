import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number:");
			int num=sc.nextInt();
			
			int originalnumber=num;
			int rev=0;
			while(num!=0) {
//				int rem=num%10;
//				rev=rev*10+rem;
//				num=num/10;
				rev=rev*10+num%10;
				num=num/10;
				
			}
			if(originalnumber==rev) {
				System.out.println(originalnumber+ " palidrome");
			}
			else {
				System.out.println(originalnumber+" not palidrome");
			}
			
			 
	}

}
