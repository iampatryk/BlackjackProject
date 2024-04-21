package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DeckOfCardsAPI {

    private final String adsressURL = "https://deckofcardsapi.com/api/deck/";
    private final HttpClient client = HttpClient.newHttpClient();


    public HttpResponse getShuffledDecks(int deckCount) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(adsressURL + "new/shuffle/?deck_count=" + deckCount))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());

        return response;
    }

    public HttpResponse drawCard(String deckID, int count) throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(adsressURL + deckID +"/draw/?count=" + count))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());

        return response;
    }

    public void setHttpClient(HttpClient httpClient) {
    }
}

