package com.example.phone_ring;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

import java.io.IOException;

public class MyActivity extends Activity {
    final MediaPlayer mp = new MediaPlayer();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);

        //WebView wv = (WebView) findViewById(R.id.webView1);
        //wv.loadUrl("file:///android_asset/70.gif");

        //Intent serviceIntent = new Intent(this, Float.class);
        //startService(serviceIntent);

        //path = Uri.parse("android.resource://com.example.phone_ring/" + R.raw.foo);
        //Uri path = Uri.parse("android.resource://com.example.phone_ring/raw/foo");
        //RingtoneManager.setActualDefaultRingtoneUri(this, RingtoneManager.TYPE_RINGTONE, path);

        Toast toast = Toast.makeText(this, "Started",Toast.LENGTH_SHORT);
        toast.show();

    }
}
