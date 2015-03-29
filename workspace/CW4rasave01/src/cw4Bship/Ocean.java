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
//		boolean gameOver=false;
//		int shotsFiered=0;
//		int hitCount=0;
//		int ShipsSunk=0;
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
		if (ships[row][column] instanceof EmptySea){
			return false;
		} else return true;
	}
	
	//Place all ten ships randomly on the (initially empty)ocean. 
	//Place larger ships before smaller ones, to avoid ending up with no legal
	//place to put a large ship
	void placeAllShipsRandomly(){
		
		//Initialise paced battleships vars
		int Bplaced=0;
		int Cplaced=0;
		int Dplaced=0;
		int Splaced=0;
	// place 
		do{
		// place battleship x 1
			//generate random place for bow
			int row=randomInt(0,6);
			int column=randomInt(0,6);
			// check generated place is not occupied
			if(!isOccupied(row, column)){
				//get horizontal randomly
				boolean horizontal = false;
				int rdnHorizontal=randomInt(0,1);
				if(rdnHorizontal==1){
					horizontal=true;
				}
				// create new ship
				Battleship newBattleship = new Battleship();
				if(newBattleship.okToPlaceShipAt(row,column, horizontal, this)){
					// pace ship on the ocean
					newBattleship.placeShipAt(row,column, horizontal, this);
					// increase counter
					Bplaced++;	
				}	
			}
		}while (Bplaced<1);
		
		do{
			// place cruisers x 2	
			//generate random place for bow
			int row=randomInt(0,7);
			int column=randomInt(0,7);
			// check generated place is not occupied
			if(!isOccupied(row, column)){
				//get horizontal randomly
				boolean horizontal = false;
				int rdnHorizontal=randomInt(0,1);
				if(rdnHorizontal==1){
					horizontal=true;
				}
				// create new ship
				Cruiser newCruiser = new Cruiser();
				if(newCruiser.okToPlaceShipAt(row,column, horizontal, this)){	
					// pace ship on the ocean
					newCruiser.placeShipAt(row,column, horizontal, this);
					// increase counter
					Cplaced++;
				}	
			}
		}while (Cplaced<2);
		
		do{
			// place destroyers x 3	
			//generate random place for bow
			int row=randomInt(0,8);
			int column=randomInt(0,8);
			// check generated place is not occupied
			if(!isOccupied(row, column)){
				//get horizontal randomly
				boolean horizontal = false;
				int rdnHorizontal=randomInt(0,1);
				if(rdnHorizontal==1){
					horizontal=true;
				}
				// create new ship
				Destroyer newCruiser = new Destroyer();
				if(newCruiser.okToPlaceShipAt(row,column, horizontal, this)){
					// pace ship on the ocean
					newCruiser.placeShipAt(row,column, horizontal, this);
					// increase counter
					Dplaced++;	
				}	
			}
		}while (Dplaced<3);
		
		do{
			// place submarines x 4	
			//generate random place for bow
			int row=randomInt(0,9);
			int column=randomInt(0,9);
			// check generated place is not occupied
			if(!isOccupied(row, column)){
				//get horizontal randomly
				boolean horizontal = false;
				int rdnHorizontal=randomInt(0,1);
				if(rdnHorizontal==1){
					horizontal=true;
				}
				// create new ship
				Submarine newSubmarine = new Submarine();
				if(newSubmarine.okToPlaceShipAt(row,column, horizontal, this)){
					// pace ship on the ocean
					newSubmarine.placeShipAt(row,column, horizontal, this);
					// increase counter
					Splaced++;	
				}	
			}
		}while (Splaced<4);
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

