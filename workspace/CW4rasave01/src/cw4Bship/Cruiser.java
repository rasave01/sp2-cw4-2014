package cw4Bship;

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
