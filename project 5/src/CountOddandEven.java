import java.util.Scanner;

public class CountOddandEven {//count even and odd digits

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int num=sc.nextInt();
		
		int counteven=0,countodd=0;
		while(num>0) {
			 int rem=num%10;
			 if(rem%2==0) {
				 counteven++; 
			 }
			 else {
				 countodd++;
			 }
			num=num/10;
		}
		System.out.println(counteven);	
		System.out.println(countodd);

	}

}
