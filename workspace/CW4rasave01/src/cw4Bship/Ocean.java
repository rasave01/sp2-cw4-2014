package cw4Bship;

import java.util.Random;

public class Ocean {

	Ship [][]ships=new Ship[10][10];
	int shotsFiered;
	int hitCount;
	int shipsSunk;
	
	Ocean(){
		// initialise ships array
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				ships[i][j] = new EmptySea();
			}
		}
		boolean gameOver=false;
		int shotsFiered=0;
		int hitCount=0;
		int ShipsSunk=0;
	}	
	//print the ocean
	void print(){	
		System.out.println("  0 1 2 3 4 5 6 7 8 9");
		for (int i=0;i<10;i++){
			System.out.print(i+" ");
			for (int j=0;j<10;j++){
				String point= ships[i][j].toString()+" ";
				System.out.print(point);
			}
			System.out.print("\n");
		}
	}
	
	//Returns true if the given location contains a ship, false if it does not.
	boolean isOccupied(int row, int column){
		boolean result=false;
		if (ships[row][column] instanceof EmptySea){
			result=true;
		}
		return result;
	}
	
	//Place all ten ships randomly on the (initially empty)ocean. 
	//Place larger ships before smaller ones, to avoid ending up with no legal
	//place to put a large ship
	void placeAllShipsRandomly(){
		// place 4 submarines
		for(int i=0; i<4; i++){
			
			//Initialise placing cycle
			boolean notPlaced=true;
			do{
				int row=randomInt(0,9);
				int column=randomInt(0,9);
				if(!isOccupied(row, column)){
					//get horizontal randomly
					boolean horizontal = false;
					int rdnHorizontal=randomInt(0,1);
					if(rdnHorizontal==1){
						horizontal=true;
					}
					if (!isOccupied(row, column)){
						if(ships[row][column].okToPlaceShipAt(row,column, horizontal, this)){
							ships[row][column].placeShipAt(row,column, horizontal, this);
							notPlaced=false;
						}
					}	
				}
			}while (notPlaced==true);
		}	
	}
	//returns a random integer between the two values, including the two values
	int randomInt(int min, int max){
		//generate random object
		Random rndNo = new Random();
		//set up the range 
		int range = max - min + 1;
		// cast result to int from range and add smaller value
		int result =  rndNo.nextInt(range) + min;
		return result;
	}
	
}

