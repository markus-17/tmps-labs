package com.mariuspurici.lab3.proxy;

public class Video implements Cloneable {
    public VideoInfo videoInfo;
    public byte[] content;

    public Video(VideoInfo videoInfo) {
        this(videoInfo, new byte[] {});
    }

    private Video(VideoInfo videoInfo, byte[] content) {
        this.videoInfo = videoInfo;
        this.content = content;
    }

    @Override
    public Video clone() {
        return new Video(this.videoInfo.clone());
    }

    @Override
    public String toString() {
        return "VideoInfo(" + this.videoInfo.name + ", " + this.videoInfo.description + ")";
    }
}
