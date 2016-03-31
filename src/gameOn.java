import java.util.Scanner; 
 
 
 public class gameOn { 
 	public static void main(String[] args) { 
 		int Dice; 
 		int Comp; 
 		int Play = 0; 
 		int CountTurns = 0; 
		int CountWins = 0; 
 		int WinPercent; 
 		int CountEvenGuesses = 0; 
 		int CountOddDice = 0; 
		int EvenPercent; 
 		int OddPercent; 
 		String turn = "yes"; 
 		String PlayerGuess; 
 		int Player = 0; 
 
 		Scanner Input = new Scanner(System.in); 
 		 
 		System.out.println( 
 				"Lets play a game. The computer will roll a dice, can you guess if it will be an even or odd number?"); 
 		while (turn.toLowerCase().equals("yes")) { 
 		System.out.println("Ready? "); 
 		Dice = 0 + (int) (Math.random() * 6); 
 		System.out.print("Now write if the number is odd or even: "); 
 		PlayerGuess = Input.next(); 
 		// 1=odd, 0=even 


 		if (PlayerGuess.toLowerCase().equals("odd")) 
 			Player = 1; 
 		else if (PlayerGuess.toLowerCase().equals("even")) 
 			Player = 0; 
 
 
 		System.out.println("The number rolled was:" + Dice); 
 		Comp = Dice % 2; 
 		if (Comp == 0) 
 			CountEvenGuesses++; 
 		else 
 			CountOddDice++; 
 		if (Player == Comp) { 
 			System.out.println("Congrats, that is correct!"); 
 			CountWins++; 
 		} else 
			System.out.println("Ohh sorry that is not correct"); 
 		CountTurns++; 
 		OddPercent = (CountOddDice * 100) / CountTurns; 
 		EvenPercent = (CountEvenGuesses * 100) / CountTurns; 
 		System.out.println("Percentage of odd numbers: " + OddPercent); 
 		System.out.println("Percentage of even guesses: " + EvenPercent); 
 		System.out.println("Number of games you have played is: " + CountTurns); 
 		WinPercent = (CountWins * 100) / CountTurns; 
 		System.out.println("Your winning percentage is: " + WinPercent); 
 		System.out.println("Would you like to play again?(yes/no): "); 
 		turn = Input.next(); 
 		} 
 	} 
 } 
