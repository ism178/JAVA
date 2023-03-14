package RealEstate;

public class ResidentialTest {
    @Test
	void testGetBedCount() {
		Residential p = new Residential ("house", 2,2,2,2);
		int w = p.getBedCount();
		assertEquals(w, 2);
	}
    @Test
	void testGetBathCount() {
		Residential p = new Residential ("house", 2,2,2,2);
		int w = p.getBathCount();
		assertEquals(w, 2);
	}
    @Test
	void testGetSqFootage() {
		Residential p = new Residential ("house", 2,2,2,2);
		int w = p.getSqFootage();
		assertEquals(w, 2);
	}

    @Test
	void testSetBedCount() {
		Residential p = new Residential ("house", 2,2,2,2);
		int w = p.getBedCount();
		assertEquals(w, 2);
	}
    @Test
	void testSetBathCount() {
		Residential p = new Residential ("house", 2,2,2,2);
		int w = p.getBathCount();
		assertEquals(w, 2);
	}
    @Test
	void testSetSqFootage() {
		Residential p = new Residential ("house", 2,2,2,2);
		int w = p.getSqFootage();
		assertEquals(w, 2);
	}



}
