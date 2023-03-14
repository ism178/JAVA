package RealEstate;

public class HouseTest {
    
    @Test
	void testGetYardAcres() {
		House p = new House ("house", 2, 2,2,2,2);
		int w = p.getYardAcres();
		assertEquals(w, 2);
	}

    @Test
	void testSetFloor() {
		House p = new House ("house", 2, 2,2,2,2);
		int w = p.getYardAcres();
		assertEquals(w, 2);
	}

}
