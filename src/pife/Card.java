package pife;

public class Card{
    private int number = 0;
    private String suit = null;
    private int color_back = 0;

    public int getNumber() {
        return number;
    }
    public String getSuit() {
        return this.suit;
    }
    public int getColor_back() {
        return color_back;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setSuit(int suit) {
        switch (suit){
            case 0:
                this.suit = "clubs";
                break;
            case 1:
                this.suit = "diamonds";
                break;
            case 2:
                this.suit = "hearts";
                break;
            case 3:
                this.suit = "spades";
                break;
            default:
                break;
        }
    }
    public void setColor_back(int color_back) {
        this.color_back = color_back;
    }
}
