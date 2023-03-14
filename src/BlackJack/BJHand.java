// Erick Duran & Ivan Marin
// Lab 10a: BlackJack, Part 3—BJHand
// Mar 11, 2023

package BlackJack;

import java.util.ArrayList;
import BlackJackBase.PCard;
import BlackJackBase.PHand;

public class BJHand implements PHand {
    ArrayList<PCard> hand;

    public BJHand() {
        hand = new ArrayList<PCard>();
    }
    
    // Overrides from PHand
    @Override
    public int getSize() {
        return hand.size();
    }

    @Override
    public void addCard(PCard card) {
        hand.add(card);
    }

    @Override
    public PCard getCard(int index) {
       return hand.get(index);
    }

    @Override
    public PCard removeCard(int index) {
        return hand.remove(index);
    }

    @Override
    public int getValue() {
    	// "Score" is accumulated when a card is added to the array
    	// "cardNum" is the value by current card 
        int score = 0;
        int cardNum = 0;
        boolean ace = false;
        
        // System.out.println("Size : " + hand.size());
        
        for(int i = 0; i < hand.size(); i++) {
            cardNum = ((BJCard)hand.get(i)).getRank();
        //  System.out.println("cardNum : " + cardNum);
                        
            if(cardNum > 9) cardNum = 10;
            else if(cardNum == 1) ace = true;
            score += cardNum;
            
        } // end of for loop

        if(ace && score + 10 <= 21) score += 10;
        // System.out.println("Score : " + score);

        return score;
    }
}
