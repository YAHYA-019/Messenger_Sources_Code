package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;

/* renamed from: X.09g, reason: invalid class name */
/* loaded from: 09g.class */
public abstract class C09g {
    public static void A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, boolean z) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
            return;
        }
        int i = 4;
        if (z) {
            i = 2;
        }
        context.registerReceiver(broadcastReceiver, intentFilter, i);
    }
}
