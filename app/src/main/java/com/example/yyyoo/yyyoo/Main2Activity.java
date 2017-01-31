package com.example.yyyoo.yyyoo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String video_path = "https://www.youtube.com/watch?v=m0jyqB_t2B4";
        Uri uri = Uri.parse(video_path);

        // With this line the Youtube application, if installed, will launch immediately.
        // Without it you will be prompted with a list of the application to choose.
        uri = Uri.parse("vnd.youtube:"  + uri.getQueryParameter("v"));

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }



}
