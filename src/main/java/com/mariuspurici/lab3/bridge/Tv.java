package com.mariuspurici.lab3.bridge;

public class Tv extends Device {
    public Tv() {
        this.enabled = false;
        this.volume = 50;
        this.channel = 17;
    }

    @Override
    public String toString() {
        return "Tv(" + "enabled: " + this.enabled + ", volume: " + this.volume + ", channel: " + this.channel + ")";
    }
}