// Create WindChillTemperature class to calculate wind chill temperature
import java.util.Scanner;

class WindChillTemperature {
    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take user input for temperature and wind speed
        System.out.print("Enter the temperature (in °F): ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = input.nextDouble();

        // Check for valid wind speed (should be > 3 mph for formula to be accurate)
        if (windSpeed <= 3) {
            System.out.println("Wind speed should be greater than 3 mph for accurate wind chill calculation.");
        } else {
            // Create an object of WindChillTemperature class
            WindChillTemperature calculator = new WindChillTemperature();

            // Call method to calculate wind chill temperature
            double windChill = calculator.calculateWindChill(temperature, windSpeed);

            // Display the result
            System.out.printf("The Wind Chill Temperature is: %.2f°F%n", windChill);
        }

        // Close the Scanner Object
        input.close();
    }
}
