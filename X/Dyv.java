package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.BitSet;

/* loaded from: Dyv.class */
public final class Dyv extends C1rj {
    public static final 2MR A0C = 2MR.A1S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public Drawable A06;
    public ImageView.ScaleType A07;
    public 1Im A08;
    public Boolean A09;
    public Boolean A0A;
    public boolean A0B;

    public Dyv() {
        super("FigCompoundButtonComponent");
        this.A00 = 2132410900;
        this.A02 = 2132279321;
        this.A03 = 2132410900;
        this.A04 = -10723742;
    }

    public final Object[] A0k() {
        return new Object[]{this.A09, Integer.valueOf(this.A00), this.A05, Integer.valueOf(this.A01), null, Integer.valueOf(this.A02), this.A0A, Boolean.valueOf(this.A0B), this.A07, 2132279337, Integer.valueOf(this.A03), this.A06, Integer.valueOf(this.A04), null};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Drawable drawable = this.A05;
        Drawable drawable2 = this.A06;
        Boolean bool = this.A0A;
        Boolean bool2 = this.A09;
        int i = this.A00;
        int i2 = this.A03;
        int i3 = this.A01;
        int i4 = this.A04;
        ImageView.ScaleType scaleType = this.A07;
        int i5 = this.A02;
        boolean z = this.A0B;
        if (i5 == 2132279310) {
            i5 = DKG.A01(r302.A0D, i5);
        }
        Drt drt = new Drt(new DyE(), r302);
        DyE dyE = drt.A00;
        dyE.A08 = drawable;
        BitSet bitSet = drt.A02;
        bitSet.set(0);
        dyE.A0A = drawable2;
        bitSet.set(1);
        dyE.A0D = bool2;
        if (i3 == 0) {
            i3 = 7zM.A02(r302.A0D, A0C);
        }
        dyE.A01 = i3;
        C1qo c1qo = ((C1rs) drt).A02;
        dyE.A00 = c1qo.A09(2130969755, 0);
        dyE.A06 = i4;
        dyE.A05 = c1qo.A09(2130969755, 0);
        dyE.A07 = c1qo.A0B(i);
        dyE.A09 = c1qo.A0B(i2);
        dyE.A02 = c1qo.A02(4.0f);
        dyE.A0B = scaleType;
        dyE.A03 = i5;
        dyE.A04 = c1qo.A06(2132279337);
        dyE.A0E = bool.booleanValue();
        dyE.A0F = z;
        1LI r0 = r302.A02;
        dyE.A0C = r0 == null ? null : ((Dyv) r0).A08;
        C1rs.A00(bitSet, drt.A03);
        drt.A0J();
        return dyE;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return DKF.A0P(c1qp);
    }
}
