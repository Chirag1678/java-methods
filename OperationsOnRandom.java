// Create OperationsOnRandom Class to get a random number and perform operations to find their average, minimum and maximum
import java.util.Random;

public class OperationsOnRandom {
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomNumber(int size) {
        int[] numbers = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(9000) + 1000; // Generate 4-digit number (1000 - 9999)
        }
        
        return numbers;
    }

    // Method to find average, min, and max values
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomNumber(5); // Generate 5 random numbers

        System.out.print("Generated 4-digit numbers: ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] stats = findAverageMinMax(randomNumbers);
        
        // Display results
        System.out.printf("Average: %.2f\n", stats[0]);
        System.out.println("Minimum: " + (int) stats[1]);
        System.out.println("Maximum: " + (int) stats[2]);
    }
}
