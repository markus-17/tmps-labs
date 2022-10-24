package com.mariuspurici.lab2.Builder;

public class Car {
    public int seats;
    public String engine;
    public String tripComputer;
    public String GPS;

    @Override
    public String toString() {
        return "Car(" + this.seats + " seats, " + this.engine + ", " + tripComputer + ", " + this.GPS + ")";
    }
}
