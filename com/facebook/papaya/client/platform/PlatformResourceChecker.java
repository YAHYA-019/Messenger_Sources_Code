package com.facebook.papaya.client.platform;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: PlatformResourceChecker.class */
public final class PlatformResourceChecker {
    public static long getAvailableMemoryBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return Long.MAX_VALUE;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem - memoryInfo.threshold;
    }

    public static double getBatteryLevel(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        double d = 0.0d;
        if (registerReceiver != null) {
            double intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra2 != 0) {
                d = intExtra / intExtra2;
            }
        }
        return d;
    }

    public static boolean hasExternalPower(Context context) {
        int intExtra;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null && ((intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5)) {
            z = true;
        }
        return z;
    }

    public static boolean hasNetworkConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        boolean z = false;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            z = true;
        }
        return z;
    }

    public static boolean hasUnmeteredConnectivity(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        boolean z = false;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && !connectivityManager.isActiveNetworkMetered()) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (r0.isInteractive() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isDeviceIdle(android.content.Context r301) {
        /*
            r0 = r301
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L19
            r0 = r302
            boolean r0 = r0.isInteractive()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L1d
        L19:
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
        L1d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.papaya.client.platform.PlatformResourceChecker.isDeviceIdle(android.content.Context):boolean");
    }
}
