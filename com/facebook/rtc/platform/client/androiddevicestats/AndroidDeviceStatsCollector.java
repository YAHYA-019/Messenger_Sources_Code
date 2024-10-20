package com.facebook.rtc.platform.client.androiddevicestats;

import X.11T;
import X.1BJ;
import X.AnonymousClass000;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import org.webrtc.ContextUtils;

/* loaded from: AndroidDeviceStatsCollector.class */
public final class AndroidDeviceStatsCollector {
    public static final AndroidDeviceStatsCollector INSTANCE = new Object();

    public static final int getActiveNetworkInfo() {
        int i = 0;
        try {
            Context context = ContextUtils.applicationContext;
            if (context != null) {
                Object systemService = context.getSystemService("connectivity");
                if (systemService instanceof ConnectivityManager) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    if (connectivityManager != null) {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                return 1;
                            }
                            if (type == 1) {
                                i = 2;
                            }
                        }
                    }
                }
            }
            return i;
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    public static final int getDeviceBatteryPercentage() {
        Intent registerReceiver;
        Context context = ContextUtils.applicationContext;
        int i = -1;
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter(AnonymousClass000.A00(42));
            try {
                11T.A0F(intentFilter, 2);
                registerReceiver = context.registerReceiver(null, intentFilter);
            } catch (RuntimeException unused) {
            }
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", i);
                int intExtra2 = registerReceiver.getIntExtra("scale", i);
                if (intExtra != i && intExtra2 != i) {
                    i = (intExtra * 100) / intExtra2;
                }
                return i;
            }
        }
        return i;
    }

    public static final int getDeviceThermalStatus() {
        Context context;
        if (Build.VERSION.SDK_INT < 29 || (context = ContextUtils.applicationContext) == null) {
            return -1;
        }
        Object systemService = context.getSystemService("power");
        11T.A0I(systemService, 1BJ.A00(34));
        PowerManager powerManager = (PowerManager) systemService;
        if (powerManager != null) {
            return powerManager.getCurrentThermalStatus();
        }
        return -1;
    }

    public static final boolean getPowerSaveMode() {
        Context context;
        if (Build.VERSION.SDK_INT < 29 || (context = ContextUtils.applicationContext) == null) {
            return false;
        }
        Object systemService = context.getSystemService("power");
        11T.A0I(systemService, 1BJ.A00(34));
        PowerManager powerManager = (PowerManager) systemService;
        if (powerManager != null) {
            return powerManager.isPowerSaveMode();
        }
        return false;
    }

    public static final boolean isBatteryCharging() {
        Context context = ContextUtils.applicationContext;
        boolean z = false;
        if (context == null) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter(AnonymousClass000.A00(42));
        try {
            11T.A0F(intentFilter, 2);
            Intent registerReceiver = context.registerReceiver(null, intentFilter);
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                }
            }
        } catch (RuntimeException unused) {
        }
        return z;
    }
}
