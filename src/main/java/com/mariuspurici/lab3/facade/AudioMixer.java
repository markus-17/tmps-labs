package com.mariuspurici.lab3.facade;

public class AudioMixer {
    public VideoFile fixAudio(VideoFile videoFile) {
        System.out.println(videoFile + " audio was fixed by AudioMixer");
        return videoFile;
    }
}