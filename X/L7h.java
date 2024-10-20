package X;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;

/* loaded from: L7h.class */
public final class L7h {
    public Object A00;
    public boolean A01;
    public final LNt A02;
    public final MMz A03;
    public final MMz A04;

    public L7h() {
        this(0, 0);
    }

    public L7h(int i, int i2) {
        C01i c01i = Kbb.A01;
        this.A03 = new ParcelableSnapshotMutableIntState(i);
        this.A04 = new ParcelableSnapshotMutableIntState(i2);
        this.A02 = new LNt(i);
    }

    public static final void A00(L7h l7h, int i, int i2) {
        if (i < 0.0f) {
            throw AnonymousClass001.A0L(JQz.A0p("Index should be non-negative (", i));
        }
        l7h.A03.Cq1(i);
        l7h.A02.A00(i);
        l7h.A04.Cq1(i2);
    }
}
