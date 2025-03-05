// Create ShortestTallestAndMean Class to calculate shortest and tallest among players and also the mean height of players
class ShortestTallestAndMean {
	// Create a method to calculate sum of heights of players
	public double sumOfHeights(double[] heights) {
		double totalHeights = 0.0;
		for(double height: heights){
			totalHeights+= height;
		}
		return totalHeights;
	}

	// Create a method to find mean height of players
	public double meanHeight(double totalHeights) {
		return (totalHeights / 11); // Mean = total / number of players
	}

	// Create a method to find the shortest height among players
	public double shortestHeight(double[] heights) {
		double shortest = heights[0];
		for(double height: heights){
			if(shortest>height){
				shortest = height;
			}
		}
		return shortest;
	}

	// Create a method to find the tallest height among players
	public double tallestHeight(double[] heights) {
		double tallest = heights[0];
		for(double height: heights){
			if(height>tallest){
				tallest = height;
			}
		}
		return tallest;	
	}

	// main method 
	public static void main(String[] args) {
		// Create an array of heights and store value in it
		double[] heights = new double[11];

		for(int i=0;i<11;i++){
			// Generate 3 digit random integer number for each height
			heights[i] = (int) (Math.random() * (250 - 150 + 1)) + 150;
		}
	
		// Create an Object of ShortestTallestAndMean Class
		ShortestTallestAndMean obj = new ShortestTallestAndMean();

		// Use method to compute each value
		double totalHeights = obj.sumOfHeights(heights);
		double mean = obj.meanHeight(totalHeights);
		double shortest = obj.shortestHeight(heights);
		double tallest = obj.tallestHeight(heights);

		// Display the results
		System.out.print("The height of players are: ");
		for(double height: heights){
			System.out.printf("%.2f ", height);
		}
		System.out.println();
		System.out.printf("The total of heights of 11 players is: %.2f and the mean Height is: %.2f\n", totalHeights, mean);
		System.out.printf("The shortest height among them is: %.2f and tallest height is: %.2f", shortest, tallest);
	}
} 
