package org.example.structural.proxy;

import java.util.HashMap;
import java.util.Map;

// This class plays the role of a proxy , where some action before or after reaching the original object can be taken;

public class ProxyVideoDownloader implements VideoDownloader{

    private Map<String , Video> cache = new HashMap<>();
    private VideoDownloader videoDownloader = new VideoDownloaderImpl();
    @Override
    public Video getVideo(String videoName) {
        if (!cache.containsKey(videoName)){
            cache.put( videoName,videoDownloader.getVideo(videoName));
        }
        return cache.get(videoName);
    }
}
