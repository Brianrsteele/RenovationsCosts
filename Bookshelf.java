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


/**
 * Bookshelf class holds information and methods related to windows for the renovationCostsProgram
 * 
 * @author briansteele
 *
 */
public class Bookshelf extends RoomElement {
	
	/**
	 * Constructor for the Bookshelf class
	 * 
	 * @param height - double, the height of the bookshelf in feet.
	 * @param width - double, the width of the bookshelf in feet.
	 */
	public Bookshelf (double height, double width) {
		super(height, width);
	}
	


	/**
	 * return string representing bookshelf dimensions.
	 */
	@Override
	public String toString() {
		return String.format("Bookshelf %s x %s, %s sqft",  super.getHeight(), super.getWidth(), super.getElementSquareFeet());
	}

}
