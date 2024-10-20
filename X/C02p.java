package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.02p, reason: invalid class name */
/* loaded from: 02p.class */
public final class C02p {
    public boolean A00;
    public boolean A01;
    public final BroadcastReceiver A02;
    public final IntentFilter A03;

    public C02p(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.A03 = intentFilter;
        this.A02 = broadcastReceiver;
    }

    public String toString() {
        StringBuilder A0l = AnonymousClass001.A0l(128);
        A0l.append("Receiver{");
        A0l.append(this.A02);
        A0l.append(" filter=");
        A0l.append(this.A03);
        if (this.A01) {
            A0l.append(" DEAD");
        }
        return AnonymousClass001.A0d("}", A0l);
    }
}
