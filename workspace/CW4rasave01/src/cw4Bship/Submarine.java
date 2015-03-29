package cw4Bship;
/**
 * @author Radu
 *@version 1.1
 *@date 29/03/15
 */
public class Submarine extends Ship {

	// constructor
	public Submarine() {
		this.length = 1;
		this.hit = new boolean[1];
	}

	@Override
	public String toString() {
		return "S";
	}

	@Override
	String getShipType() {
		String ShipType = "submarine";
		return ShipType;
	}

}
