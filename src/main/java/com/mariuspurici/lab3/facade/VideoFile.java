package com.mariuspurici.lab3.facade;

public class VideoFile {
    private String fileName;

    public VideoFile(String fileName) {
        this.fileName = fileName;
        System.out.println(this + " was created");
    }

    @Override
    public String toString() {
        return "VideoFile(fileName:" + this.fileName + ")";
    }
}
