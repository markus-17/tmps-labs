package com.mariuspurici.lab3.adapter;

public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    @Override
    public String toString() {
        return "SquarePeg(width: " + this.getWidth() + ")";
    }
}
