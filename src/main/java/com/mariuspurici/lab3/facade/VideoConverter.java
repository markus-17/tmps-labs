package com.mariuspurici.lab3.facade;

public class VideoConverter {
    public VideoFile convert(String fileName, String format) {
        VideoFile videoFile = new VideoFile(fileName);
        VideoCodecConvertor convertor;
        if (format == "mp3") {
            convertor = new MPEG4CompressionCodec();
        } else {
            convertor = new OggCompressionCodec();
        }
        videoFile = convertor.convert(videoFile);
        videoFile = (new AudioMixer()).fixAudio(videoFile);
        return videoFile;
    }
}