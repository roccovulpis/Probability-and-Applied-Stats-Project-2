/**
 * The JFreePlotterSalterSmootherTester class contains the main method for running the plotter, salter, and smoother.
 * It creates an instance of the JFreePlotterSalterSmoother class and creates the function 
 * by passing the slope, y-intercept, range of x values, and points to its run method.
 * 
 * @author Rocco Vulpis
 * @version 12/14/2023
 */
public class JFreePlotterSalterSmootherTester {

	public static void main(String[] args) {
		JFreePlotterSalterSmoother plot = new JFreePlotterSalterSmoother();
		plot.run(2, 3, -100, 100, 50);
	}
	
}
