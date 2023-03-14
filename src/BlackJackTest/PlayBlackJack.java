// Erick Duran & Ivan Marin
// Lab 9a: BlackJack Part 1: BJCard
// Feb 01, 2023

package BlackJackTest;

import BlackJack.*;

public class PlayBlackJack {
	   
	// card numbers
	static final int ACE = 1;
	static final int TWO = 2;
	static final int THREE = 3;
	static final int FOUR = 4;
	static final int FIVE = 5;
	static final int SIX = 6;
	static final int SEVEN = 7;
	static final int EIGHT = 8;
	static final int NINE = 9;
	static final int TEN = 10;
    static final int JACK = 11;
    static final int KNIGHT = 12;
    static final int QUEEN = 13;
    static final int KING = 14;

    // shapes
    static final int CLUB = 1;
    static final int DIAMOND = 2;
    static final int HEART = 3;
    static final int SPADE = 4;

    
    public static void main(String[] args) {
 
    // 	Parameters for testing ....
    	
    /*	BJCard BJ = new BJCard(ACE, CLUB);
        	CardTest.run(BJ);  			*/
        	
    	DeckTest.run(new BJDeck());
    		
    }
    
}