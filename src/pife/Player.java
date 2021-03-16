package pife;
import pife.*;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<Card>();

    public Card getHand(int index) {
        return hand.get(index);
    }

    public void setHand(Card card) {
        this.hand.add(card);
    }

    public void discard(){

    }

    public void pick(){

    }
}