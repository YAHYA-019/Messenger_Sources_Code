package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.021, reason: invalid class name */
/* loaded from: 021.class */
public final class AnonymousClass021 {
    public final BroadcastReceiver A00;

    public AnonymousClass021(Context context) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.022
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                int A01 = 0FI.A01(1098763324);
                0YE.A02(false, true);
                0FI.A0D(1861830173, A01, intent);
            }
        };
        this.A00 = broadcastReceiver;
        AnonymousClass023.A02(broadcastReceiver, context, new IntentFilter(0Pz.A0W(context.getPackageName(), ".FBSYSTRACE_CONFIG_CHANGE")), null, "android.permission.DUMP", false);
    }
}
