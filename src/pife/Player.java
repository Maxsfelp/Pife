package pife;

import pife.*;
import java.util.*;

public class Player {
    private List<Card> hand = new ArrayList<Card>();

    public Card getHand(int index) {
        return hand.get(index);
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void discard(int index){

    }

    public void pick(){

    }
}