package com.mariuspurici.lab3.bridge;

public class Radio extends Device {
    public Radio() {
        this.enabled = false;
        this.volume = 50;
        this.channel = 17;
    }

    @Override
    public String toString() {
        return "Radio(" + "enabled: " + this.enabled + ", volume: " + this.volume + ", channel: " + this.channel + ")";
    }
}