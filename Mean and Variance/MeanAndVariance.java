import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MeanAndVariance 
{ 
	public static double calculateMean(double[] arguments) throws NullPointerException //throws exception when there is null data
	{
		double mean = 0;
		double sum = 0;
		if(arguments.length>0)//Check if there is data i.e. arguments array is not null
		{
			for(int i=1; i <= arguments.length; i++) //for loop to calculate sum of every elements of array
			{
				sum+= arguments[i-1];
			}
			mean = sum / arguments.length; //calculates the mean
			return mean;// return mean value whenever the function calculateMean is called with valid argument
		}
		else 
		{
			throw new NullPointerException();// so that when there is no data the mean value is not returned to be 0
		}
		

	}
	public static double calculateVariance(double[] arguments)
	{
		double variance = 0;
		double mean = calculateMean(arguments); //calculate mean 
		int n = arguments.length; //stores the number of elements of the array i.e. frequency
		
		if(n>1) //since variance is zero for n=1
		{
			for(int i = 0; i<arguments.length; i++)
			{
				variance += Math.pow(arguments[i]-mean, 2)/ (n);//formula to calculate variance
			}
		}
			
		return variance;
	}
	public static double[] getArguments(int nArgs, Scanner inputStream) //to get the user input of the data
	{
		double[] arguments = new double[nArgs];
		
		for(int i =0; i<nArgs; i++)//run until i<number of elements to be entered
		{
			System.out.println("Please Enter argument " + (i+1));
			arguments[i] =  inputStream.nextDouble();
		}
		return arguments;
	}
	 
	public static void main(String [] args)
	{
		DecimalFormat doubleFormat = new DecimalFormat("#.00");
		double[] arguments = null;
		boolean exit;
		do
		{
			exit = false;
			System.out.println("Please Choose one of the following options:");
			System.out.println("1: Input data");
			System.out.println("2: Calculate Mean");
			System.out.println("3: Calculate Variance");
			System.out.println("4: Exit");
			
			Scanner myScanner = new Scanner(System.in);
			try //to catch the exception 
			{
				int choice = myScanner.nextInt();			
				switch(choice)
				{
				case 1:
				{
					System.out.println("Please enter the number of arguments");
					int number = myScanner.nextInt();
					arguments = getArguments(number, myScanner);//option 1 for data entry
				}
					break;
				case 2:
				{
						double mean = calculateMean(arguments); //option 2 for calculating mean
						System.out.println("Mean is: " + doubleFormat.format(mean));
				}
					break;
				case 3:
				{
					System.out.println("Variance is " + doubleFormat.format(calculateVariance(arguments))); // option 3 for calculating variance
				}
					break;
				case 4:
				{
					System.out.println("You exit has been successful");
					exit = true;
				}
					break;
				default:
				{
					System.out.println("Sorry, you must enter a valid option");
				}
					break;
				}
			}
			catch (InputMismatchException inputMismatchException)
			{
				System.err.println("You've entered a wrong type of value. Please enter an integer value");
			}
			catch(NegativeArraySizeException negativeFrequency) //when the number of data inputed is in negative
			{
				System.err.println("You've entered a wrong type of value. Please enter a positive integer value");
			}
			catch(NullPointerException outOfBoundsException)
			{
				System.err.println("Sorry you have not entered any elements. Try again.");
			}
		}while(!exit);
	}
}
