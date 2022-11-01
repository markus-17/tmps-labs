package com.mariuspurici.lab3.composite;

import scala.Console;

public class Circle extends Dot {
    protected double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return Console.MAGENTA() + "Circle(x: " + this.x + ", y: " + this.y + ", radius: " + this.radius + ")" + Console.RESET();
    }
}