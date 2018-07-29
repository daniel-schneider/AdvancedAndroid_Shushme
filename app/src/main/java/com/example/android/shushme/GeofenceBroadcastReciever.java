package com.example.android.shushme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by danielschneider on 7/28/18.
 */

public class GeofenceBroadcastReciever extends BroadcastReceiver {

    private static final String TAG = GeofenceBroadcastReciever.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onRecieve triggered");
    }
}
