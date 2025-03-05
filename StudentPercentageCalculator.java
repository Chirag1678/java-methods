// Create StudentPercentageCalculator Class to tke input of marks and calculate total, average and the percentage of students
import java.util.Scanner;

public class StudentPercentageCalculator {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = (int) (Math.random()*51) + 50; // Physics (50-100)
            scores[i][1] = (int) (Math.random()*51) + 50; // Chemistry (50-100)
            scores[i][2] = (int) (Math.random()*51) + 50; // Math (50-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%\n", 
                (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                (int) results[i][0], results[i][1], results[i][2]);
        }

        System.out.println("--------------------------------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
	// Create a Scanner Object
        Scanner input = new Scanner(System.in);

	// Take input of number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

	// Close the Scanner Object
        input.close();

        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScoreCard(scores, results);
    }
}

