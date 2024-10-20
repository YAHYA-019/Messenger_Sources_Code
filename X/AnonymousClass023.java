package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;

/* renamed from: X.023, reason: invalid class name */
/* loaded from: 023.class */
public abstract class AnonymousClass023 {
    public static final Intent A00(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter) {
        11T.A0F(context, 0);
        11T.A0F(intentFilter, 2);
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static final void A01(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler) {
        11T.A0F(context, 0);
        11T.A0F(broadcastReceiver, 1);
        11T.A0F(intentFilter, 2);
        context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    public static final void A02(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler, String str, boolean z) {
        11T.A0F(context, 0);
        11T.A0F(broadcastReceiver, 1);
        11T.A0F(intentFilter, 2);
        if (Build.VERSION.SDK_INT >= 34) {
            0E0.A00(broadcastReceiver, context, intentFilter, handler, str, z);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
        }
    }

    public static final void A03(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, boolean z) {
        11T.A0F(context, 0);
        if (Build.VERSION.SDK_INT >= 34) {
            0E0.A01(broadcastReceiver, context, intentFilter, z);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
