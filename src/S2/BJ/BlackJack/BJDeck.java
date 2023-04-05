// Erick Duran & Ivan Marin
// Lab 9b: BlackJack, Part 2�BJDeck
// Mar 04, 2023

package S2.BJ.BlackJack;

import java.util.*;

import S2.BJ.BlackJackBase.PCard;
import S2.BJ.BlackJackBase.PHand;

public class BJDeck implements PHand {
    private ArrayList<BJCard> cards = new ArrayList<BJCard>();
    
    public BJDeck() {
        for(int i = 1; i < 15; i++)
            for(int j = 1; j < 5; j++)
                cards.add(new BJCard(i, j));
    }  


    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

    @Override
    public void addCard(PCard card) {
        cards.add((BJCard) card);
    }

    @Override
    public PCard dealCard() {
        return cards.remove(cards.size()-1);
    }

    @Override
    public PCard dealHiddenCard() {
        if(cards.size() != 0) {
            PCard pc = cards.remove(cards.size()-1);
            pc.hideCard();
            return pc;
        } else return null;
    }

    @Override
    public int cardCount() {
        return cards.size();
    }
}
