package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3xh, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3xh.class */
public final class C03243xh implements C1d3 {
    public Context A00;
    public final 1I7 A01;
    public final AtomicBoolean A02;

    public C03243xh() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A01 = (1I7) 1Hv.A02(A00, 65728);
        this.A02 = new AtomicBoolean(false);
    }

    public void A00(boolean z) {
        if (this.A02.getAndSet(z) != z) {
            Intent intent = new Intent();
            intent.setAction("com.facebook.rti.mqtt.intent.ACTION_WAKEUP");
            intent.putExtra("EXTRA_SKIP_PING", true);
            this.A01.CkS(intent);
        }
    }

    @Override // X.C1d3
    public boolean BQN() {
        return this.A02.get();
    }
}
