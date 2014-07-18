package com.example.phone_ring;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/**
 * Created by sauravtom on 20/6/14.
 */
public class ServiceReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        MyPhoneStateListener phoneListener = new MyPhoneStateListener(context);
        TelephonyManager telephony = (TelephonyManager)
                context.getSystemService(Context.TELEPHONY_SERVICE);
        telephony.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);

    }

}

