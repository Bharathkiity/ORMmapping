import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
	System.out.println("enter a number:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp;
	temp=num;
	int sum=0,rem;
	while(num!=0) {
		rem=num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
	}
	if(sum==temp) { 
		
		System.out.println("Armstrong number");
	}
	else {
		System.out.println("not a Armstrong number");
	}
}
}
