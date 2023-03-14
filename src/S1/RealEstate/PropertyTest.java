package RealEstate;

public class PropertyTest {
    @Test
	void testGetStreetAdress() {
		Property p = new Property ("house", 0);
		String w = p.getStreetAdress();
		assertEquals(w, "house");
	}

    @Test
	void testSetStreetAdress() {
		Property p = new Property ("house", 0);
		String w = p.getStreetAdress();
		assertEquals(w, "house");
	}
    @Test
	void testGetZip() {
		Property p = new Property ("house", 2);
		int w = p.getZip();
		assertEquals(w, 2);
	}
    
    @Test
	void testSetZip() {
		Property p = new Property ("house", 2);
		int w = p.getZip();
		assertEquals(w, 2);
	}
}
