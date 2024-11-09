import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        //int num = 12345;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int  num=sc.nextInt();
        
        int reverse = MyMath.reverseNumber(num);        
        System.out.println(reverse);
        
        int sum = MyMath.sumOfDigits(num);
        System.out.println(sum);
        
        int count = MyMath.noOfDigits(num);
        System.out.println(count);        
    }
}
