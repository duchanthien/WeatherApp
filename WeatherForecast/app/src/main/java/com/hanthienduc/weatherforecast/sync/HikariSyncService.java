package com.hanthienduc.weatherforecast.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;


public class HikariSyncService extends Service {
    private static final Object sSyncAdapterLock = new Object();
    private static HikariSyncAdapter sHikariSyncAdapter = null;

    @Override
    public void onCreate() {
        Log.d("HikariSyncService", "onCreate - HikariSyncService");
        synchronized (sSyncAdapterLock) {
            if (sHikariSyncAdapter == null) {
                sHikariSyncAdapter = new HikariSyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return sHikariSyncAdapter.getSyncAdapterBinder();
    }
}