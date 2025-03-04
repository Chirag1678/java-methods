// Create PositiveNegativeOrZero class to determine if a number is positive, negative, or zero
import java.util.Scanner;

class PositiveNegativeOrZero {
    // Method to check the number and return -1 for negative, 1 for positive, and 0 for zero
    public int checkNumber(int num) {
        if (num > 0) {
            return 1;  // Positive number
        } else if (num < 0) {
            return -1; // Negative number
        } else {
            return 0;  // Zero
        }
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Create an Object of NumberChecker class
        PositiveNegativeOrZero checker = new PositiveNegativeOrZero();

        // Call the method to check the number
        int result = checker.checkNumber(number);

        // Display the result based on the returned value
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the Scanner Object
        input.close();
    }
}
