package com.mariuspurici.lab3.proxy;

import java.util.List;

public interface ThirdPartyYouTubeLib {
    public List<VideoInfo> listVideos();

    public VideoInfo getVideoInfo(int id);

    public Video downloadVideo(int id);
}
