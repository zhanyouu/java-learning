package com.pattern.bridge;

/**
 * Mac操作系统(扩展抽象化角色)
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
