
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ThrowDice {
	public static int randomThrow(int numberOfSides) // function that is called to generate random throws
	{ 
		int result;
		Random randGenerator = new Random(); //instantiate the random generator
		result = randGenerator.nextInt(numberOfSides); //generate a new random number from 1 to number of sides
		return result; 
	}
	
	public static void main(String[] args)
	{
		int numberOfSides = 0;
		int numberOfThrows = 0;
		while(true)
		{
			Scanner myScanner = new Scanner(System.in); //declare scanner for input
			try //get the number of sides
			{
				System.out.println("Please enter the number of sides");
				numberOfSides = myScanner.nextInt(); //takes the input for number of sides
			}
			catch (InputMismatchException dataMismatch) { //invalid input for sides other than integers
				System.err.println("Sorry you must enter an integer for the number of sides");
				continue;
			}
			
			if(numberOfSides <=1) // this block of code runs when user enters <2 number of sides
			{
				
					System.err.println("Sorry you must enter a number of sides greater than 0");
					continue;
	
			}
			try{ // get the number of throws
				System.out.println("Please Enter the number of throws");
				numberOfThrows = myScanner.nextInt();
			}
			catch (InputMismatchException dataMismatch) { //invalid input for throws
				System.err.println("Sorry you must enter an integer for the number of throws");
				continue;
			}
			if(numberOfThrows <1) // negative number of sides
			{
				System.err.println("Sorry you must enter a number of rolls greater than 0");
					continue; // go back to start of loop
				
			}
			//initialize results
			int [] results = new int[numberOfSides]; // new array to store results of times landed on each side
			int tempResult;
			for(int sideCount = 0; sideCount<numberOfSides; sideCount++)
			{
				results[sideCount] = 0; //initialize storage array
			}
			if(numberOfThrows % numberOfSides == 0) // number of throws must be a multiple of number of sides
			{
				for(int rollCount = 0; rollCount<numberOfThrows; rollCount++)
				{
					tempResult = randomThrow(numberOfSides); //throw the dice
					results[tempResult]++; //increment the side on which it landed
				}
				for(int sideCount = 0; sideCount <numberOfSides; sideCount++)
				{
					System.out.println("Number of times landed on side " + (sideCount+1) + " is: " + results[sideCount]);
				}
				break;
			}
			else
			{
				System.err.println("Sorry number of throws must be a multiple of number of sides");
				continue; // go back to beginning
			}
		}
	}
	
}
