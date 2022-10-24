package com.mariuspurici.lab2.Builder;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats() {
        this.car.seats = 4;
    }

    @Override
    public void setEngine() {
        this.car.engine = "Normal Car Engine";
    }

    @Override
    public void setTripComputer() {
        this.car.tripComputer = "Normal Car Trip Computer";
    }

    @Override
    public void setGPS() {
        this.car.GPS = "Normal Car GPS";
    }

    public Car getProduct() {
        Car car = this.car;
        this.reset();
        return car;
    }
}
