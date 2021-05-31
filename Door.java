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
 * Door class extends RoomElement and holds information and methods related to doors for the renovationCostsProgram
 * 
 * @author briansteele
 *
 */
public class Door extends RoomElement {
	
	
	/**
	 * Constructor for the Door class
	 * 
	 * @param height - double, the height of the Door in feet.
	 * @param width - double, the width of the Door in feet.
	 */
	public Door(double height, double width) {
		super(height, width);
	}
	


	/**
	 * return string representing door dimensions.
	 */
	@Override
	public String toString() {
		return String.format("Door %s x %s, %s sqft", super.getHeight(), super.getWidth(), super.getElementSquareFeet());
	}

}

