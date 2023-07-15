package org.example.structural.proxy;

public class Main {
    public static void main(String[] args) {
        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("funnyDogs");
        videoDownloader.getVideo("funnyDogs");
        videoDownloader.getVideo("funnyCats");
        videoDownloader.getVideo("funnyCats");
        videoDownloader.getVideo("funnyPeople");
        videoDownloader.getVideo("funnyPeople");
    }
}
