package com.mariuspurici.lab3.proxy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {
    private ThirdPartyYouTubeClass service;
    private List<VideoInfo> cachedVideoInfoList;
    private Map<Integer, VideoInfo> cachedVideoInfo;
    private Map<Integer, Video> cachedVideo;
    private boolean needReset;

    public CachedYouTubeClass(ThirdPartyYouTubeClass service) {
        this.service = service;
        this.cachedVideoInfoList = null;
        this.cachedVideoInfo = new HashMap<Integer, VideoInfo>();
        this.cachedVideo = new HashMap<Integer, Video>();
        this.needReset = false;
    }

    public void reset() {
        this.needReset = true;
    }

    @Override
    public List<VideoInfo> listVideos() {
        if(this.cachedVideoInfoList == null || needReset) {
            this.cachedVideoInfoList = service.listVideos();
            needReset = false;
        }
        return this.cachedVideoInfoList;
    }

    @Override
    public VideoInfo getVideoInfo(int id) {
        if(!this.cachedVideoInfo.containsKey(id) || needReset) {
            this.cachedVideoInfo.put(id, service.getVideoInfo(id));
            needReset = false;
        }
        return this.cachedVideoInfo.get(id);
    }

    @Override
    public Video downloadVideo(int id) {
        if(!this.cachedVideo.containsKey(id) || needReset) {
            this.cachedVideo.put(id, service.downloadVideo(id));
            needReset = false;
        }
        return this.cachedVideo.get(id);
    }
}
