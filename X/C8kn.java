package X;

import android.graphics.Typeface;
import com.google.common.collect.ImmutableList;

/* renamed from: X.8kn, reason: invalid class name */
/* loaded from: 8kn.class */
public final class C8kn extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Typeface A04;
    public 2O4 A05;
    public Aad A06;
    public AaR A07;
    public ImmutableList A08;

    public C8kn() {
        super("ReactionListItemRecycler");
    }

    public final Object[] A0k() {
        return new Object[]{0, false, this.A06, Integer.valueOf(this.A00), Integer.valueOf(this.A01), 0, 0, Integer.valueOf(this.A02), this.A05, Integer.valueOf(this.A03), this.A04, this.A08, this.A07, 0, 0};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Aad aad = this.A06;
        ImmutableList immutableList = this.A08;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A03;
        Typeface typeface = this.A04;
        2O4 r0 = this.A05;
        AaR aaR = this.A07;
        11T.A0F(r302, 0);
        11T.A0G(aad, 1, immutableList);
        C2ki A00 = C2kV.A00(r302);
        7zL.A1K(r302);
        8qB r02 = new 8qB();
        r02.A05 = aad;
        r02.A07 = immutableList;
        r02.A06 = aaR;
        r02.A03 = i4;
        r02.A04 = typeface;
        r02.A00 = i;
        r02.A01 = i2;
        r02.A02 = i3;
        A00.A2d(r02);
        C2kV c2kV = A00.A01;
        c2kV.A01 = 7zL.A05(A00, 2132279298);
        A00.A2j(true);
        A00.A2i(false);
        c2kV.A02 = 0;
        c2kV.A06 = 0;
        c2kV.A07 = 0;
        c2kV.A00 = 0;
        A00.A2Z(r0);
        A00.A2K("ReactionListItemRecyclerList");
        return A00.A2W();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }
}
