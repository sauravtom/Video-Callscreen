package com.example.phone_ring;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebView;

/**
 * Created by sauravtom on 8/7/14.
 */
public class Call extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
        getWindow().addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        getWindow().addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        setContentView(R.layout.main);

        WebView wv = (WebView) findViewById(R.id.webView1);
        wv.loadUrl("file:///android_asset/70.gif");
    }

}

