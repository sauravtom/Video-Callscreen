package com.example.phone_ring;

import android.app.Service;
import android.content.Intent;
import android.graphics.PixelFormat;
import android.os.IBinder;
import android.view.Gravity;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;

/**
 * Created by sauravtom on 15/7/14.
 */
public class Float extends Service {
    public WindowManager windowManager;
    public WebView chathead;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);

        chathead = new WebView(this);
        chathead.loadUrl("file:///android_asset/71.gif");

        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_PHONE,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);

        params.gravity = Gravity.TOP | Gravity.LEFT;
        params.x = 100;
        params.y = 160;

        windowManager.addView(chathead, params);
}
    @Override
    public void onDestroy() {
        super.onDestroy();
        windowManager.removeView(chathead);
    }
}