import java.util.Scanner;

class StudentReport {

    // Method to calculate the total marks
    public static int calculateTotal(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total = total+mark;
        }
        return total;
    }

    // Method to calculate the average marks
    public static double calculateAverage(int[] marks) {
        int total = calculateTotal(marks);
         return total / (double) marks.length;
    }

    // Method to find the lowest mark
    public static int findLowest(int[] marks) {
        int lowest = marks[0];
        for (int mark : marks) {
            if (mark < lowest) {
                lowest = mark;
            }
        }
        return lowest;
    }
    public static int findHighest(int[] marks) {
        int highest = marks[0];
        for (int mark : marks) {
            if (mark > highest) {
            	highest = mark;
            }
        }
        return highest;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store subjects and marks
        String[] subjects = {"Subject1", "Subject2", "Subject3", "Subject4", "Subject5", "Subject6"};
        int[] marks = new int[6];
        
        // Input marks for each subject
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        System.out.println("Student Progress Report:");
        System.out.println("--------------------------");
        
        // Display subject-wise marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
        
        // Calculate and display total, average, and lowest
        int total = calculateTotal(marks);
        double average = calculateAverage(marks);
        int lowest = findLowest(marks);
        int highest=findHighest(marks);

        System.out.println("--------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Lowest Marks: " + lowest);
        System.out.println("Highest Marks: " + highest);
    }
}
