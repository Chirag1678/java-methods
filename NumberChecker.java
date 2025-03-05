// Create NumberChecker Class to calculate number of digits, store digits into an array, check if it is a duck andarmstrong number, find the largest and second largest, find the smallest and second smallest digits
import java.util.Scanner;

class NumberChecker {
    
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

    // Method to check if a number is a duck number (contains a '0' but doesn't start with it)
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int count = countDigits(number);
        int[] digits = storeDigits(number);
        int sum = 0;
        
        for (int digit : digits) {
            sum += Math.pow(digit, count);
        }
        
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        
        return new int[]{smallest, secondSmallest};
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
        boolean isDuck = isDuckNumber(digits);
        boolean isArmstrong = isArmstrongNumber(number);
        int[] largestValues = findLargestAndSecondLargest(digits);
        int[] smallestValues = findSmallestAndSecondSmallest(digits);

        // Display the results
        System.out.println("Number of digits: " + digitCount);
        System.out.println("Digits in the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println("\nIs Duck Number? " + (isDuck ? "Yes" : "No"));
        System.out.println("Is Armstrong Number? " + (isArmstrong ? "Yes" : "No"));
        System.out.println("Largest digit: " + largestValues[0]);
        System.out.println("Second largest digit: " + (largestValues[1] == Integer.MIN_VALUE ? "N/A" : largestValues[1]));
        System.out.println("Smallest digit: " + smallestValues[0]);
        System.out.println("Second smallest digit: " + (smallestValues[1] == Integer.MAX_VALUE ? "N/A" : smallestValues[1]));

        // Close the Scanner Object
        scanner.close();
    }
}
