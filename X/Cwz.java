package X;

import android.view.View;

/* loaded from: Cwz.class */
public final class Cwz implements AnonymousClass553 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public Cwz(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A05 = obj3;
        this.A07 = obj2;
        this.A06 = obj;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A08 = obj4;
    }

    @Override // X.AnonymousClass553
    public void onClick(View view) {
        DJ0 dj0;
        AcX acX;
        DK4 dk4;
        BP5 bp5;
        if (this.A00 != 0) {
            CqU cqU = (CqU) this.A05;
            dj0 = cqU.A0C;
            if (dj0 == null) {
                return;
            }
            acX = (AcX) this.A07;
            dk4 = (DK4) this.A06;
            bp5 = cqU.A09;
        } else {
            C1308Adl c1308Adl = (C1308Adl) this.A05;
            dj0 = c1308Adl.A0C;
            if (dj0 == null) {
                return;
            }
            acX = (AcX) this.A07;
            dk4 = (DK4) this.A06;
            bp5 = c1308Adl.A02;
            if (bp5 == null) {
                bp5 = BP5.A0S;
            }
        }
        dj0.CJW(bp5, dk4, acX, this.A01, this.A03, this.A02, this.A04, ((C1317Adv) this.A08).A00());
    }
}
