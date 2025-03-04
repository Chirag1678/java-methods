// Create UnitConverterTempWeightVolume utility class to perform unit conversions
import java.util.Scanner;

class UnitConverterTempWeightVolume {
    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsTokilograms = 0.453592;
        return pounds * poundsTokilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsTopounds = 2.20462;
        return kilograms * kilogramsTopounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToliters = 3.78541;
        return gallons * gallonsToliters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersTogallons = 0.264172;
        return liters * litersTogallons;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for Fahrenheit to Celsius conversion
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);

        // Take input for Celsius to Fahrenheit conversion
        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextDouble();
        fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Take input for pounds to kilograms conversion
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println("Weight in kilograms: " + kilograms);

        // Take input for kilograms to pounds conversion
        System.out.print("Enter weight in kilograms: ");
        kilograms = sc.nextDouble();
        pounds = convertKilogramsToPounds(kilograms);
        System.out.println("Weight in pounds: " + pounds);

        // Take input for gallons to liters conversion
        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();
        double liters = convertGallonsToLiters(gallons);
        System.out.println("Volume in liters: " + liters);

        // Take input for liters to gallons conversion
        System.out.print("Enter volume in liters: ");
        liters = sc.nextDouble();
        gallons = convertLitersToGallons(liters);
        System.out.println("Volume in gallons: " + gallons);

        // Close the Scanner object
        sc.close();
    }
}
