// Create NumberOfHandshakes Class to calculate maximum handshakes among N students
import java.util.Scanner;

class NumberOfHandshakes {
    // Method to calculate the maximum number of handshakes using formula (n * (n - 1)) / 2
    public int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        // Create an Object of HandshakeCalculator Class
        NumberOfHandshakes calculator = new NumberOfHandshakes();

        // Calculate the maximum handshakes using method and store it in variable
        int handshakes = calculator.maxHandshakes(n);

        // Display the result
        System.out.printf("The possible number of handshakes among %d students is %d.%n", n, handshakes);

        // Close the Scanner Object
        input.close();
    }
}

