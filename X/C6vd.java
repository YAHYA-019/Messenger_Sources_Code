package X;

import java.lang.ref.WeakReference;

/* renamed from: X.6vd, reason: invalid class name */
/* loaded from: 6vd.class */
public final class C6vd {
    public C6va A00 = C6va.A06;
    public WeakReference A01 = new WeakReference(null);

    public final void A00(C6va c6va) {
        11T.A0F(c6va, 0);
        this.A00 = c6va;
        C6vb c6vb = (C6vb) this.A01.get();
        if (c6vb != null) {
            6vY.A00(c6va, c6vb.A00, (Boolean) null, (Boolean) null, (Long) null);
        }
    }
}
