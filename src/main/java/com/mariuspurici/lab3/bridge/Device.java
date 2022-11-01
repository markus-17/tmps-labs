package com.mariuspurici.lab3.bridge;

public abstract class Device {
    protected boolean enabled;
    protected int volume;
    protected int channel;

    public boolean isEnabled() {
        return enabled;
    }

    public void enable() {
        this.enabled = true;
    }

    public void disable() {
        this.enabled = false;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int percent) {
        if(0 <= volume && volume <= 100) {
            this.volume = percent;
        }
    }

    public int getChannel() {
        return this.channel;
    }

    public void setChannel(int channel) {
        if(0 <= channel && channel <= 100) {
            this.channel = channel;
        }
    }
}
