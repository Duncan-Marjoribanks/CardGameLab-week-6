import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        ArrayList<Card> cards = new ArrayList <>();
        cards.add(card);
        deck = new Deck(cards);
    }

    @Test
    public void canCountEntries(){
        assertEquals(1, deck.count());
    }

    @Test
    public void canAddCard(){
        deck.addCard(card);
        assertEquals(2, deck.count());
    }

    @Test
    public void canRemoveCard(){
        deck.removeCard(card);
        assertEquals(0, deck.count());
    }

    @Test
    public void canEmptyDeck(){
        deck.emptyDeck();
        assertEquals(0, deck.count());
    }

    @Test
    public void canPopulateFullDeckOfCards(){
        deck.emptyDeck();
        deck.populateFully();
        assertEquals(52, deck.count());
    }

}
