// Erick Duran & Ivan Marin
// Lab 9a: BlackJack Part 1: BJCard
// Mar 01, 2023

package S2.BJ.BlackJack;

import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;

public class BJCardTest {

	@Test
	public void testGetRank() {
		BJCard bj = new BJCard(2, 2);
		assertEquals(bj.getRank(), 2);
	}

	@Test
	public void testSetRank() {
		BJCard bj = new BJCard(2, 2);
		bj.setRank(3);
		assertEquals(bj.getRank(), 3);
	}

	@Test
	public void testGetSuit() {
		BJCard bj = new BJCard(2, 2);
		assertEquals(bj.getSuit(), 2);
	}

	@Test
	public void testSetSuit() {
		BJCard bj = new BJCard(2, 2);
		bj.setSuit(4);
		assertEquals(bj.getSuit(), 4);
	}

	@Test
	public void testHideCard() {
		BJCard bj = new BJCard(2, 2);
		bj.hideCard();
		assertEquals(bj.isHidden(), true);
	}

	@Test
	public void testShowCard() {
		BJCard bj = new BJCard(2, 2);
		bj.showCard();
		assertEquals(bj.isHidden(), false);
	}

	@Test
	public void testIsHidden() {
		BJCard bj = new BJCard(2, 2);
		bj.showCard();
		assertEquals(bj.isHidden(), false);
	}

	@Test
	public void testGetText() {
		BJCard bj = new BJCard(2, 2);
		assertEquals(bj.getText(), "2\u2665");
	}

	@Test
	public void testGetFontColor() {
		BJCard bj = new BJCard(2, 2);
		assertEquals(bj.getFontColor(), Color.RED);
	}
}
