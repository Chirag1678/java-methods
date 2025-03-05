// Create GenerateOTP Class to generate 6-digit otp 10 times and check if al of them are different
class GenerateOTP {
	// Create a method to generate a 6 digit otp using Math.random()
	public static int generate6DigitOtp() {
		return (int) (Math.random() * 900000) + 100000;
	}

	// Create a method to check if all the otp's in an array is different or not
	public static boolean isUniqueOtps(int[] otps){
		for(int i=0;i<otps.length;i++){
			for(int j=i+1;j<otps.length;j++){
				if(otps[i]==otps[j]){
					return false; // if two otps match ,return false
				}
			}
		}
		return true;
	}

	// Main method
	public static void main(String[] args) {
		// Create an array to store 10 otps
		int[] otps = new int[10];

		// Call method to generate otp 10 times
		for(int i=0;i<10;i++){
			otps[i] = generate6DigitOtp();
		}

		//Display the genrated otp
		System.out.print("All the generated otp are: ");
		for(int otp: otps){
			System.out.print(otp+" ");
		}
		System.out.println();

		// Check if all the otp are unique
		if(isUniqueOtps(otps)){
			System.out.print("All the 10 otp generated are unique");
		} else{
			System.out.print("All the 10 otp generated are not unique");
		}
	}
}
