package cw4Bship;

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
