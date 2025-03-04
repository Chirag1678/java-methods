// Create SumOfNaturalNumbers class to find sum using recursion and formula
import java.util.Scanner;

class SumOfNaturalNumbers {
    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input for a number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is natural (greater than 0)
        if (n <= 0) {
            System.out.println("Please enter a positive natural number!");
            return;
        }

        // Compute sum using recursion
        int recursiveSum = sumUsingRecursion(n);

        // Compute sum using formula
        int formulaSum = sumUsingFormula(n);

        // Display results
        System.out.println("Sum using Recursion: " + recursiveSum);
        System.out.println("Sum using Formula (n*(n+1)/2): " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations match! The results are correct.");
        } else {
            System.out.println("Mismatch in computations! Check the logic.");
        }

        // Close the Scanner Object
        input.close();
    }
}
