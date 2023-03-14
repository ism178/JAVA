package dessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IceCreamTest {

	@Test
	void testGetScoopCount() {
		IceCream p = new IceCream ("chocolate", 1, 2.0);
		double w = p.getScoopCount();
		assertEquals(w, 1);
	}

	@Test
	void testGetPricePerScoop() {
		IceCream p = new IceCream ("chocolate", 1, 2.0);
		double w = p.getPricePerScoop();
		assertEquals(w, 2.0);
	}

	@Test
	void testSetScoopCount() {
		IceCream p = new IceCream ("chocolate", 1, 2.0);
		double w = p.getScoopCount();
		assertEquals(w, 1);
	}

	@Test
	void testSetPricePerScoop() {
		IceCream p = new IceCream ("chocolate", 1, 2.0);
		double w = p.getPricePerScoop();
		assertEquals(w, 2.0);
	}
	
	@Test
	void testCalculateCost() {
		IceCream a = new IceCream("chocolate", 1, 2.0);
		double w = a.calculateCost();
		assertEquals(w, 2);
	}
	
	@Test
	void testCalculateTax() {
		IceCream a = new IceCream("chocolate", 1, 2.0);
		double w = a.calculateTax();
		assertEquals(w, 0.145);
	}

}
