import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> deck;

    public Deck(ArrayList<Card>deck){

        this.deck = deck;
    }

    public int count() {
        return this.deck.size();
    }

    public void addCard(Card card){
        this.deck.add(card);
    }

    public void removeCard(Card card){
        this.deck.remove(card);
    }
}
