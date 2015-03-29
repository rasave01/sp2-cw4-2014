package cw4Bship;

public class Submarine extends Ship {

	// constructor
		public Submarine() {
			this.length=1;
			this.hit = new boolean[1];
		}
		
		@Override public String toString(){
			return "S";
		}
		
		@Override String getShipType(){
			String ShipType = "submarine";
			return ShipType;
		}
	
}
