package cw4Bship;

public class Destroyer extends Ship{
	
	boolean [] hit = new boolean[2];
	
	// constructor
		public Destroyer() {
			this.length=2;
		}
		@Override public String toString(){
			return "D";
		}
}
