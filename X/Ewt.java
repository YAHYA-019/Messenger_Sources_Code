package X;

import android.util.LongSparseArray;

/* loaded from: Ewt.class */
public final class Ewt {
    public final C2820Jac A00;
    public final Object A01 = AnonymousClass001.A0R();
    public final LongSparseArray A02 = new LongSparseArray();

    public Ewt() {
        C2820Jac c2820Jac = KZH.A00;
        this.A00 = new C2820Jac(6);
    }

    public Ems A00(long j) {
        Ems ems;
        synchronized (this.A01) {
            Object obj = this.A02.get(j);
            ems = obj instanceof Ems ? (Ems) obj : null;
        }
        return ems;
    }

    public final void A01(Ems ems, long j, boolean z) {
        synchronized (this.A01) {
            this.A02.put(j, ems);
            if (z) {
                this.A00.A0A(Long.valueOf(j));
            }
        }
    }
}
