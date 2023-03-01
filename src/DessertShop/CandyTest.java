package DessertShop;

class CandyTest {

	@Test
	void testGetCandyWeight() {
		Candy p = new Candy ("chocolate", 1.5, 2.0);
		double w = p.getCandyWeight();
		assertEquals(w, 1.5);
	}

	@Test
	void testGetPricePerPound() {
		Candy v = new Candy ("chocolate", 1.5, 2.0);
		double w = v.getPricePerPound();
		assertEquals(w, 2.0);
	}

	@Test
	void testSetCandyWeight() {
		Candy p = new Candy ("chocolate", 1.5, 2.0);
		double w = p.getCandyWeight();
		assertEquals(w, 1.5);
	}

	@Test
	void testSetPricePerPound() {
		Candy v = new Candy ("chocolate", 1.5, 2.0);
		double w = v.getPricePerPound();
		assertEquals(w, 2.0);
	}
	
	@Test
	void testCalculateCost() {
		Candy a = new Candy("chocolate", 1.5, 2.0);
		double w = a.calculateCost();
		assertEquals(w, 3);
	}
	
	@Test
	void testCalculateTax() {
		Candy a = new Candy("chocolate", 1.5, 2.0);
		double w = a.calculateTax();
		assertEquals(w, 0.2175);
	}


}
