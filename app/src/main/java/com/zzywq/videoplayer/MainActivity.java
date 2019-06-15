package com.zzywq.videoplayer;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import java.io.File;

public class MainActivity extends Activity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView)findViewById(R.id.videoView);
        Uri fileUri = Uri.fromFile(new
                File(Environment.getExternalStorageDirectory().getAbsolutePath()+ "/test.mp4"));

        //String path = Environment.getExternalStorageDirectory().getAbsolutePath()+"/test.mp4";
        /**
         * 本地视频播放
       */
        videoView.setVideoURI(fileUri);
        /**
         * 网络播放
         */
        //videoView.setVideoURI(Uri.parse(""));


        MediaController controller = new MediaController(this);
        /**
         * 设置videoview与mediacontroller关联
         */
        videoView.setMediaController(controller);
        /**
         * 设置mediacontrollerw与videoview关联
         */
        controller.setMediaPlayer(videoView);

    }
}
