//import org.example.DeckOfCardsAPI;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import java.io.IOException;
//import java.net.http.HttpClient;
//import java.net.http.HttpResponse;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//@ExtendWith(MockitoExtension.class)
//public class TestDeckOfCardsAPI {
//
//    @Mock
//    private DeckOfCardsAPI deckOfCardsAPI;
//    @Mock
//    private HttpClient httpClient;
//    @Mock
//    private HttpResponse<String> httpResponse;
//
//    @BeforeEach
//    public void setup() {
//        deckOfCardsAPI = new DeckOfCardsAPI();
//        deckOfCardsAPI.setHttpClient(httpClient);
//    }
//
//    @Test
//    public void getShuffledDecksTest() throws IOException, InterruptedException {
//        when(httpResponse.statusCode()).thenReturn(200);
//        when(httpResponse.body()).thenReturn("response body");
//        when(httpClient.send(Mockito.any(), Mockito.any())).thenReturn(httpResponse);
//
//        HttpResponse<String> response = deckOfCardsAPI.getShuffledDecks(1);
//
//        assertEquals(200, response.statusCode());
//        assertEquals("response body", response.body());
//    }
//
//    @Test
//    public void testDrawCard() throws IOException, InterruptedException {
//        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
//        when(httpResponse.statusCode()).thenReturn(200);
//        when(httpResponse.body()).thenReturn("response body");
//        when(httpClient.send(Mockito.any(), Mockito.any())).thenReturn(httpResponse);
//
//        HttpResponse response = deckOfCardsAPI.drawCard("deckID", 1);
//
//        assertEquals(200, response.statusCode());
//        assertEquals("response body", response.body());
//    }
//
//}
