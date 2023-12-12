/**
 * The SmootherTester class contains the main method for smoothing the plot.
 * It creates an instance of the Smoother class and smoothes the plot points by calling its run method.
 * 
 * @author Rocco Vulpis
 * @version 12/14/2023
 */

public class SmootherTester {

	public static void main(String[] args) {
		
		Smoother smoother = new Smoother();
		smoother.run(10);
		
	}
}
