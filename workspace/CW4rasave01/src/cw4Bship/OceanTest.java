/**
 * 
 */
package cw4Bship;

/**
 * @author Radu
 *@version 1.1
 *@date 29/03/15
 */
import static org.junit.Assert.*;

import org.junit.Test;

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
