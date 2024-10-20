package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: X.6mM, reason: invalid class name */
/* loaded from: 6mM.class */
public final class C6mM {
    public final java.util.Map A00 = new LinkedHashMap();

    public static final void A00(C6mM c6mM, long j) {
        java.util.Map map = c6mM.A00;
        synchronized (map) {
            map.remove(Long.valueOf(j));
        }
    }

    public final 6mO A01(long j) {
        java.util.Map map = this.A00;
        synchronized (map) {
            Long valueOf = Long.valueOf(j);
            WeakReference weakReference = (WeakReference) map.get(valueOf);
            if (weakReference != null) {
                6mO r0 = (6mO) weakReference.get();
                if (r0 != null) {
                    return r0;
                }
            }
            6mO r02 = new 6mO(this, (6mN) 1Bn.A0A(66294), j);
            map.put(valueOf, new WeakReference(r02));
            return r02;
        }
    }
}
