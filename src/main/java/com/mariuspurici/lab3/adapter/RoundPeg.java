package com.mariuspurici.lab3.adapter;

public class RoundPeg {
    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "RoundPeg(radius: " + this.getRadius() + ")";
    }
}
