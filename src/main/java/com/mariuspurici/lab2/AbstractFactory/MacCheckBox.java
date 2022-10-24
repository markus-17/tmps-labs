package com.mariuspurici.lab2.AbstractFactory;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("A Mac Check Box was painted");
    }
}
