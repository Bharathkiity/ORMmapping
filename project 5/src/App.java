import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MATH OPERATIONS");
        System.out.println("--------------------");
        int option = 0;

        do {
            System.out.println("MATH OPERATIONS");
            System.out.println("--------------------");
            System.out.println("1. Reverse Number");
            System.out.println("2. Sum of Digits");
            System.out.println("3. Number of Digits");
            System.out.println("0. Exit");
            System.out.println("Please choose an option: ");
            option = sc.nextInt();

            switch (option) {
                // Math Operations
                case 1:
                    System.out.println("Enter a number to reverse: ");
                    int num1 = sc.nextInt();
                    int reverse = myApp.reverseNumber(num1);
                    System.out.println("Reversed number: " + reverse);
                    break;

                case 2:
                    System.out.println("Enter a number to calculate sum of digits: ");
                    int num2 = sc.nextInt();
                    int sum = myApp.sumOfDigits(num2);
                    System.out.println("Sum of digits: " + sum);
                    break;

                case 3:
                    System.out.println("Enter a number to count the digits: ");
                    int num3 = sc.nextInt();
                    int count = myApp.noOfDigits(num3);
                    System.out.println("Number of digits: " + count);
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0); // JVM shutdown
                    break;

                default:
                    System.out.println("Invalid Option. Please try again.");
                    break;
            }
        } while (option != 0);

       
    }
}
