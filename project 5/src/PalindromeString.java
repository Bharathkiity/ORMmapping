import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string: ");
		String str=sc.nextLine();
		String originalstring=str;
		String rev="";
		
		//int length=str.length();
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);			
		}
		if(originalstring.equals(rev)) {
			System.out.println(originalstring +" palidrome string");
		}else {
			System.out.println(originalstring+" not palidrome string");
		}
	}

}
