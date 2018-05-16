import java.util.ArrayList;
import java.util.Collections;

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

    public void emptyDeck(){
        this.deck.clear();
    }

    public void populateFully(){
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card card = new Card(suit, rank);
                this.deck.add(card);
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(this.deck);
    }


}
