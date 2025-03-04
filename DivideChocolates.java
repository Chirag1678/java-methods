// Create DivideChocolates class to divide chocolates among children
import java.util.Scanner;

class DivideChocolates {
    // Method to find chocolates each child gets and remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;  // Chocolates each child gets
        int remainingChocolates = numberOfChocolates % numberOfChildren; // Remaining chocolates

        return new int[]{chocolatesPerChild, remainingChocolates}; // Return the result as an array
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input for number of chocolates and number of children
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = input.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();

        // Validate numberOfChildren to prevent division by zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Call method to calculate chocolates per child and remaining chocolates
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the result
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        // Close the Scanner Object
        input.close();
    }
}
