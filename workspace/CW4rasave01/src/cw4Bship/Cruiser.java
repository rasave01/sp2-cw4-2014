package cw4Bship;
/**
 * @author Radu
 *@version 1.1
 *@date 29/03/15
 */
public class Cruiser extends Ship {

	// constructor
	public Cruiser() {
		this.length = 3;
		this.hit = new boolean[3];
	}

	@Override
	public String toString() {
		return "S";
	}

	@Override
	String getShipType() {
		String ShipType = "cruiser";
		return ShipType;
	}

}
