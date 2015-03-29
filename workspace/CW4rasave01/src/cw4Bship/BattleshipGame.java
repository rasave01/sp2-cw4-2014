package cw4Bship;

public class BattleshipGame {

	public static void main(String[] args) {
		System.out.println(">> Welcome to BATTLESHIPS, an SP2 coursework in Java, by Radu Asavei - March 2015");
		// create ocean
		Ocean ocean=new Ocean();
		System.out.println(">> Clear 10 x 10 ocean created!");
		ocean.print();
		// place ships randomly
		ocean.placeAllShipsRandomly();
		System.out.println(">> All ships were placed randomly on rows or columns:");
		System.out.println(">> 1 x Battleship (BBBB)");
		System.out.println(">> 2 x Cruisers (CCC)");
		System.out.println(">> 3 x Destroyers (DD)");
		System.out.println(">> 4 x Submarines (S)");
		System.out.println(">> Remember, all ships can be either vertical or horizontal");
		System.out.println(">> and all ships are surrounded by empty water or edge of ocean.");
		
	}

}
