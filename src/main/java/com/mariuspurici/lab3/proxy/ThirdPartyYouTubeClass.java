package com.mariuspurici.lab3.proxy;

import scala.Console;

import java.util.LinkedList;
import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {
    private static Video[] dummyVideos = {
            new Video(new VideoInfo("Funny Cats", "Video Compilation of Funny Cats moments")),
            new Video(new VideoInfo("Funny Dogs", "Video Compilation of Funny Dogs moments")),
            new Video(new VideoInfo("Learn Docker in 1hr", "Learn how to install and use Docker in 1hr")),
            new Video(new VideoInfo("Why do you need Kubernetes?", "Video that explains the use of Kubernetes in 15minutes")),
            new Video(new VideoInfo("Best AWS certifications in 2022", "Learn about the best certifications that will make a better aws developer"))
    };

    @Override
    public List<VideoInfo> listVideos() {
        // This method would supposedly send an API request to YouTube which would take some time
        List<VideoInfo> videoInfo = new LinkedList<VideoInfo>();
        for (Video video : dummyVideos) {
            videoInfo.add(video.videoInfo.clone());
        }
        System.out.println(Console.BLUE() + "listVideos() method of ThirdPartyYouTubeClass called" + Console.RESET());
        return videoInfo;
    }

    @Override
    public VideoInfo getVideoInfo(int id) {
        if (id >= dummyVideos.length) return null;
        System.out.println(Console.BLUE() + "getVideoInfo() method of ThirdPartyYouTubeClass called" + Console.RESET());
        return dummyVideos[id].videoInfo.clone();
    }

    @Override
    public Video downloadVideo(int id) {
        if (id >= dummyVideos.length) return null;
        System.out.println(Console.BLUE() + "downloadVideo() method of ThirdPartyYouTubeClass called" + Console.RESET());
        return dummyVideos[id].clone();
    }
}
