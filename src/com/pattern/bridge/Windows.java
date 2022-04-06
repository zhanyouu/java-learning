package com.pattern.bridge;

/**
 * 扩展抽象化角色(windows操作系统)
 */
public class Windows extends OperatingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
