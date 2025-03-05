// Create NumberCheckerExtended_3 Class to check if a number is prime, is neon, is spy, is automorphic, and is a Buzz number
import java.util.Scanner;

class NumberCheckerExtended_3 {

    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Main method
    public static void main(String[] args) {
        // Create a Scanner Object
	Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Perform checks
        boolean prime = isPrime(number);
        boolean neon = isNeon(number);
        boolean spy = isSpy(number);
        boolean automorphic = isAutomorphic(number);
        boolean buzz = isBuzz(number);

        // Display results
        System.out.println("Is Prime? " + (prime ? "Yes" : "No"));
        System.out.println("Is Neon Number? " + (neon ? "Yes" : "No"));
        System.out.println("Is Spy Number? " + (spy ? "Yes" : "No"));
        System.out.println("Is Automorphic Number? " + (automorphic ? "Yes" : "No"));
        System.out.println("Is Buzz Number? " + (buzz ? "Yes" : "No"));

	// Close the Scanner Object
        input.close();
    }
}
