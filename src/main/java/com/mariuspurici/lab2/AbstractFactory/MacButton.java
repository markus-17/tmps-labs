package com.mariuspurici.lab2.AbstractFactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("A Mac Button was painted");
    }
}
