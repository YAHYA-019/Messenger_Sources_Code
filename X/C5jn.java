package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5jn, reason: invalid class name */
/* loaded from: 5jn.class */
public final class C5jn {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final WeakReference A01;

    public C5jn(4kZ r302) {
        this.A01 = new WeakReference(r302);
    }

    public void A00(Object obj) {
        4kZ r0 = (4kZ) this.A01.get();
        if (r0 == null || 11T.A0O(r0.A03.getAndSet(obj), obj) || this.A00.get()) {
            return;
        }
        r0.A05(new C5jo(obj));
    }
}
