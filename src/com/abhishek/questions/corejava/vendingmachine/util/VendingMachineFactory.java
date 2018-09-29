package com.abhishek.questions.corejava.vendingmachine.util;

import com.abhishek.questions.corejava.vendingmachine.impl.VendingMachineImpl;
import com.abhishek.questions.corejava.vendingmachine.service.VendingMachine;

/**
 * Factory class to create instance of Vending Machine, this can be extended to create instance of
 * different types of vending machines.
 * @author Javin Paul
 */

public class VendingMachineFactory {
    public static VendingMachine createVendingMachine() {
        return new VendingMachineImpl();
    }
}