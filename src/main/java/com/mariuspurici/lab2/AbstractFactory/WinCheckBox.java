package com.mariuspurici.lab2.AbstractFactory;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("A Windows Check Box was painted");
    }
}
