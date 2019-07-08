package com.chikong.ndkdemo;

/**
 * Created by Chikong on 2019/7/6.
 */
public class FFmpegRun {

    static {
//        System.loadLibrary("ffmpeg-run");
        System.loadLibrary("avcodec");
        System.loadLibrary("avdevice");
        System.loadLibrary("avfilter");
        System.loadLibrary("avformat");
        System.loadLibrary("avutil");
        System.loadLibrary("ffmpeg");
        System.loadLibrary("swresample");
        System.loadLibrary("swscale");

    }

    public native void run(String[] commands);

}
