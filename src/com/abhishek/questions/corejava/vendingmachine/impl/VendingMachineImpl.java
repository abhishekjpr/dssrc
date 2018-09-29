package com.abhishek.questions.corejava.vendingmachine.impl;

import com.abhishek.questions.corejava.vendingmachine.service.VendingMachine;
import com.abhishek.questions.corejava.vendingmachine.util.Bucket;
import com.abhishek.questions.corejava.vendingmachine.util.Coin;
import com.abhishek.questions.corejava.vendingmachine.util.Item;

import java.util.List;

public class VendingMachineImpl implements VendingMachine {
    @Override
    public long selectItemAndGetPrice(Item item) {
        return 0;
    }

    @Override
    public void insertCoin(Coin coin) {

    }

    @Override
    public List<Coin> refund() {
        return null;
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        return null;
    }

    @Override
    public void reset() {

    }
}
