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
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class representing a room in the renovationCostsProgram. Used to compute square footage of 
 * wall and floor space for cost estimate for carpet and paint.
 * 
 * @author briansteele
 *
 */
public class Room {
	
	//declare variables
	
	//roomElements holds doors, windows, and books
	ArrayList<RoomElement> roomElements;
	double height, width, length;
	Paint paint;
	Carpet carpet;
	
	// Create a scanner for prompting user for room information.
	Scanner console = new Scanner(System.in);
	
	
	
	/**
	 * Construcgtor
	 */
	public Room() {
		this.height = 0;
		this.width = 0;
		this.length = 0;
		this.roomElements = new ArrayList<RoomElement>();
	}
	
	public Room(double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.roomElements = new ArrayList<RoomElement>();
	}
	
	public void addElement(RoomElement element) {
		this.roomElements.add(element);
	}
	
	
	public double computeElementsSquareFeet() {
		double total = 0;
		for (RoomElement element : this.roomElements ) {
			total = total + element.getElementSquareFeet();
		}
		return total;
	}
	
	public double computeWallSquareFootage() {
		double wallSquareFootage = 0;
		wallSquareFootage = 2 * (this.length * this.height) + 2 * (this.width * this.height);
		return wallSquareFootage;
	}
	
	public double computeFloorSquareFootage() {
		double floorSquareFootage = 0;
		floorSquareFootage = (this.length * this.width);
		return floorSquareFootage;
	}
	
	public double computePaintSquareFootage() {
		return this.computeWallSquareFootage() - this.computeElementsSquareFeet();
	}
	
	public double computeCarpetSquareFootage() {
		return this.computeFloorSquareFootage();
	}
	
	public void promptRoomDimensions() {
		System.out.print("Enter the length of the room: ");
		double length = console.nextDouble();
		this.setLength(length);
		
		System.out.print("Enter the width of the room: ");
		double width = console.nextDouble();
		this.setWidth(width);
		
		System.out.print("Enter the height of the room: ");
		double height = console.nextDouble();
		this.setHeight(height);
	}
	
	public void promptRoomElements() {
		boolean flag = true;
		double height, width;
		while(flag == true) {
			System.out.println("\nChoose from below: ");
			System.out.println("1: Add a Window");
			System.out.println("2: Add a Door ");
			System.out.println("3: Add a Bookcase ");
			System.out.println("4: Exit and Compute Costs...");
			System.out.print("\nYour choice: ");
			int choice = console.nextInt();
		
			switch(choice) {
			case 1:
				System.out.print("\nEnter the height of the window: ");
				height = console.nextDouble();
				System.out.print("Enter the width of the window: ");
				width = console.nextDouble();
				Window w = new Window(height, width);
				this.addElement(w);
				System.out.println(this.elementsAsString());
				break;
			case 2:
				System.out.print("\nEnter the height of the door: ");
				height = console.nextDouble();
				System.out.print("Enter the width of the door: ");
				width = console.nextDouble();
				Door d = new Door(height, width);
				this.addElement(d);
				System.out.println(this.elementsAsString());
				break;
			case 3:
				System.out.print("\nEnter the height of the bookcase: ");
				height = console.nextDouble();
				System.out.print("Enter the width of the bookcase: ");
				width = console.nextDouble();
				Bookshelf b = new Bookshelf(height, width);
				this.addElement(b);
				System.out.println(this.elementsAsString());
				break;
			case 4:
				this.setUpPaint();
				this.setUpCarpet();
				
				System.out.println("\n\nSUMMARY:");
				System.out.println(this);
				System.out.printf("Paint costs: $%.2f for %.0f sqft.", this.paint.getTotalCost(), this.paint.getSquareFeet());
				System.out.printf("\nCarpet costs: $%.2f for %.0f sqft.", this.carpet.getTotalCost(), this.carpet.getSquareFeet());
				System.out.printf("\nTOTAL COST: $%.2f", this.carpet.getTotalCost() + this.paint.getTotalCost());
				
				flag = false;
				break;
			default:
				System.out.println("Sorry, choose and option from the menu...");
				break;
				
			
			
			}
		}
		
	}
	
	private void setUpPaint() {
		this.paint = new Paint();
		paint.setSquareFeet(this.computePaintSquareFootage());
		paint.promptPaintCost();
		paint.computeTotalCost();
		
	}
	
	private void setUpCarpet() {
		this.carpet = new Carpet();
		carpet.setSquareFeet(this.computeCarpetSquareFootage());
		carpet.promptCarpetCost();
		carpet.computeTotalCost();
		
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	public String elementsAsString() {
		String elements = "";
		if (this.roomElements.size() > 0) {
			elements += "\nTHIS ROOM CONTAINS: \n";
		}
		for (RoomElement element : this.roomElements ) {
			elements += element.toString() + "\n";
		}
		return elements;
		
	}

	@Override
	public String toString() {
		return String.format(
				"Room %s x %s x %s, walls = %s sqft, floor = %s sqft\n" + this.elementsAsString(),
				height, width, length, computeWallSquareFootage(), computeFloorSquareFootage());
	}

	
	
	

}
