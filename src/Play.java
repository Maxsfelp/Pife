import java.util.Scanner;
import pife.*;

class Play {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Deck deck = new Deck();

        player1.setHand(deck.deal());
        player2.setHand(deck.deal());
    }
}
