package com.abhishek.questions.corejava.vendingmachine.service;

import com.abhishek.questions.corejava.vendingmachine.util.Bucket;
import com.abhishek.questions.corejava.vendingmachine.util.Coin;
import com.abhishek.questions.corejava.vendingmachine.util.Item;

import java.util.List;

/** * Decleare public API for Vending Machine * @author Javin Paul */

public interface VendingMachine {

    long selectItemAndGetPrice(Item item);
    void insertCoin(Coin coin);
    List<Coin> refund();
    Bucket<Item, List<Coin>> collectItemAndChange();
    void reset();
}
