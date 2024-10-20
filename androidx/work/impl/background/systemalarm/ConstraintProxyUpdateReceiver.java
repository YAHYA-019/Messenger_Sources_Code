package androidx.work.impl.background.systemalarm;

import X.0FI;
import X.0Pz;
import X.4IS;
import X.4IU;
import X.LqE;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.acra.asyncbroadcastreceiver.AsyncBroadcastReceiverObserver;

/* loaded from: ConstraintProxyUpdateReceiver.class */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String A00 = 4IS.A01("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A01 = 0FI.A01(-1517976881);
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            AsyncBroadcastReceiverObserver.goAsync(this, goAsync);
            4IU.A00(context).A06.ARK(new LqE(goAsync, context, intent, this));
        } else {
            4IS.A00().A02(A00, 0Pz.A0W("Ignoring unknown action ", action));
        }
        0FI.A0D(-942510254, A01, intent);
    }
}
