package dessertShop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import dessertShop.DessertItem;

class DessertItemTest {

	@Test
	void testGetName() {
		DessertItem p = new Candy ("cake", 1.5, 2.5);
		String name = p.getName();
		assertEquals(name, "cake");
	}

	@Test
	void testSetName() {
		DessertItem p = new Candy ("cake", 3.5, 4.5);
		String name = p.getName();
		assertEquals(name, "cake");
	}
	
	@Test
	void testGetTaxPercent() {
		Candy p = new Candy ("cake", 3.5, 4.5);
		double tax = p.getTaxPercent();
		assertEquals(tax, 7.25);
	}

	@Test
	void testSetTaxPercent() {
		Candy p = new Candy ("cake", 3.5, 4.5);
		double tax = p.getTaxPercent();
		assertEquals(tax, 7.25);
	}

}
