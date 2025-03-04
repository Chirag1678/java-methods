// Create LeapYearCheck class to check if a year is a leap year or not
import java.util.Scanner;

class LeapYearCheck {
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Only valid for Gregorian calendar years (>=1582)
        }
        // Leap year condition: Divisible by 4 and (not divisible by 100 or divisible by 400)
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for the year
        System.out.print("Enter a year (>=1582): ");
        int year = input.nextInt();

        // Check if the input is valid
        if (year < 1582) {
            System.out.println("The Leap Year program only works for year >= 1582.");
        } else {
            // Call method to check for leap year
            boolean result = isLeapYear(year);

            // Display the result
            if (result) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

        // Close the Scanner Object
        input.close();
    }
}
