package com.mariuspurici.lab2.AbstractFactory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("A Windows Button was painted");
    }
}
