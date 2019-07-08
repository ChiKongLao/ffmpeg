package com.chikong.ndkdemo;

import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

/**
 * Created by Chikong on 2019/7/6.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        findViewById(R.id.textview).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Toast.makeText(MainActivity.this,"thread",Toast.LENGTH_LONG).show();

                        String path = Environment.getExternalStorageDirectory().toString() + "/.41";
                        File file = new File(path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String path1 = path+"/2.mp4";
                        String path2 = path+"/2.aac";
                        Log.e("test",path1);
                        Log.e("test",path2);
                        new FFmpegRun().run(extractAudio(path1,path2));
//                        new FFmpegRun().run(test(path1));

//                    }
//                }).start();
            }
        });

        findViewById(R.id.fab).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"asfjsljf",Toast.LENGTH_LONG).show();
            }
        });

    }

    /**
     * 提取单独的音频
     *
     * @param videoUrl
     * @param outUrl
     * @return
     */
    public static String[] extractAudio(String videoUrl, String outUrl) {
        String[] commands = new String[8];
        commands[0] = "ffmpeg";
        commands[1] = "-i";
        commands[2] = videoUrl;
        commands[3] = "-acodec";
        commands[4] = "copy";
        commands[5] = "-vn";
        commands[6] = "-y";
        commands[7] = outUrl;
        return commands;
    }
    public static String[] test(String videoUrl) {
        String[] commands = new String[3];
        commands[0] = "ffmpeg";
        commands[1] = "-i";
        commands[2] = videoUrl;
        return commands;
    }
}
