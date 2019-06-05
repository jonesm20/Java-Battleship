import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShipTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testShip() {
		Ship testShip = new Ship(2);
		assertEquals(testShip.getDirection(), -1);
		assertEquals(testShip.getLength(), 2);
		assertEquals(testShip.getRow(), -1);
		assertEquals(testShip.getCol(), -1);
	}

	@Test
	void testIsLocationSet() {
		Ship testShip = new Ship(2);
		assertEquals(testShip.isLocationSet(), false);
		testShip.setLocation(0, 0);
		assertEquals(testShip.isLocationSet(), true);
	}
	

	@Test
	void testIsDirectionSet() {
		Ship testShip = new Ship(2);
		assertEquals(testShip.isDirectionSet(), false);
		testShip.setDirection(1);
		assertEquals(testShip.isDirectionSet(), true);
		assertThrows(IllegalArgumentException.class, () -> {
	        testShip.setDirection(2);
	    });
		assertThrows(IllegalArgumentException.class, () -> {
	        testShip.setDirection(-2);
	    });
	}

	@Test
	void testSetLocation() {
		Ship testShip = new Ship(2);
		testShip.setLocation(0, 0);
		assertEquals(testShip.getRow(), 0);
		assertEquals(testShip.getCol(), 0);
	}

	@Test
	void testSetDirection() {
		Ship testShip = new Ship(2);
		testShip.setDirection(0);
		assertEquals(testShip.getDirection(), 0);
	}

	@Test
	void testGetRow() {
		Ship testShip = new Ship(3);
		testShip.setLocation(4, 2);
		assertEquals(testShip.getRow(), 4);
	}

	@Test
	void testGetCol() {
		Ship testShip = new Ship(4);
		testShip.setLocation(1, 3);
		assertEquals(testShip.getCol(), 3);
	}

	@Test
	void testGetLength() {
		Ship testShip = new Ship(3);
		assertEquals(testShip.getLength(), 3);
	}

	@Test
	void testGetDirection() {
		Ship testShip = new Ship(2);
		assertEquals(testShip.getDirection(), -1);
		testShip.setDirection(1);
		assertEquals(testShip.getDirection(), 1);
		testShip.setDirection(0);
		assertEquals(testShip.getDirection(), 0);
	}
	
	@Test
	void testToString() {
		Ship testShip = new Ship(4);
		testShip.setLocation(5, 7);
		assertEquals(testShip.toString(), "Ship: 5, 7 with length 4 and direction UNSET");
		testShip.setDirection(0);
		assertEquals(testShip.toString(), "Ship: 5, 7 with length 4 and direction HORIZONTAL");
		testShip.setDirection(1);
		assertEquals(testShip.toString(), "Ship: 5, 7 with length 4 and direction VERTICAL");
	}

}
