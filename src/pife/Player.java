package pife;

import pife.*;
import java.util.*;

public class Player {
    private List<Card> hand = new ArrayList<Card>();

    public void printHand() {
        for (int i = 0; i < 9; i++) {
            System.out.println("Numero da carta "+hand.get(i).getNumber()+
                    " Nipe da carta: "+hand.get(i).getSuit());
        }
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    public void addCard (Card card){
        if(hand.size() < 9)
            this.hand.add(card);
    }

    public Card discard(int index){
        Card card = hand.get(index);
        hand.remove(index);
        return card;
    }

}