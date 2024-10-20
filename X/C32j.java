package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.32j, reason: invalid class name */
/* loaded from: 32j.class */
public final class C32j extends BroadcastReceiver {
    public static AtomicReference A01 = new AtomicReference();
    public final Context A00;

    public C32j(Context context) {
        this.A00 = context;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int A012 = 0FI.A01(-1811081252);
        synchronized (C1bL.A09) {
            try {
                Iterator A1A = 1BK.A1A(C1bL.A0A);
                while (A1A.hasNext()) {
                    C1bL.A02((C1bL) A1A.next());
                }
            } catch (Throwable th) {
                0FI.A0D(1512885565, A012, intent);
                throw th;
            }
        }
        this.A00.unregisterReceiver(this);
        0FI.A0D(1567831290, A012, intent);
    }
}
