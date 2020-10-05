package com.cgg.fcm;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFCMToken extends FirebaseMessagingService {

    private static final String TAG = "MyFCMToken";
    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.i(TAG, "onNewToken: "+s);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
    }
}
