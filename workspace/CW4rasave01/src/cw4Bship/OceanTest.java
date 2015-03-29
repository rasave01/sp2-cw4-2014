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
public class OceanTest {

	/**
	 * Test method for {@link cw4Bship.Ocean#isOccupied(int, int)}.
	 */
	@Test
	public final void testIsOccupied() {
		int row = 9;
		int column = 9;

		boolean expectedOutput = false;

		Ocean ocean = new Ocean();

		boolean actualOutput = ocean.isOccupied(row, column);

		assertEquals("Wrong answer :( ", expectedOutput, actualOutput);
	}

}
