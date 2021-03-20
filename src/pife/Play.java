package pife;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import pife.*;

class Play {
    public static Scanner entrada = new Scanner( System.in );
    public static Player player1 = new Player();
    public static Player player2 = new Player();
    public static Deck deck = new Deck();
    public static Stack<Card> trash = new Stack<Card>();

    public static void end_game(List<Card> hand){
        System.out.println("This metod is not declarated");
    }

    public static void action(int opt, Player player, Card card){
        int indice = 0;
        switch (opt){
            case 1:
                System.out.println("What card in your hand you dicart?");
                player.printHand();
                indice = entrada.nextInt();
                trash.push(player.discard(indice));
                player.addCard(card);
                break;
            case 2:
                Card cardTrash = null;
                System.out.println("What card in your hand you dicart?");
                player.printHand();
                cardTrash = trash.pop();
                indice = entrada.nextInt();
                trash.push(player.discard(indice));
                player.addCard(cardTrash);
                break;
            case 3:
                trash.push(card);
                break;
            case 4:
                end_game(player.getHand());
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        Card card = null;
        Card joker = null;
        int option = 0;

        player1.setHand(deck.deal());
        player2.setHand(deck.deal());
        joker = deck.getDeck();
        System.out.println("Joker is: "+joker);

        //Player 1 action
        card = deck.getDeck();
        System.out.print("Card trash: ");
        System.out.println((trash.empty()) ? "No cards" : "Card Number: "+trash.peek().getNumber()+" Card Suit: "+trash.peek().getSuit());
        System.out.print("Card deck: ");
        System.out.println("Card Number: "+card.getNumber()+" Card Suit: "+card.getSuit());
        System.out.println("Player 1 Pick? ");
        System.out.print("1 - Deck 2 - Trash 3 - No  4 - End ");
        option = entrada.nextInt();
        action(option, player1, card);

        //Player 2 action
        card = deck.getDeck();
        System.out.print("Card trash: ");
        System.out.println((trash.empty()) ? "No cards" : ("Card Number: "+trash.peek().getNumber()+" Card Suit: "+trash.peek().getSuit()));
        System.out.print("Card deck: ");
        System.out.println("Card Number: "+card.getNumber()+" Card Suit: "+card.getSuit());
        System.out.println("Player 2 Pick? ");
        System.out.print("1 - Deck 2 - Trash 3 - No 4 - End ");
        option = entrada.nextInt();
        action(option, player2, card);
    }
}