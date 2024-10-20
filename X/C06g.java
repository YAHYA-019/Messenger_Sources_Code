package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.06g, reason: invalid class name */
/* loaded from: 06g.class */
public abstract class C06g {
    public C00m A00;
    public boolean A01;
    public final CopyOnWriteArrayList A02 = new CopyOnWriteArrayList();

    public C06g(boolean z) {
        this.A01 = z;
    }

    public final void A01(boolean z) {
        this.A01 = z;
        C00m c00m = this.A00;
        if (c00m != null) {
            c00m.invoke();
        }
    }

    public void A02() {
    }

    public abstract void A03();

    public void A04(0Q0 r302) {
    }

    public void A05(0Q0 r302) {
    }
}
