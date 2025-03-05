// Create NumberCheckerExtended_2 Class to find the count of digits, reverse the array, compare two arrays, check if a number is palindrome and if a number is a duck number
import java.util.Arrays;
import java.util.Scanner;

class NumberCheckerExtended_2 {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindromeNumber(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        // A duck number contains at least one '0' (excluding leading zeroes)
        for (int i = 1; i < digits.length; i++) { // Ignore leading digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store digits in an array
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);

        // Compute values using methods
        int digitCount = countDigits(number);
        boolean isPalin = isPalindromeNumber(digits);
        boolean isDuck = isDuckNumber(digits);

        // Display the results
        System.out.println("Number of digits: " + digitCount);
        System.out.print("Digits in the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.print("Reversed digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Is Palindrome? " + (isPalin ? "Yes" : "No"));
        System.out.println("Is Duck Number? " + (isDuck ? "Yes" : "No"));

        // Close the Scanner Object
        scanner.close();
    }
}
