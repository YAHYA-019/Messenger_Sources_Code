package X;

import android.view.View;

/* loaded from: Cwq.class */
public final class Cwq implements AnonymousClass553 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public Cwq(AcX acX, CqU cqU, int i, int i2) {
        this.A00 = i2;
        this.A02 = cqU;
        this.A03 = acX;
        this.A01 = i;
    }

    @Override // X.AnonymousClass553
    public void onClick(View view) {
        BhA bhA = ((CqU) this.A02).A0B;
        if (bhA != null) {
            Object obj = this.A03;
            AlI.A07(bhA.A00, 7zN.A0e(obj), this.A01);
        }
    }
}
