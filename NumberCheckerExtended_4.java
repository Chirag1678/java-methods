// Create NumberCheckerExtended_4 Class to calculate factors of a number, greatest factor, sum of factors, product of factors, if it is a perfect number, is a abundant number etc.
import java.util.Scanner;

class NumberCheckerExtended_4 {

    // Method to find factors of a number and return them as an array
    public static int[] getFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number
    public static int greatestFactor(int number) {
        int[] factors = getFactors(number);
        return factors[factors.length - 2]; // Second last factor before the number itself
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int number) {
        int sum = 0;
        for (int factor : getFactors(number)) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long productOfFactors(int number) {
        long product = 1;
        for (int factor : getFactors(number)) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of the cube of the factors
    public static double productOfCubeOfFactors(int number) {
        double product = 1;
        for (int factor : getFactors(number)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundant(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficient(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrong(int number) {
        int sum = 0, temp = number;
        
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method
    public static void main(String[] args) {
	// Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Perform checks
        int[] factors = getFactors(number);
        int greatestFactor = greatestFactor(number);
        int sumFactors = sumOfFactors(number);
        long productFactors = productOfFactors(number);
        double productCubeFactors = productOfCubeOfFactors(number);
        boolean perfect = isPerfect(number);
        boolean abundant = isAbundant(number);
        boolean deficient = isDeficient(number);
        boolean strong = isStrong(number);

        // Display results
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Greatest Factor: " + greatestFactor);
        System.out.println("Sum of Factors: " + sumFactors);
        System.out.println("Product of Factors: " + productFactors);
        System.out.println("Product of Cube of Factors: " + productCubeFactors);
        System.out.println("Is Perfect Number? " + (perfect ? "Yes" : "No"));
        System.out.println("Is Abundant Number? " + (abundant ? "Yes" : "No"));
        System.out.println("Is Deficient Number? " + (deficient ? "Yes" : "No"));
        System.out.println("Is Strong Number? " + (strong ? "Yes" : "No"));

	// Close the Scanner Object
        input.close();
    }
}
