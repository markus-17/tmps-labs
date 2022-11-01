package com.mariuspurici.lab3.adapter;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        super(0);
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }

    @Override
    public String toString() {
        return "SquarePegAdapter(radius: " + this.getRadius() + ")";
    }
}
