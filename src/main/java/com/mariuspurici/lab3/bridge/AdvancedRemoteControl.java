package com.mariuspurici.lab3.bridge;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        this.device.setVolume(0);
    }
}