// Create UnitConverterYardsAndFeet utility class to perform unit conversions
import java.util.Scanner;

class UnitConverterYardsAndFeet {
    // Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for yards to feet conversion
        System.out.print("Enter the length in yards: ");
        double yards = sc.nextDouble();
        double feet = convertYardsToFeet(yards);
        System.out.println("Length in feet: " + feet);

        // Take input for feet to yards conversion
        System.out.print("Enter the length in feet: ");
        feet = sc.nextDouble();
        yards = convertFeetToYards(feet);
        System.out.println("Length in yards: " + yards);

        // Take input for meters to inches conversion
        System.out.print("Enter the length in meters: ");
        double meters = sc.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println("Length in inches: " + inches);

        // Take input for inches to meters conversion
        System.out.print("Enter the length in inches: ");
        inches = sc.nextDouble();
        meters = convertInchesToMeters(inches);
        System.out.println("Length in meters: " + meters);

        // Take input for inches to centimeters conversion
        System.out.print("Enter the length in inches: ");
        inches = sc.nextDouble();
        double cm = convertInchesToCentimeters(inches);
        System.out.println("Length in centimeters: " + cm);

        // Close the Scanner object
        sc.close();
    }
}
