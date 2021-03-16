package pife;

import pife.Card;
import java.util.Stack;

public class Deck {
    private Stack<Card> deck = new Stack<Card>();
    private Card card = new Card();

    public Card getDeck() {
        return deck.pop();
    }

    public void setDeck(Card card) {
        this.deck.push(card);
    }

    public Card shuffle(){
        return card;
    }

    public Card deal(){
        return card;
    }
}
