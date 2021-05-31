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
 * Main class for command line version of renovationsCostProgram
 * 
 * @author briansteele
 *
 */
public class renovationCostsProgramController {

	
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n"
				+ "╭━━━╮╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╭╮╭━━━╮╱╱╱╱╱╱╱╱╱╱╭╮╱╭━━━╮╱╱╱╱╱╭╮╱╭━━━╮╱╱╭╮╱╱╱╱╱╱╱╭╮\n"
				+ "┃╭━╮┃╱╱╱╱╱╭╯╰╮╱╱╱╱╱╱╱╱┃┃┃╭━╮┃╱╱╱╱╱╱╱╱╱╭╯╰╮┃╭━╮┃╱╱╱╱╭╯╰╮┃╭━━╯╱╭╯╰╮╱╱╱╱╱╭╯╰╮\n"
				+ "┃╰━╯┣━━┳┳━╋╮╭╯╭━━┳━╮╭━╯┃┃┃╱╰╋━━┳━┳━━┳━┻╮╭╯┃┃╱╰╋━━┳━┻╮╭╯┃╰━━┳━┻╮╭╋┳╮╭┳━┻╮╭╋┳━━┳━╮\n"
				+ "┃╭━━┫╭╮┣┫╭╮┫┃╱┃╭╮┃╭╮┫╭╮┃┃┃╱╭┫╭╮┃╭┫╭╮┃┃━┫┃╱┃┃╱╭┫╭╮┃━━┫┃╱┃╭━━┫━━┫┃┣┫╰╯┃╭╮┃┃┣┫╭╮┃╭╮╮\n"
				+ "┃┃╱╱┃╭╮┃┃┃┃┃╰╮┃╭╮┃┃┃┃╰╯┃┃╰━╯┃╭╮┃┃┃╰╯┃┃━┫╰╮┃╰━╯┃╰╯┣━━┃╰╮┃╰━━╋━━┃╰┫┃┃┃┃╭╮┃╰┫┃╰╯┃┃┃┃\n"
				+ "╰╯╱╱╰╯╰┻┻╯╰┻━╯╰╯╰┻╯╰┻━━╯╰━━━┻╯╰┻╯┃╭━┻━━┻━╯╰━━━┻━━┻━━┻━╯╰━━━┻━━┻━┻┻┻┻┻╯╰┻━┻┻━━┻╯╰╯\n"
				+ "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃┃\n"
				+ "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰╯");
		
		//https://fsymbols.com/generators/carty/
		
		System.out.println("\n\nBased on problem 18 from chapter 2 of D.S. Malik's\n"
						+ "texbook Java Programming, from Problem Analysis to Program Design.\n"
						+ "\nThis program will prompt a user for the dimensions of a room, ask the\n"
						+ "user to add doors, windows, or bookcases, and prompt the user for the\n"
						+ "dimensions of each door, window or bookcase added.\n"
						+ "\nTheprogram will then prompt the user for the price per square foot of both\n"
						+ "carpet and paint and compute the cost of painting and carpeting the room.\n\n");
		
		//Create the room object
		Room r = new Room();
		
		//Prompt for dimensions and create a room
		r.promptRoomDimensions();
		r.promptRoomElements();
		
		
		
		
	
	}

}
