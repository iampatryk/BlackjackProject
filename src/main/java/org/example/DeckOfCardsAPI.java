package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DeckOfCardsAPI {

    private final String adsressURL = "https://deckofcardsapi.com/api/deck/";

    public void getShuffledDecks(int deckCount) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(adsressURL + "new/shuffle/?deck_count=" + deckCount))
                .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}


/*
getShuffledDecks → which asks for shuffled decks, amount of which is determined
by the parameter. What is returned is the HttpResponse;

drawCards → using deck ID and count parameter which is responsible
for amount of cards to be drawn return HttpResponse.
 */