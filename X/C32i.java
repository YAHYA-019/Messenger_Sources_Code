package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: X.32i, reason: invalid class name */
/* loaded from: 32i.class */
public final class C32i extends BroadcastReceiver {
    public Context A00;
    public final 3Fo A01;

    public C32i(3Fo r302) {
        this.A01 = r302;
    }

    public final void A00() {
        synchronized (this) {
            Context context = this.A00;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.A00 = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = 0FI.A01(-1153110321);
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.A01.A00();
            A00();
            i = -63624013;
        } else {
            i = -241227437;
        }
        0FI.A0D(i, A01, intent);
    }
}
