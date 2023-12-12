/**
 * The PlotterTester class contains the main method for creating the plot.
 * It creates an instance of the Plotter class and creates the plot points by calling its run method.
 * 
 * @author Rocco Vulpis
 * @version 12/14/2023
 */

public class PlotterTester {
	
	public static void main(String[] args) {
		Plotter plotter = new Plotter();
		plotter.run(2, 3, -100, 100, 50);
		
	}
}
