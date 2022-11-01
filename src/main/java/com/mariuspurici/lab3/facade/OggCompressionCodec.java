package com.mariuspurici.lab3.facade;

public class OggCompressionCodec implements VideoCodecConvertor {
    @Override
    public VideoFile convert(VideoFile videoFile) {
        System.out.println(videoFile + " was converted to Ogg.");
        return videoFile;
    }
}