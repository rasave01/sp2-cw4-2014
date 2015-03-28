package cw4Bship;

public class EmptySea extends Ship{
	
	// constructor
	public EmptySea() {
		this.length=1;
	}
	
	@Override public String toString(){
		return ".";
	}

	@Override boolean shootAt(int row, int column){
		return false;
	}
	
	@Override boolean isSunk(){
		return false;
	}

}
