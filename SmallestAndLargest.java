// Create SmallestAndLargest class to find the smallest and largest of three numbers
import java.util.Scanner;

class SmallestAndLargest {
    // Method to find the smallest and largest number among three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3)); // Find the smallest
        int largest = Math.max(number1, Math.max(number2, number3));  // Find the largest
        
        return new int[]{smallest, largest}; // Return the smallest and largest as an array
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for three numbers
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

        // Call method to find smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);

        // Display the result
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);

        // Close the Scanner Object
        input.close();
    }
}
