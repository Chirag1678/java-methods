// Create NumberOfRounds class to calculate number of rounds needed to complete a 5km run
import java.util.Scanner;

class NumberOfRounds {
    // Method to calculate the number of rounds required to complete a 5km run
    public int calculateRounds(double side1, double side2, double side3) {
        // Calculate the perimeter of the triangular track
        double perimeter = side1 + side2 + side3;
        
        // Calculate the number of rounds required
        return (int) Math.ceil(5000 / perimeter); // Using Math.ceil to round up
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the three sides of the triangular park
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();

        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();

        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();

        // Create an Object of RunningTrack class
        NumberOfRounds track = new NumberOfRounds();

        // Calculate the number of rounds using the method and store it in a variable
        int rounds = track.calculateRounds(side1, side2, side3);

        // Display the result
        System.out.printf("The athlete must complete %d rounds to run 5 km.", rounds);

        // Close the Scanner Object
        input.close();
    }
}
