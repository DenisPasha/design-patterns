package org.example.structural.proxy;

public class VideoDownloaderImpl implements VideoDownloader{
    @Override
    public Video getVideo(String videoName) {
        System.out.println("Connection to youtube.com");
        System.out.println("Downloading video "+ videoName);
        return new Video(videoName);
    }
}
