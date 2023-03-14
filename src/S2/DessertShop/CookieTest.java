package dessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CookieTest {

	@Test
	void testGetCookieQty() {
		Cookie p = new Cookie ("chocolate", 1, 2.0);
		double w = p.getCookieQty();
		assertEquals(w, 1);
	}

	@Test
	void testGetPricePerDozen() {
		Cookie p = new Cookie ("chocolate", 1, 2.0);
		double w = p.getPricePerDozen();
		assertEquals(w, 2.0);
	}

	@Test
	void testSetCookieQty() {
		Cookie p = new Cookie ("chocolate", 1, 2.0);
		double w = p.getCookieQty();
		assertEquals(w, 1);
	}

	@Test
	void testSetPricePerDozen() {
		Cookie p = new Cookie ("chocolate", 1, 2.0);
		double w = p.getPricePerDozen();
		assertEquals(w, 2.0);
	}
	
	@Test
	void testCalculateCost() {
		Cookie b = new Cookie ("chocolate", 1, 2.0);
		double w = b.calculateCost()*12;
		assertEquals(w, 2);
	}
	
	@Test
	void testCalculateTax() {
		Cookie a = new Cookie("chocolate", 1, 2.0);
		double w = a.calculateTax()*12;
		assertEquals(w, 0.145);
	}

}
