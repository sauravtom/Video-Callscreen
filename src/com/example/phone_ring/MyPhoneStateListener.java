package com.example.phone_ring;

import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;

/**
 * Created by sauravtom on 20/6/14.
 */

public class MyPhoneStateListener extends PhoneStateListener {

    Context context;
    public WindowManager windowManager;

    public MyPhoneStateListener(Context context) {
        this.context = context;
    }

    public void onCallStateChanged(int state,String incomingNumber){

        switch(state){
            case TelephonyManager.CALL_STATE_IDLE:
                //call was cancelled
                context.stopService(new Intent(context, Float.class));
                break;

            case TelephonyManager.CALL_STATE_OFFHOOK:
                //call recieved or dialing
                context.stopService(new Intent(context, Float.class));
                break;

            case TelephonyManager.CALL_STATE_RINGING:
                Intent serviceIntent = new Intent(context, Float.class);
                context.startService(serviceIntent);
                break;
        }
    }
}
