package cw4Bship;

public class Cruiser extends Ship {
	
	boolean [] hit = new boolean[3];
	
	// constructor
		public Cruiser() {
			this.length=3;
		}
		
		@Override public String toString(){
			return "C";
		}
	
}
