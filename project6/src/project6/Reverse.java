package project6;

import java.util.Scanner;

public class Reverse {
	
	public static int findReverse(int num) {
	//int num=123;
		int rev=0;
		//int num=0;
		while(num!=0) {
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		
	}
	return rev;
	}

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER A NUMBER:");
		 int num=sc.nextInt();
		 
		 int reverse=Reverse.findReverse(num);
		 System.out.println(reverse);
	}

}
