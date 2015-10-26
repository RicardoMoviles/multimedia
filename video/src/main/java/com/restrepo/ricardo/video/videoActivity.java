package com.restrepo.ricardo.video;

import android.widget.MediaController;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;


public class videoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        MediaController vidControl = new MediaController(this);
        VideoView videoView = (VideoView) findViewById(R.id.Vvideo);

        String vidAddress="https://ia700401.us.archive.org/19/items/ksnn_compilation_master_the_internet/ksnn_compilation_master_the_internet_512kb.mp4";
        Uri vidUri =Uri.parse(vidAddress);
        videoView.setVideoURI(vidUri);
        videoView.start();

        vidControl.setAnchorView(videoView);
        videoView.setMediaController(vidControl);
    }


}
