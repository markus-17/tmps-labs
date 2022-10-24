package com.mariuspurici.lab2.FactoryMethod;

public abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.click();
        button.render();
    }
}
