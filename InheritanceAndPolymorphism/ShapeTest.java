import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ShapeTest {
	
	public static void main(String[] args) 
	{	
		int option=0;
		do { //ask for a option at least once
			System.out.println("Please choose one of the following options");
			System.out.println("1. Create a Point");
			System.out.println("2. Create a Circle");
			System.out.println("3. Create a Cylinder");
			System.out.println("4. Exit");
			double radius, height; 
			Scanner inputoption = new Scanner(System.in); //scanner for input
			try { // to catch the exception that java doesn't allow
				option = inputoption.nextInt(); //get the option
				switch (option) {
				case 1: { //create a point
					System.out.println("Please enter x coordinate");
					int xCoord = inputoption.nextInt(); // get x coordinate
														
					System.out.println("Please enter y coordinate");
					int yCoord = inputoption.nextInt(); //get y coordinate
					
					Point pointShape = new Point(xCoord, yCoord); //create a new point
					DecimalFormat doubleFormat = new DecimalFormat("#.00");
					System.out.println(pointShape.getName() + ": " + pointShape.toString());
					
				}
					break;
				case 2: { //circle
					System.out.println("Please enter x coordinate");
					int xCoord = inputoption.nextInt(); //get x coordinate 
					
					System.out.println("Please enter y coordinate");
					int yCoord = inputoption.nextInt(); //get y coordinate
					
					System.out.println("Please enter radius");
					radius = inputoption.nextDouble();  //get radius
															
					Circle circleShape = new Circle(xCoord, yCoord, radius); //create a new circle
					//print the shape to output
					DecimalFormat doubleFormat = new DecimalFormat("#.00");
					System.out.println(circleShape.getName() + ": " + circleShape.toString());
					System.out.println("Area: " + doubleFormat.format(circleShape.getArea()) + " units squared");
				}
					break;
				case 3: { // cylinder
					System.out.println("Please enter x coordinate");
					int xCoord = inputoption.nextInt(); // get x coordinate
		
					System.out.println("Please enter y coordinate");
					int yCoord = inputoption.nextInt(); // get y coordinate
					
					System.out.println("Please enter radius");
					radius = inputoption.nextDouble(); // get radius
														
					System.out.println("Please enter height");
					height = inputoption.nextDouble(); //get height
					
					Cylinder cylinderShape = new Cylinder(xCoord, yCoord, radius, height); //create new cylinder
					//print the shape to output
					DecimalFormat doubleFormat = new DecimalFormat("#.00");
					System.out.println(cylinderShape.getName() + ": " + cylinderShape.toString());
					System.out.println("Area: " + doubleFormat.format(cylinderShape.getArea()) + " units squared");
					System.out.println("Volume " + doubleFormat.format(cylinderShape.getVolume()) + " units cubed");

				}
					break;
				case 4: { //exit
					System.out.println("Your exit has been successful ");
				}break;
				default:
				{ //integer value that is not within 1-4
					System.out.println("Please enter a valid options");
				}break;
				}
			} catch (InputMismatchException mismatchException) { //if user enters wrong type of input
				System.err.println("You've entered a wrong type of value. Please try again.");
			}
		} while (option != 4);
		
	}
	
}
