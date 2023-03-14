package dessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SundaeTest {

	@Test
	void testGetToppingName() {
		Sundae p = new Sundae ("chocolate", 1, 2.0, "cherry", 1.5);
		String w = p.getToppingName();
		assertEquals(w, "cherry");
	}

	@Test
	void testGetToppingPrice() {
		Sundae p = new Sundae ("chocolate", 1, 2.0, "cherry", 1.5);
		double w = p.getToppingPrice();
		assertEquals(w, 1.5);
	}

	@Test
	void testSetToppingName() {
		Sundae p = new Sundae ("chocolate", 1, 2.0, "cherry", 1.5);
		String w = p.getToppingName();
		assertEquals(w, "cherry");
	}

	@Test
	void testSetToppingPrice() {
		Sundae p = new Sundae ("chocolate", 1, 2.0, "cherry", 1.5);
		double w = p.getToppingPrice();
		assertEquals(w, 1.5);
	}
	
	@Test
	void testCalculateCost() {
		Sundae p = new Sundae("chocolate", 1, 2.0, "cherry", 1.5);
		double w = p.calculateCost();
		assertEquals(w, 3.5);
	}
	
	@Test
	void testCalculateTax() {
		Sundae p = new Sundae("chocolate", 1, 2.0, "cherry", 1.5);
		double w = p.calculateTax();
		assertEquals(w, 0.25375);
	}

}
