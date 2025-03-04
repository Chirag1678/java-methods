// Create Quadratic Class to find roots of a quadratic equation
import java.util.Scanner;

public class Quadratic {
    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c); // Calculate discriminant

        if (delta > 0) { // Two distinct real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) { // One real root
            double root = -b / (2 * a);
            return new double[]{root};
        } else { // No real roots
            return new double[]{}; // Return an empty array
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking inputs for a, b, c
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        // Finding roots
        double[] roots = findRoots(a, b, c);

        // Displaying the result
        if (roots.length == 2) {
            System.out.printf("The roots of the equation are: %.2f and %.2f\n", roots[0], roots[1]);
        } else if (roots.length == 1) {
            System.out.printf("The equation has one root: %.2f\n", roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }

        sc.close();
    }
}
