// Create BMICalculator Class to calculate BMi of persons based on weight and height
import java.util.Scanner;

public class BMICalculator {
    // Method to calculate BMI and store it in the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];  // Weight in kg
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // BMI Calculation
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9) return "Normal weight";
        else if (bmi >= 25 && bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows (persons), 3 columns (weight, height, BMI)

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Displaying results
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("For Person %d:\n The Weight is %.2fkgs and height is %.2fcms\nThe BMI is %.2f and Weight Status is %s.\n", i + 1, data[i][0], data[i][1], bmi, status);
        }

        sc.close();
    }
}

