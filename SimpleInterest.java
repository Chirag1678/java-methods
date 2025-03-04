// Create SimpleInterest Class to calculate simple interest from principal amount, interest rate and time period
import java.util.Scanner;

class SimpleInterest {
	// Method to calculate the simle interest
	public double simpleInterest (double principal, double rate, double time){
 		// Calculate simple interest using formula S.I = ( princiapl * rate * time ) / 100
		double interest = ( principal * rate * time ) / 100;
		return interest;
	}
	
	public static void main(String[] args) {
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Take input for principal, rate and time
		System.out.print("Enter the Principal amount (in Rs.): ");
		double principal = input.nextDouble();

		System.out.print("Enter the interest rate (in %): ");
		double rate = input.nextDouble();

		System.out.print("Enter the Time Period (in Years): ");
		double time = input.nextDouble();

		// Create an Object of SimpleInterest Class
		SimpleInterest calculateInterest = new SimpleInterest();

		// Calculate simple interest using method and store it in variable
		double interest = calculateInterest.simpleInterest(principal, rate, time);

		// Display the result
		System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f years", interest, principal, rate, time);

		// Close the Scanner Object
		input.close();
	}
}
