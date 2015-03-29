package cw4Bship;
/**
 * @author Radu
 *@version 1.1
 *@date 29/03/15
 */
public class Battleship extends Ship {

	// constructor
	public Battleship() {
		this.length = 4;
		this.hit = new boolean[4];
	}

	@Override
	public String toString() {
		return "S";
	}

	@Override
	String getShipType() {
		String ShipType = "battleship";
		return ShipType;
	}

}
