import org.example.DeckOfCardsAPI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.http.HttpResponse;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsDeckOfCardAPI {

    private final DeckOfCardsAPI deckOfCardsAPI = new DeckOfCardsAPI();

    @Test
    public void getShuffledDecksTest() throws IOException, InterruptedException {

        int deckCount = 2;
        HttpResponse response = deckOfCardsAPI.getShuffledDecks(deckCount);

        Assertions.assertNotNull(response);
        assertEquals(200, response.statusCode());
        Assertions.assertNotNull(response.body());
        assertEquals(2,2);


    }

    @Test
    public void drawCardTest() throws IOException, InterruptedException {
        String deckID = "new";
        int count = 2;
//        HttpResponse response = deckOfCardsAPI.drawCard("new", 2);
        HttpResponse response = deckOfCardsAPI.drawCard(deckID,count);

        Assertions.assertNotNull(response);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertNotNull(response.body());
//        Assertions.assertEquals(response,deckOfCardsAPI.drawCard(deckID, count));


    }

}
