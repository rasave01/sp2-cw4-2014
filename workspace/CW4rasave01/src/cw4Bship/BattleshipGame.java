package cw4Bship;

public class BattleshipGame {

	public static void main(String[] args) {
		Ocean ocean=new Ocean();
		System.out.println(">> Clear ocean created!");
		ocean.placeAllShipsRandomly();
		ocean.print();
	}

}
