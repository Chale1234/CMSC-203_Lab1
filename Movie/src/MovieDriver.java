import java.util.Scanner;
/**
 * 
 */

/**
 * @author 
 *
 */
public class MovieDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String title;
		String rating;
		int ticketSold;
		int count = 0;
		String answer;
	// Getting input from the keyboard
		Scanner input = new Scanner(System.in);
		
	// Creating an object called movie F and F1
		Movie F = new Movie();
	

	// Creating the do while loop to validate and iterate if the user answer is yes	
	
	do 
	{      // Ask the user to enter the movie title and get the title.
			System.out.println(" Enter the name of a movie:");
			title = input.nextLine();
			
			// Ask the use to enter the movie rating and get the rating from the keyboard.
			System.out.println(" Enter the rating of the movie:");
			rating = input.nextLine();
			
			// Ask the user to enter the number of ticket sold for the movies and get the number
			System.out.println(" Enter the number of tickets sold for this movie:");
			ticketSold = input.nextInt();
			
			// Passing the argument title, rating , and ticket sold to f1
			Movie F1= new Movie(title, rating, ticketSold);
			
			// Printing out the name of the movie,rating and ticket sold together using toString 
			System.out.println(F1.toString());
			
			// asking the user whether he want to enter another movies or not
			System.out.println(" Do you want to enter another movie?(yes or no) ");
			answer =input.nextLine();
			answer = input.nextLine();
			
			
		
	}while  (answer.equalsIgnoreCase("yes"));
	System.out.println(" Goodbye");
	
	System.out.println("                          ");
	System.out.println(" Programmer name: Enchalew Abebe");
	System.out.println(" CMSC 203 lab#_1");
	System.out.println(" Instructor: Professor Ahmed Tarik");
	
	}
	
		 
	}


	 
	 
	


