// Create QuotientAndRemainder class to find the remainder and quotient of a number
import java.util.Scanner;

class QuotientAndRemainder {
    // Method to find the quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Calculate quotient using division operator
        int remainder = number % divisor;  // Calculate remainder using modulus operator
        
        return new int[]{quotient, remainder}; // Return the quotient and remainder as an array
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input for number and divisor
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        // Validate divisor to prevent division by zero
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Call method to find quotient and remainder
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the result
            System.out.println("Quotient: " + result[0]);
            System.out.println("Remainder: " + result[1]);
        }

        // Close the Scanner Object
        input.close();
    }
}
