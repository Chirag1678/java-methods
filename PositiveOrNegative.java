// Create PositiveOrNegative Class to check if a number is positive or negative, if positive check if it's odd or even
import java.util.Scanner;

public class PositiveOrNegative {
    // Method to check if a number is positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 < num2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking each number
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even.");
                } else {
                    System.out.println("Odd.");
                }
            } else {
                System.out.println(num + " is Negative.");
            }
        }

        // Compare first and last elements
        int result = compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("\nThe first number is greater than the last number.");
        } else if (result == -1) {
            System.out.println("\nThe first number is less than the last number.");
        } else {
            System.out.println("\nThe first number is equal to the last number.");
        }

        sc.close();
    }
}
