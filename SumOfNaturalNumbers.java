// Create SumOfNaturalNumbers class to calculate the sum of first n natural numbers
import java.util.Scanner;

class SumOfNaturalNumbers {
    // Method to calculate the sum of n natural numbers using a loop
    public int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a positive number (n): ");
        int n = input.nextInt();

	// Validate input
        if (n < 1) {
            System.out.println("Please enter a positive number.");
        } else {
            // Create an Object of SumOfNaturalNumbers class
            SumOfNaturalNumbers calculator = new SumOfNaturalNumbers();

            // Calculate sum using method
            int sum = calculator.sumOfNaturalNumbers(n);

            // Display the result
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }

        // Close the Scanner Object
        input.close();
    }
}
