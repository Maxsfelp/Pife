package pife;

import pife.Card;
import java.util.*;

public class Deck {
    private List<Card> deck = new ArrayList<Card>();
    private int numCards;

    public Deck(){
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                Card card = new Card();
                card.setNumber(j);
                card.setSuit(i);
                card.setColor_back(1);
                setDeck(card);
                card.setColor_back(2);
                setDeck(card);
            }
        }
        shuffle();
        setNumCards(deck.size());
    }

    public Card getDeck() {
        Card card = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        setNumCards(deck.size());
        return card;
    }
    public int getNumCards() {
        return numCards;
    }

    public void setDeck(Card card) {
        this.deck.add(card);
    }
    public void setNumCards(int numCards) {
        this.numCards = numCards;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public List<Card> deal(){
        List<Card> hand = new ArrayList<Card>();
        for (int i = 0; i < 9; i++) {
            hand.add(getDeck());
        }
        return hand;
    }
}
