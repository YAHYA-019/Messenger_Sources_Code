package androidx.work.impl.background.systemalarm;

import X.0FI;
import X.4IS;
import X.4IU;
import X.AnonymousClass001;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;

/* loaded from: RescheduleReceiver.class */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String A00 = 4IS.A01("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A01 = 0FI.A01(1184958104);
        4IS A002 = 4IS.A00();
        String str = A00;
        A002.A02(str, AnonymousClass001.A0Z(intent, "Received intent ", AnonymousClass001.A0k()));
        try {
            4IU A003 = 4IU.A00(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            AsyncBroadcastReceiverObserver.goAsync(this, goAsync);
            synchronized (4IU.A0D) {
                BroadcastReceiver.PendingResult pendingResult = A003.A00;
                if (pendingResult != null) {
                    pendingResult.finish();
                    AsyncBroadcastReceiverObserver.finish(pendingResult);
                }
                A003.A00 = goAsync;
                if (A003.A08) {
                    goAsync.finish();
                    AsyncBroadcastReceiverObserver.finish(goAsync);
                    A003.A00 = null;
                }
            }
        } catch (IllegalStateException e) {
            4IS.A00();
            Log.e(str, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
        0FI.A0D(634861243, A01, intent);
    }
}
