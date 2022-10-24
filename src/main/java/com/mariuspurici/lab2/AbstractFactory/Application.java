package com.mariuspurici.lab2.AbstractFactory;

public class Application {
    private GUIFactory factory;
    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint() {
        this.button.paint();
        this.checkBox.paint();
    }
}
