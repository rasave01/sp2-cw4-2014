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
	public final void test() {
		int row=0;
		int column=9;
		
		boolean expectedOutput=true;
		
		Ocean ocean = new Ocean();
		
		boolean actualOutput = Ship.goodShipPlace(row, column, ocean);
		
		assertEquals("Wrong answer :( ", expectedOutput, actualOutput);
	}

}
