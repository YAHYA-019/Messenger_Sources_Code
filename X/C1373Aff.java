package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Aff, reason: case insensitive filesystem */
/* loaded from: Aff.class */
public final class C1373Aff extends 2O4 {
    public boolean A00;
    public final 1Iw A01;
    public final C2iw A02;

    public C1373Aff(1Iw r302, C2iw c2iw) {
        11T.A0F(r302, 1);
        this.A01 = r302;
        this.A02 = c2iw;
        this.A00 = true;
    }

    public void A07(RecyclerView recyclerView, int i, int i2) {
        11T.A0F(recyclerView, 0);
        boolean A1X = AbJ.A1X(recyclerView);
        if (this.A00 != A1X) {
            this.A00 = A1X;
            C5yv.A01(this.A02, !A1X);
        }
    }
}
