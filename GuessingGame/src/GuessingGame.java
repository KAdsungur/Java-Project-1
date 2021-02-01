import java.util.*;
public class GuessingGame {
	private int answer;
	private int max; // between 0 - max
	private int maxGuessesAllowed; // how many guesses a player gets  
	private boolean gameOver;
	private int numGuessesTaken;
	private int differential;
	
	
	public void newGame(int guess) { // sets max
		this.maxGuessesAllowed = guess;
		this.gameOver = false;
		this.numGuessesTaken = 0;  
		this.differential = max;
		
		Random ranNum = new Random(); // sets for random 
		int randomNum = ranNum.nextInt(max); // generates 0 - max
		this.answer = randomNum; // sets that random number to max
	}
	
	public GuessingGame() { // default constructor 
		this.max = 0;
		this.maxGuessesAllowed = 0;
	}
	
	public GuessingGame(int num){ // overloaded constructor
		this.max = num;
	}
	

	public int GetMax() { // gets max
		return max;
	}
	
	public int GetAnswer(){ // returns the auto generated number;
		return answer;
	}
	
	public void runGame(){ // will run the game till user guess or ends
		Scanner scnr = new Scanner(System.in);
		do {
			System.out.println("Enter your Enter your guess, remember it must be between 0 and "+max);
			int guess = scnr.nextInt();
			++numGuessesTaken;
			guess(guess);
			System.out.println(guess(guess));
			differential = guess;
			if(numGuessesTaken >= maxGuessesAllowed) { // will keep track of player moves
				gameOver = true;
			}
		}while(gameOver == false);
		scnr.close();
	}
	
	public String guess(int guess) { // will determine your output
		
		if(guess > max || guess < 0) {
			 return "Guess out of Range\n\n";
		}
		
		else {
			if(guess > answer){
				if(differential > guess) { // FIXMEEE
					return "Too High\nGetting Warmer";
				}
				else {
					return "Too High\nGetting Colder";
				}
			}
			else if(guess < answer){
				if(differential < guess) { //FIXMEE
					return "Too Low\nGetting Warmer";
				}
				else {
					return "Too Low\nGetting Colder";
				}
			}
			else {
				gameOver = true;
				return "Correct!\n";
			}
		}
	}
	

	}
