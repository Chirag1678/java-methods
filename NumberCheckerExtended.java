// Create NumberCheckerExtended Class to calculate number of digits, sum of digits, sum of square of digits, if it is a Harshad number and find frequency fo each digit
import java.util.Scanner;

class NumberCheckerExtended {

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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 rows (for digits 0-9), 2 columns (digit, frequency)

        // Initialize first column with digit values (0-9)
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        // Count occurrences of each digit
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store digits in an array
        int[] digits = storeDigits(number);

        // Compute values using methods
        int digitCount = countDigits(number);
        int sumDigits = sumOfDigits(digits);
        int sumSquares = sumOfSquaresOfDigits(digits);
        boolean isHarshad = isHarshadNumber(number, sumDigits);
        int[][] frequency = findDigitFrequency(digits);

        // Display the results
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Digits in the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println("\nSum of digits: " + sumDigits);
        System.out.println("Sum of squares of digits: " + sumSquares);
        System.out.println("Is Harshad Number? " + (isHarshad ? "Yes" : "No"));

        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }

        // Close the Scanner Object
        scanner.close();
    }
}
