// Create EuclideanDistance Class to calculate Euclidean distance between two points as well as the equation of the line using those two points
import java.util.Scanner;

class EuclideanDistance {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of the line passing through two points
    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double[] equation = new double[2]; // equation[0] -> slope (m), equation[1] -> y-intercept (b)
        
        // Calculate slope (m)
        double m = (double) (y2 - y1) / (x2 - x1);
        
        // Calculate y-intercept (b)
        double b = y1 - m * x1;
        
        // Store values in array
        equation[0] = m;
        equation[1] = b;
        
        return equation;
    }

    // Main method
    public static void main(String[] args) {
	//Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        // Take user input for two points
        System.out.print("Enter x1 and y1: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();

        System.out.print("Enter x2 and y2: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();

        // Compute Euclidean distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        // Compute line equation
        double[] equation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);

        input.close();
    }
}

