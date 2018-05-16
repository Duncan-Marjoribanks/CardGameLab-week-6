import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList <Card>hand;
    private Card card;

    public Player(String name, ArrayList <Card> hand){
        this.name = name;
        this.hand = new ArrayList <>();
    }

    public void getCard(Card card){
        this.hand.add(card);
    }

    public int countHand(){
        return this.hand.size();
    }

    public void drawFromDeck(Deck deck){
        Card card = deck.removeCard(card);
        this.hand.add(card);
    }


}


//    public void eatFishFromRiver(River river){
//        Salmon salmon = river.removeFish();
//        belly.add(salmon);