// Create CheckCollinearPoints Class to check if the 3 points given by user are collinear or not
import java.util.Scanner;

class CheckCollinearPoints {

    // Method to check collinearity using the slope formula
    public static boolean areCollinearPoints(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        // Check if all slopes are equal
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Main method
    public static void main(String[] args) {
	// Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for three points
        System.out.print("Enter x1 and y1: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        System.out.print("Enter x3 and y3: ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // Check if points are collinear
        if (areCollinearPoints(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear.");
        } else {
            System.out.println("The points are not collinear.");
        }

	// Close the Scanner Object
        input.close();
    }
}

