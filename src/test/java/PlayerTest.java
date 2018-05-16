import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    String name;
    ArrayList <Card> hand;
    Card card;
    Deck deck;


    @Before
    public void before(){
        player = new Player("Steve", hand);
    }


    @Test
    public void canGetCard(){
        player.getCard(card);
        assertEquals(1, player.countHand());
    }

    @Test
    public void canDrawCardFromDeck(){
        player.drawFromDeck(deck);
        assertEquals(1, player.countHand());
    }

}
