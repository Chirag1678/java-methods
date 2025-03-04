// Import Scanner class
import java.util.Scanner;

// Create TrignometricFunctions Class to calculate sine, cos and tangent given the angle in degrees
class TrigonometricFunctions {
    // Method to calculate sine, cosine, and tangent
    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent using Math class
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Store results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for angle
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Create an object of TrigonometricFunctions class
        TrigonometricFunctions calculator = new TrigonometricFunctions();

        // Call the method to calculate trigonometric functions
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("Sine of %.2f° = %.4f%n", angle, results[0]);
        System.out.printf("Cosine of %.2f° = %.4f%n", angle, results[1]);
        System.out.printf("Tangent of %.2f° = %.4f%n", angle, results[2]);

        // Close Scanner
        input.close();
    }
}
