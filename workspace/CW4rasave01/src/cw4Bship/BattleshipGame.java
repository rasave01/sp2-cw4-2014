package cw4Bship;
/**
 * @author Radu
 *@version 1.1
 *@date 29/03/15
 */
import java.util.Scanner;

public class BattleshipGame {

	/**
	 * @param args
	 * Main program
	 */
	public static void main(String[] args) {
		System.out
				.println(">> Welcome to BATTLESHIPS, an SP2 coursework in Java, by Radu Asavei - March 2015");
		char playAgain = 'y';
		while (playAgain == 'y' || playAgain == 'Y') {
			// create ocean
			Ocean ocean = new Ocean();
			System.out.println(">> Clear 10 x 10 ocean created!");
			ocean.print();
			// place ships randomly
			ocean.placeAllShipsRandomly();
			// confirm ships have been placed
			System.out
					.println(">> All ships were placed randomly on rows or columns:");
			System.out
					.println(">> 1 x Battleship (BBBB); 2 x Cruisers (CCC); 3 x Destroyers (DD); 4 x Submarines (S)");
			System.out
					.println(">> Remember, all ships can be either vertical or horizontal");
			System.out
					.println(">> and all ships are surrounded by empty water or edge of ocean.");

			Scanner in = new Scanner(System.in);
			// start game cycle and run until all ships have been sunk
			while (!ocean.isGameOver()) {
				System.out.println(">> Take aim and shoot...");

				try {
					// get user input for row
					System.out.println("Enter row (0-9):");
					int row = in.nextInt();

					// get user input for column
					System.out.println("Enter column (0-9):");
					int column = in.nextInt();

					// shoot
					if (ocean.shootAt(row, column)) {
						System.out.println(">> Your shot at " + row + ","
								+ column + " is a hit");
						if (ocean.ships[row][column].isSunk()) {
							System.out.println(">> You just sunk a "
									+ ocean.ships[row][column].getShipType());
							ocean.shipsSunk++;
						}
					} else {
						System.out.println(">> Your shot at " + row + ","
								+ column + " is a miss");
					}
				} catch (Exception e) {
					System.out
							.println(">> Only numbers betwen 0 and 9 are allowed");
					in.next();
				}
			}

			System.out
					.println(">> Congratulations, you're a ***** WINNER *****");
			ocean.print();
			System.out.println(">> It took you " + ocean.shotsFiered
					+ " shots to sink all ships. Well done!");
			System.out
					.println("Would you like to play again (Y or y to play again)?");
			playAgain = in.next().charAt(0);
			in.close();
		}
	}
}
