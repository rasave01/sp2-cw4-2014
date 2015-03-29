package cw4Bship;

public class Submarine extends Ship {
	
	boolean [] hit = new boolean[1];
	
	// constructor
		public Submarine() {
			this.length=1;
		}
		
		@Override public String toString(){
			return "S";
		}
	
}
