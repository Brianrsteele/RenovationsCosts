/**
 *  From Chapter 2 of Java Programming: From Problem Analysis to Program Design
 *  by D.S. Malik
 *  
 *  Problem 18
 *  
 *  5/20/21
 *  
 *  Compute the cost of painting and carpeting a room with a door, two windows, and a bookshelf
 **/ 


package renovationCostsProgram;

import java.util.Scanner;

/**
 * @author briansteele
 *
 */
public class Carpet {
	
	//declare variables
	private double costPerSquareFoot = 0;
	private double squareFeet = 0;
	private double totalCost = 0;
	Scanner console = new Scanner(System.in);
	
	/**
	 * Default constructor for Carpet
	 */
	public Carpet() {
		
	}
	
	/**
	 * Constructor for Carpet objects.
	 * @param squareFeet double, the total square feet needing carpet.
	 * @param costPerSquareFoot double, the cost of each square foot of carpet.
	 */
	public Carpet(double squareFeet, double costPerSquareFoot) {
		this.costPerSquareFoot = costPerSquareFoot;
		this.squareFeet = squareFeet;
		this.computeTotalCost();
	}
	
	/**
	 * @return double costPerSquareFeet
	 */
	public double getCostPerSquareFoot() {
		return this.costPerSquareFoot;
	}
	
	/**
	 * Set the cost of square feet.
	 * @param cost double, the cost of carpet per square foot.
	 */
	public void setCostPerSquareFoot(double cost) {
		this.costPerSquareFoot = cost;
	}
	
	/**
	 * @return double, the square feet needing carpet.
	 */
	public double getSquareFeet() {
		return this.squareFeet;
	}
	
	/**
	 * Set the number of square feet needing carpet
	 * @param squareFeet double, the number of square feet needing carpet.
	 */
	public void setSquareFeet(double squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	/**
	 * Multiplies the number of square feet of carpet by the cost of carpet per square feet.
	 * @return double, the total cost for carpet.
	 */
	public double getTotalCost() {
		return this.squareFeet * this.costPerSquareFoot;
	}
	
	/**
	 * Sets the total cost to the result of getTotalCost()
	 */
	public void computeTotalCost() {
		this.totalCost = this.getTotalCost();
	}
	
	/**
	 * Prompts the user for the cost of carpet per square foot and stores the value
	 * in costPerSquareFoot.
	 */
	public void promptCarpetCost() {
		System.out.print("\nHow much does the carpet cost per square foot? ");
		this.costPerSquareFoot = console.nextDouble();
		
	}
}
