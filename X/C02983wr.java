package X;

import android.util.LongSparseArray;

/* renamed from: X.3wr, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wr.class */
public final class C02983wr implements 1KH {
    public final 1K6 A00;
    public final InterfaceC03003wt A01 = new LongSparseArray();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.3wt, android.util.LongSparseArray] */
    public C02983wr(1K6 r302) {
        this.A00 = r302;
    }

    public 03Z AUo(0El r302, long j) {
        1K6 r0 = this.A00;
        r0.D4e(r302, 0);
        try {
            return (03Z) this.A01.get(j);
        } finally {
            r0.D4f(r302, 0);
        }
    }

    public void CZx(0El r302, 03Z r303, long j) {
        1K6 r0 = this.A00;
        r0.D4e((0El) null, 1);
        try {
            this.A01.put(j, r303);
        } finally {
            r0.D4f((0El) null, 1);
        }
    }

    public 03Z Cdp(0El r302, long j) {
        03Z r309;
        1K6 r0 = this.A00;
        r0.D4e(r302, 1);
        try {
            InterfaceC03003wt interfaceC03003wt = this.A01;
            int indexOfKey = interfaceC03003wt.indexOfKey(j);
            if (indexOfKey < 0) {
                r309 = null;
            } else {
                r309 = (03Z) interfaceC03003wt.valueAt(indexOfKey);
                interfaceC03003wt.removeAt(indexOfKey);
            }
            r0.D4f(r302, 1);
            return r309;
        } catch (Throwable th) {
            r0.D4f(r302, 1);
            throw th;
        }
    }
}
