package com.mariuspurici.lab3.proxy;

public class VideoInfo implements Cloneable {
    public String name;
    public String description;

    public VideoInfo(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public VideoInfo clone() {
        return new VideoInfo(this.name, this.description);
    }

    @Override
    public String toString() {
        return "VideoInfo(" + this.name + ", " + this.description + ")";
    }
}
