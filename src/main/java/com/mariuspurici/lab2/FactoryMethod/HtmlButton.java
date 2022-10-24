package com.mariuspurici.lab2.FactoryMethod;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("The HTML Button was rendered");
    }

    @Override
    public void click() {
        System.out.println("The HTML Button was clicked");
    }
}
