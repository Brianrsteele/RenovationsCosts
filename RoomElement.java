package renovationCostsProgram;

/**
 * Window class holds information and methods related to elements of a room for the renovationCostsProgram.
 * The superclass for Windows, Doors, and Bookshelves.
 * 
 * @author briansteele
 *
 */
public class RoomElement {
	
	private double height, width;
	private double elementSquareFeet;
	
	/**
	 * Constructor for the RoomElement class
	 * 
	 * @param height - double, the height of the element in feet.
	 * @param width - double, the width of the element in feet.
	 */
	public RoomElement(double height, double width) {
		this.height = height;
		this.width = width;
		this.computeSquareFeet();
		
	}
	
	/**
	 * compute the total square feet of the window
	 */
	public void computeSquareFeet() {
		this.elementSquareFeet = this.height * this.width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @return the windowSquareFeet
	 */
	public double getElementSquareFeet() {
		return elementSquareFeet;
	}


	/**
	 * return string representing door dimensions.
	 */
	@Override
	public String toString() {
		return String.format("Element [height=%s, width=%s, elementSquareFeet=%s]", height, width, elementSquareFeet);
	}

}
