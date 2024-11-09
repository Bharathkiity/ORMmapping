public class myApp {

    public static int reverseNumber(int num) {
        int reverse = 0;
        if (num > 0) {
            while (num != 0) {
                int r = num % 10;
                reverse = reverse * 10 + r;
                num = num / 10;
            }
        } else {
            System.out.println("Cannot reverse it.");
        }
        return reverse;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        if (num > 0) {
            while (num != 0) {
                int r = num % 10;
                sum = sum + r;
                num = num / 10;
            }
        } else {
            System.out.println("Cannot calculate sum.");
        }
        return sum;
    }

    public static int noOfDigits(int num) {
        int count = 0;
        if (num > 0) {
            while (num != 0) {
                num = num / 10;
                count++;
            }
        } else {
            System.out.println("Cannot count digits.");
        }
        return count;
    }
}
