package com.mariuspurici.lab2.Builder;

public class SportsCarBuilder implements Builder{
    private Car car;

    public SportsCarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats() {
        this.car.seats = 2;
    }

    @Override
    public void setEngine() {
        this.car.engine = "Sports Car Engine";
    }

    @Override
    public void setTripComputer() {
        this.car.tripComputer = "Sports Car Trip Computer";
    }

    @Override
    public void setGPS() {
        this.car.GPS = "Sports Car GPS";
    }

    public Car getProduct() {
        Car car = this.car;
        this.reset();
        return car;
    }
}
