// Erick Duran & Ivan Marin
// Lab 9a: BlackJack Part 1: BJCard
// Mar 01, 2023

package BlackJack;

import java.awt.Color;

import BlackJackBase.PCard;

public class BJCard extends PCard {
	
    private int rank;
    private int suit;
    private boolean hidden;

    // card numbers
    public static final int ACE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int JACK = 11;
    public static final int KNIGHT = 12;
    public static final int QUEEN = 13;
    public static final int KING = 14;

    // shapes
    public static final int SPADE = 1;
    public static final int HEART = 2;
    public static final int DIAMOND = 3;
    public static final int CLUB = 4;

    
    // constructor
    public BJCard(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
        this.hidden = false;
    }

    // methods
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    @Override
    public String getText() {
        String rank = "", suit = "";
        
             if (this.rank == JACK) 	rank = "J";
        else if (this.rank == KNIGHT) 	rank = "Kn";
        else if (this.rank == QUEEN) 	rank = "Q";
        else if (this.rank == KING) 	rank = "K";
        else rank = String.valueOf(this.rank);

             if (this.suit == SPADE) 	suit = "\u2660";
        else if (this.suit == HEART) 	suit = "\u2665";
        else if (this.suit == DIAMOND) 	suit = "\u2666";
        else suit = "\u2663";
        
        return String.format("%s%s", rank, suit);
    }

    
    //Overrides from PCard
    @Override
    public void hideCard() {
        this.hidden = true;
    }

    @Override
    public void showCard() {
        this.hidden = false;
    }

    @Override
    public boolean isHidden() {
        return this.hidden;
    }
	
    @Override
    public Color getFontColor() {
        if (this.suit == HEART || this.suit == DIAMOND) return Color.RED;
        else return Color.BLACK;
    }
    
    @Override
	public Color getBorderColor() {
		return Color.LIGHT_GRAY;
	}

	/** Returns the color of the cards background. */
	public Color getBackColor() {
		return Color.GREEN;
	}
	
}

