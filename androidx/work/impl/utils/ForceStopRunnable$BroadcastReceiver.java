package androidx.work.impl.utils;

import X.0FI;
import X.4IS;
import X.C4K7;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: ForceStopRunnable$BroadcastReceiver.class */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String A00 = 4IS.A01("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A01 = 0FI.A01(10042950);
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            4IS A002 = 4IS.A00();
            String str = A00;
            if (A002.A00 <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            C4K7.A00(context);
        }
        0FI.A0D(-1794513049, A01, intent);
    }
}
