import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * The Plotter class plots a linear function by generating x and y values and writes the data to a CSV file.
 * It calculates the y values of a linear function based on a given slope and y intercept over a specified range and number of points.
 * 
 * @author Rocco Vulpis
 * @version 12/14/2023
 */

public class Plotter {
	
	 /**
     * This method is called in the main method to run the generation of the function.
     * It takes in parameters that get passed to the createSlopeFunction method.
     * 
     * @param m The slope of the linear function.
     * @param b The y intercept of the linear function.
     * @param xRangeBeginning The starting value of the x range.
     * @param xRangeEnd The ending value of the x range.
     * @param numberOfPoints The number of points to calculate in the specified range.
     */
	public void run(double m, double b, int xRangeBeginning, 
			int xRangeEnd, int numberOfPoints) {

		createSlopeFunction(m, b, xRangeBeginning, xRangeEnd, numberOfPoints);
	}

	 /**
     * Calculates the y values of the linear function for a set of x values within the specified range and interval.
     * The calculated values are then written to a file.
     * 
     * @param m The slope of the linear function.
     * @param b The y intercept of the linear function.
     * @param xRangeBeginning The starting value of the x range.
     * @param xRangeEnd The ending value of the x range.
     * @param numberOfPoints The number of points to calculate in the specified range.
     */
	public void createSlopeFunction(double m, double b, int xRangeBeginning, int xRangeEnd, int numberOfPoints) {
	    // Calculates the range of x values.
	    int xRange = xRangeEnd - xRangeBeginning;
	    // Determines the interval between each x value based on the number of points and the range.
	    double interval = (double)xRange / numberOfPoints;
	    // Initializes arrays to store the x and y values.
	    double[] xValues = new double[numberOfPoints];
	    double[] yValues = new double[numberOfPoints];
	    // Loops through each point to calculate the x and y values.
	    for(int i = 0; i < numberOfPoints; i++) {
	        // Calculates the x value for the current point.
	        double x = xRangeBeginning + i * interval;
	        // Calculates the y value using the formula y = mx + b.
	        double y = m * x + b;
	        // Stores the calculated x and y values in the arrays.
	        xValues[i] = x;
	        yValues[i] = y;
	    }

	    // Writes the calculated x and y values to a CSV file.
	    writeToFile(xValues, yValues);
	}


	/**
     * Writes an array of x values and an array of y values to a CSV file.
     */
	public void writeToFile(double[] xValues, double[] yValues) {

		try {
			// Writes to a file named "data.csv" in the default workspace directory.
			BufferedWriter writer = new BufferedWriter(new FileWriter("data.csv"));
			String header = "x Values, y Values";
			// Writes the header to the CSV file outside of the loop.
			writer.write(header);
			writer.newLine();
			// Loops through the length of the xValues array to write both x and y values to the CSV file.
			for (int i = 0; i < xValues.length; i++) {
				writer.write(xValues[i] + "," + yValues[i]);
				writer.newLine();
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
