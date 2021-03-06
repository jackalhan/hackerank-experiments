package com.hackerrank.test.patterns.elemaninTeki.proxy_design_pattern;

/**
 * Created by jackalhan on 2/11/17.
 */
public class NoCash implements ATMState {
    ATMMachine atmMachine;

    public NoCash(ATMMachine newAtmMachine) {
        atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We do not have money");
    }

    @Override
    public void ejectCard() {
        System.out.println("We do not have money. You did not enter a card.");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("We do not have money.");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("We do not have money.");
    }
}
