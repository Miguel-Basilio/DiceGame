import javax.swing.JOptionPane; //Using Dialog box for the game 

public class gameOn {

	public static void main(String[] args) {
		String select;
		String c;
		float percentE = 0;// percent Even

		float percentO = 0;// percentage Odd

		float percentWin = 0;// percentage Win

		double count = 0;// Game Play

		double countE = 0;// An Even number will be generated by the dice

		double countO = 0;// An odd number will be generated by the dice

		double countWin = 0;// number of times to win

		do {
			count++;

			int rollDice = 1 + (int) (Math.random() * 6);

			if (rollDice % 2 != 0) {
				countO++;
				percentO = (float) (countO / count) * 100;

			}

			String guess = JOptionPane.showInputDialog(
					"You are about to roll a Six-Sided Dice. Do you think it will be even or odd(e/o):");
			select = guess.toUpperCase();
			switch (select) {
			case "E":

				countE++;// Tracking percenetage of player guesses EVEN
							// (track#3)
				percentE = (float) (countE / count) * 100;
				if (rollDice % 2 == 0) {
					countWin++;
					String messege = String.format("dice: %d\n Woooo you Win!\n ", rollDice);
					JOptionPane.showMessageDialog(null, messege);

				}

				else {
					String messege1 = String.format("dice: %d\n You Lose!\n ", rollDice);
					JOptionPane.showMessageDialog(null, messege1);
				}
				break;
			case "O":

				if (rollDice % 2 == 0) {
					String messege2 = String.format("dice: %d\n You lose!\n ", rollDice);
					JOptionPane.showMessageDialog(null, messege2);

				} else {
					countWin++;
					String messege3 = String.format("dice: %d\n Winner\n ", rollDice);
					JOptionPane.showMessageDialog(null, messege3);
				}
				break;

			}
			// track Percentage of wins
			percentWin = (float) (countWin / count) * 100;
			String messege4 = String.format(
					"Game play: %.2f\n  PerEven by player:%.2f\n  PerOdd by dice:%.2f\n PerWin:%.2f", count, percentE,
					percentO, percentWin);
			JOptionPane.showMessageDialog(null, messege4);

			c = JOptionPane.showInputDialog("Would you like to play again? enter y if yes enter n for no: ");

		} while (c.equalsIgnoreCase("y"));

		JOptionPane.showMessageDialog(null, "Thank you for Playing, please play again soon");
	}
}
