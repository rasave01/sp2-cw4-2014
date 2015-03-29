package cw4Bship;
/**
 * @author Radu
 *@version 1.1
 *@date 29/03/15
 */
public class Destroyer extends Ship {

	// constructor
	public Destroyer() {
		this.length = 2;
		this.hit = new boolean[2];
	}

	@Override
	public String toString() {
		return "S";
	}

	@Override
	String getShipType() {
		String ShipType = "destroyer";
		return ShipType;
	}
}
