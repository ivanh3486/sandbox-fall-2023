package org.example;

public interface Deck {

    void cut(int index);
    Card deal();
    void newOrder(Deck deck);
    int search(Card deck);
    void shuffle();
    int size();
    Card turnOver();
}
