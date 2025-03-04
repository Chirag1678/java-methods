// Create UnitConverter utility class to perform unit conversions
import java.util.Scanner;

class UnitConverter {
    // Convert kilometers to miles
    public double convertKmToMiles(double km) {
        double kmTomiles = 0.621371;
        return km * kmTomiles;
    }

    // Convert miles to kilometers
    public double convertMilesToKm(double miles) {
        double milesTokm = 1.60934;
        return miles * milesTokm;
    }

    // Convert meters to feet
    public double convertMetersToFeet(double meters) {
        double metersTofeet = 3.28084;
        return meters * metersTofeet;
    }

    // Convert feet to meters
    public double convertFeetToMeters(double feet) {
        double feetTometers = 0.3048;
        return feet * feetTometers;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Create a UnitConverter object
        UnitConverter unitConverter = new UnitConverter();

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = unitConverter.convertKmToMiles(km);
        System.out.println("Distance in miles: " + miles);

        // Take input for miles
        System.out.print("Enter the distance in miles: ");
        miles = sc.nextDouble();
        km = unitConverter.convertMilesToKm(miles);
        System.out.println("Distance in kilometers: " + km);

        // Take input for meters
        System.out.print("Enter the length in meters: ");
        double meters = sc.nextDouble();
        double feet = unitConverter.convertMetersToFeet(meters);
        System.out.println("Length in feet: " + feet);

        // Take input for feet
        System.out.print("Enter the length in feet: ");
        feet = sc.nextDouble();
        meters = unitConverter.convertFeetToMeters(feet);
        System.out.println("Length in meters: " + meters);

        // Close the Scanner object
        sc.close();
    }
}
