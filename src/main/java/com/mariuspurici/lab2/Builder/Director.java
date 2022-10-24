package com.mariuspurici.lab2.Builder;

public class Director {
    public static void constructCar(Builder builder) {
        builder.reset();
        builder.setSeats();
        builder.setEngine();
        builder.setTripComputer();
        builder.setGPS();
    }
}
