package com.mariuspurici.lab3.composite;

import scala.Console;

public class Dot implements Graphic {
    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println(this + " has been drawn.");
    }

    @Override
    public String toString() {
        return Console.RED() + "Dot(x: " + this.x + ", y: " + this.y + ")" + Console.RESET();
    }
}