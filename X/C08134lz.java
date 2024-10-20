package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.PowerManager;
import com.facebook.inject.FbInjector;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4lz.class */
public final class C08134lz {
    public final PowerManager A00;
    public final 4AP A01;
    public volatile Boolean A02;

    public C08134lz() {
        Context A00 = FbInjector.A00();
        this.A00 = (PowerManager) 1Hv.A02((Context) 1Bn.A0A(83719), 100179);
        C4A9 c4a9 = new C4A9() { // from class: X.4m0
            @Override // X.C4A9
            public void CFd(Context context, Intent intent, Collection collection) {
                boolean equals = "android.intent.action.SCREEN_ON".equals(intent.getAction());
                C08134lz c08134lz = C08134lz.this;
                synchronized (c08134lz) {
                    c08134lz.A02 = Boolean.valueOf(equals);
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((InterfaceC07964le) it.next()).CIz(equals);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.setPriority(999);
        this.A01 = new 4AP(A00, intentFilter, c4a9);
    }

    public void A00(Handler handler, InterfaceC07964le interfaceC07964le) {
        synchronized (this) {
            this.A01.A02(handler, interfaceC07964le);
        }
    }

    public void A01(InterfaceC07964le interfaceC07964le) {
        A00(null, interfaceC07964le);
    }

    public void A02(InterfaceC07964le interfaceC07964le) {
        boolean z;
        synchronized (this) {
            4AP r0 = this.A01;
            r0.A03(interfaceC07964le);
            synchronized (r0) {
                z = !r0.A04.isEmpty();
            }
            if (z) {
                this.A02 = null;
            }
        }
    }

    public boolean A03() {
        synchronized (this) {
            if (this.A02 == null) {
                return this.A00.isScreenOn();
            }
            return Boolean.TRUE.equals(this.A02);
        }
    }
}
