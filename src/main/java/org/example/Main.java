package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        DeckOfCardsAPI deckOfCardsAPI = new DeckOfCardsAPI();
        deckOfCardsAPI.getShuffledDecks(4);
    }
}