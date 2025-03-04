// Create SpringSeason class to check whether the given date falls in Spring Season
import java.util.Scanner;

class SpringSeason {
    // Method to check if the given month and day fall in Spring Season
    public boolean isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) ||  // March 20 to 31
            (month == 4 && day >= 1 && day <= 30) ||  // Entire April
            (month == 5 && day >= 1 && day <= 31) ||  // Entire May
            (month == 6 && day >= 1 && day <= 20)) {  // June 1 to 20
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

        // Create an Object of SpringSeason class
        SpringSeason seasonChecker = new SpringSeason();

        // Check if the given date is in Spring Season
        boolean isSpring = seasonChecker.isSpringSeason(month, day);

        // Print the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }

        // Close the Scanner Object
        input.close();
    }
}
