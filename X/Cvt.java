package X;

import android.view.View;

/* loaded from: Cvt.class */
public final class Cvt implements C5wx {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public Cvt(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, int i4, int i5) {
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

    @Override // X.C5wx
    public boolean onLongClick(View view) {
        DJ0 dj0;
        AcX acX;
        DK4 dk4;
        BP5 bp5;
        int i;
        int i2;
        int i3;
        int i4;
        Object obj;
        if (this.A00 != 0) {
            CqU cqU = (CqU) this.A05;
            dj0 = cqU.A0C;
            if (dj0 == null) {
                return false;
            }
            acX = (AcX) this.A08;
            dk4 = (DK4) this.A06;
            bp5 = cqU.A09;
            i = this.A01;
            i2 = this.A03;
            i3 = this.A02;
            Integer num = cqU.A0F;
            i4 = num != null ? num.intValue() : this.A04;
            obj = this.A07;
        } else {
            C1308Adl c1308Adl = (C1308Adl) this.A05;
            dj0 = c1308Adl.A0C;
            if (dj0 == null) {
                return false;
            }
            acX = (AcX) this.A07;
            dk4 = (DK4) this.A06;
            bp5 = c1308Adl.A02;
            if (bp5 == null) {
                bp5 = BP5.A0S;
            }
            i = this.A01;
            i2 = this.A03;
            i3 = this.A02;
            i4 = this.A04;
            obj = this.A08;
        }
        dj0.CJX(view, bp5, dk4, acX, i, i2, i3, i4, ((C1317Adv) obj).A00());
        return true;
    }
}
