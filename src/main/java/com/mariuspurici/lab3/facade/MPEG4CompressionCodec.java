package com.mariuspurici.lab3.facade;

public class MPEG4CompressionCodec implements VideoCodecConvertor {
    @Override
    public VideoFile convert(VideoFile videoFile) {
        System.out.println(videoFile + " was converted to MPEG4.");
        return videoFile;
    }
}