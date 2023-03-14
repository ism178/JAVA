package RealEstate;

public class CondoTest{
    @Test
	void testGetFloor() {
		Condo p = new Condo ("chocolate", 2, 2,2,2,2);
		int w = p.getFloorLvl();
		assertEquals(w, 2);
	}

    @Test
	void testSetFloor() {
		Condo p = new Condo ("chocolate", 2, 2,2,2,2);
		int w = p.getFloorLvl();
		assertEquals(w, 2);
	}


}

