package com.mariuspurici.lab2.FactoryMethod;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("The Windows Button was rendered");
    }

    @Override
    public void click() {
        System.out.println("The Windows Button was clicked");
    }
}
