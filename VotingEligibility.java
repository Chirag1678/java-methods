// Create a VotingEligibility Class to check if a student can vote based on their age
import java.util.Scanner;

public class VotingEligibility {
    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age, cannot vote
        } else if (age >= 18) {
            return true; // Eligible to vote
        } else {
            return false; // Not eligible to vote
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Define an array for 10 students' ages
        int[] studentAges = new int[10];

        // Take input for 10 students
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = sc.nextInt();

            // Check if the student can vote
            boolean canVote = canStudentVote(studentAges[i]);

            // Display the result
            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }

        // Close the Scanner object
        sc.close();
    }
}
