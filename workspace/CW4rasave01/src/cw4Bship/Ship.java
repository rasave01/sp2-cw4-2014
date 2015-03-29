package cw4Bship;

/**
 * @author Radu
 *@version 1.1
 *@date 29/03/15
 */
public class Ship {
	/**
	 *  ocean row containing the bow (front) of the ship
	 */
	int bowRow;

	/**
	 * ocean column containing the bow (front) of the ship
	 */
	int bowColumn;

	// number of squares occupied by the ship
	/**
	 * 
	 */
	int length;

	// orientation of the ship - true if the ship occupies a single row, false
	// otherwise
	/**
	 * 
	 */
	boolean horizontal;

	// array telling whether that part of the ship has been hit
	/**
	 * 
	 */
	boolean[] hit = new boolean[1];

	// getters
	/**
	 * @return
	 */
	int getBowRow() {
		return this.bowRow;
	}

	/**
	 * @return
	 */
	int getBowColumn() {
		return this.bowColumn;
	}

	/**
	 * @return
	 */
	boolean isHorizontal() {
		return this.horizontal;
	}

	/**
	 * @return
	 */
	String getShipType() {
		String ShipType = "overwrite this";
		return ShipType;
	}

	/**
	 * @return
	 */
	int getLength() {
		return this.length;
	}

	// setters
	/**
	 * @param row
	 */
	void setBowRow(int row) {
		this.bowRow = row;
	}

	/**
	 * @param column
	 */
	void setBowColumn(int column) {
		this.bowColumn = column;
	}

	/**
	 * @param horizontal
	 */
	void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	// instance methods
	/**
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 * @return
	 */
	boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		if (horizontal) {
			// check horizontal neighbours
			for (int i = 0; i < this.length; i++) {
				if (!goodShipPlace(row, column + i, ocean))
					return false;
			}
		} else {
			// check vertical neighbours
			for (int i = 0; i < this.length; i++) {
				if (!goodShipPlace(row + i, column, ocean))
					return false;
			}
		}
		return true;
	}

	/**
	 * @param row
	 * @param column
	 * @param ocean
	 * @return
	 */
	static boolean goodShipPlace(int row, int column, Ocean ocean) {

		boolean ship = false;
		boolean shipN = false;
		boolean shipNwest = false;
		boolean shipW = false;
		boolean shipSwest = false;
		boolean shipS = false;
		boolean shipSeast = false;
		boolean shipE = false;
		boolean shipNeast = false;
		// check ship
		if (ocean.isOccupied(row, column)) {
			return false;
		} else {
			ship = true;

			// check North of ship
			if (row == 0) {
				shipN = true;
			} else {
				if (ocean.isOccupied(row - 1, column)) {
					return false;
				} else
					shipN = true;
			}

			// check South of ship
			if (row == 9) {
				shipS = true;
			} else {
				if (ocean.isOccupied(row + 1, column)) {
					return false;
				} else
					shipS = true;
			}

			// check East of ship is free
			if (column == 0) {
				shipE = true;
			} else {
				if (ocean.isOccupied(row, column - 1)) {
					return false;
				} else
					shipE = true;
			}

			// check West of ship
			if (column == 9) {
				shipW = true;
			} else {
				if (ocean.isOccupied(row, column + 1)) {
					return false;
				} else
					shipW = true;
			}

			// check North-West of ship
			if (row == 0 || column == 0) {
				shipNwest = true;
			} else {
				if (ocean.isOccupied(row - 1, column - 1)) {
					return false;
				} else
					shipNwest = true;
			}

			// check North-East of ship
			if (row == 0 || column == 9) {
				shipNeast = true;
			} else {
				if (ocean.isOccupied(row - 1, column + 1)) {
					return false;
				} else
					shipNeast = true;
			}

			// check South-East of ship
			if (row == 9 || column == 9) {
				shipSeast = true;
			} else {
				if (ocean.isOccupied(row + 1, column + 1)) {
					return false;
				} else
					shipSeast = true;
			}

			// check South-West of ship
			if (row == 9 || column == 0) {
				shipSwest = true;
			} else {
				if (ocean.isOccupied(row + 1, column - 1)) {
					return false;
				} else
					shipSwest = true;
			}
		}
		if (ship && shipN && shipNwest && shipW && shipSwest && shipS
				&& shipSeast && shipE && shipNeast) {
			return true;
		}
		return false;
	}

	/**
	 * @param row
	 * @param column
	 * @param horizontal
	 * @param ocean
	 */
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		// Set bow
		this.setBowRow(row);
		this.setBowColumn(column);
		// Set orientation
		this.setHorizontal(horizontal);
		// Check orientation
		if (horizontal) {
			// Place as many one-square ships as length of ship
			for (int i = 0; i < this.length; i++) {
				// Destroy empty sea
				ocean.ships[row][column + i] = null;
				// Replace with reference to this object
				ocean.ships[row][column + i] = this;
			}
		} else {
			for (int i = 0; i < this.length; i++) {
				// Destroy empty sea
				ocean.ships[row + i][column] = null;
				// Replace with reference to this object
				ocean.ships[row + i][column] = this;
			}
		}
	}

	/**
	 * @param row
	 * @param column
	 * @return
	 */
	boolean shootAt(int row, int column) {
		if (this.getShipType() == "empty sea") {
			return false;
		}
		if (this.isHorizontal())
			this.hit[column - this.getBowColumn()] = true;
		this.hit[row - this.getBowRow()] = true;
		return true;
	}

	/**
	 * @return
	 */
	boolean isSunk() {
		{
			for (boolean sunk : this.hit) {
				if (!sunk)
					return false;
			}
		}
		return true;
	}
}
