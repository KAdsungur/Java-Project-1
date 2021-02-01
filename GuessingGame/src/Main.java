import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Guessing Game");
		System.out.println("Enter the Maximum number");
		
		Scanner scnr = new Scanner(System.in);
		int Maxnum = scnr.nextInt();	
		GuessingGame Test1 = new GuessingGame(Maxnum); // calls overloaded constructor
		
		System.out.println("Enter the number of guesses allowed:");
		
		int MaxGuess = scnr.nextInt();
		Test1.newGame(MaxGuess);
		 
		
		System.out.println("The Auto Generated number is: " + Test1.GetAnswer());
		
		/** 
		 * This will start the game.
		 */
		Test1.runGame();
		scnr.close();
		
	}

}
