package X;

import android.os.Bundle;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Jor, reason: case insensitive filesystem */
/* loaded from: Jor.class */
public final class C3278Jor extends C49d {
    public static long A01;
    public static final R3G A02 = new Object();
    public static final C3278Jor A03 = new C3278Jor();
    public final RLv A00;

    public C3278Jor() {
        Looper A09 = AnonymousClass002.A09("PushTokenRefresherJobLogic");
        if (A09 == null) {
            throw 1BK.A0h();
        }
        this.A00 = new RLv(A09, RXA.A00);
    }

    @Override // X.C49d
    public boolean A01(int i) {
        RLv rLv = this.A00;
        AtomicReference atomicReference = rLv.A02;
        Runnable runnable = (SEG) atomicReference.get();
        boolean z = false;
        if (runnable != null) {
            z = true;
            ((SEG) runnable).A02 = true;
            rLv.A00.removeCallbacks(runnable);
            1MG.A00(atomicReference, runnable, (Object) null);
        }
        return z;
    }

    @Override // X.C49d
    public boolean A02(Bundle bundle, C49f c49f, int i) {
        RLv rLv = this.A00;
        Runnable seg = new SEG(c49f, rLv.A01, rLv);
        rLv.A02.set(seg);
        rLv.A00.post(seg);
        return true;
    }
}
