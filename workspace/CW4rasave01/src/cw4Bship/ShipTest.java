/**
 * 
 */
package cw4Bship;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Radu
 *
 */
public class ShipTest {

	@Test
	public final void testgoodShipPlace() {
		int row = 0;
		int column = 9;

		boolean expectedOutput = true;

		Ocean ocean = new Ocean();

		boolean actualOutput = Ship.goodShipPlace(row, column, ocean);

		assertEquals("Wrong answer :( ", expectedOutput, actualOutput);
	}

	@Test
	public final void testokToPlaceShipAt() {
		int row = 9;
		int column = 9;
		boolean horizontal = true;

		boolean expectedOutput = true;

		Ocean ocean = new Ocean();

		Ship emptySea = new EmptySea();

		boolean actualOutput = emptySea.okToPlaceShipAt(row, column,
				horizontal, ocean);

		assertEquals("Wrong answer :( ", expectedOutput, actualOutput);
	}

}
