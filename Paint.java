/**
 *  From Chapter 2 of Java Programming: From Problem Analysis to Program Design
 *  by D.S. Malik
 *  
 *  Problem 18
 *  
 *  5/20/21
 *  
 *  Compute the cost of painting and carpeting a room with a door, two windows, and a bookshelf
 */
package renovationCostsProgram;

import java.util.Scanner;

/**
 * @author briansteele
 *
 */
public class Paint {
	
	private double costPerSquareFoot = 0;
	private double squareFeet = 0;
	private double totalCost = 0;
	Scanner console = new Scanner(System.in);
	
	
	
	/**
	 * Default constructor
	 */
	public Paint() {
		
	}
	
	/**
	 * Constructor
	 * @param squareFeet double, the total number of square feet needing paint.
	 * @param costPerSquareFoot double, the cost of paint per square foot.
	 */
	public Paint(double squareFeet, double costPerSquareFoot) {
		this.costPerSquareFoot = costPerSquareFoot;
		this.squareFeet = squareFeet;
		this.computeTotalCost();
	}
	
	/**
	 * Returns the cost per square foot for paint.
	 * @return double the cost of paint per square foot.
	 */
	public double getCostPerSquareFoot() {
		return this.costPerSquareFoot;
	}
	
	/**
	 * @param cost, double, the cost of paint per square foot.
	 */
	public void setCostPerSquareFoot(double cost) {
		this.costPerSquareFoot = cost;
	}
	
	/**
	 * @return squareFeet, double, containing the number of square feet of wall needing paint.
	 */
	public double getSquareFeet() {
		return this.squareFeet;
	}
	
	/**
	 * @param squareFeet, double, the number of square feet of wall needing paint.
	 */
	public void setSquareFeet(double squareFeet) {
		this.squareFeet = squareFeet;
	}
	
	/**
	 * @return totalCost, a double representing the cost of paint for all of the square footage.
	 */
	public double getTotalCost() {
		return this.totalCost;
	}
	
	/**
	 * Multiplies the number of square feet and the cost per square foot and stores in 
	 * the totalCost.
	 */
	public void computeTotalCost() {
		this.totalCost = this.squareFeet * this.costPerSquareFoot;
	
	}
	
	/**
	 *  Prompts the user for the cost of paint per square foot and assigns that value
	 *  to the costPerSquareFoot.
	 */
	public void promptPaintCost() {
		System.out.print("\nHow much does the paint cost per square foot? ");
		this.costPerSquareFoot = console.nextDouble();
		
	}
}

