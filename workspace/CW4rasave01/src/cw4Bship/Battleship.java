package cw4Bship;

public class Battleship extends Ship{
	
	boolean [] hit = new boolean[4];
	
	// constructor
		public Battleship() {
			this.length=4;
		}
		
		@Override public String toString(){
			return "B";
		}
	
}
