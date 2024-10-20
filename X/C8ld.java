package X;

import android.graphics.drawable.ColorDrawable;
import com.mapbox.mapboxsdk.R;
import java.util.BitSet;

/* renamed from: X.8ld, reason: invalid class name */
/* loaded from: 8ld.class */
public final class C8ld extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public 1LI A07;
    public C2o9 A08;
    public 5vW A09;
    public String A0A;

    public C8ld() {
        super("FailRetryDecoratorComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A0A, null, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A09, this.A07, Integer.valueOf(this.A03), Integer.valueOf(this.A04), Integer.valueOf(this.A05), this.A08, Integer.valueOf(this.A06)};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C8ld c8ld = (C8ld) super.A0l();
        c8ld.A07 = 4YV.A0J(c8ld.A07);
        return c8ld;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        8pE A0P = 4YU.A0P(r302);
        String str = this.A0A;
        1LI r0 = this.A07;
        int i = this.A01;
        int i2 = this.A00;
        int i3 = this.A05;
        int i4 = this.A06;
        ColorDrawable colorDrawable = A0P.A00;
        if (str == null || str.isEmpty()) {
            str = r302.A0D(2131962161);
        }
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        C1ro c1ro = C1ro.FLEX_END;
        A01.A2g(c1ro);
        A01.A0R();
        A01.A2D(C26z.RIGHT, 2132279305);
        C1rq A012 = C1rg.A01(r302, null, 0);
        2dD A00 = C2dB.A00(r302);
        A00.A1e(colorDrawable);
        A012.A2f(7zN.A0S(r0, A00));
        C2cm A002 = C2cl.A00(r302);
        A002.A2B(C26z.LEFT, R.dimen.mapbox_eight_dp);
        A002.A1M(2132279327);
        A002.A1W(2132279327);
        A002.A1y(c1ro);
        A002.A2X(i);
        A002.A2a(2132345223);
        A012.A2f(7zL.A0J(A002));
        7zL.A1I(A01, A012);
        8SG r02 = new 8SG(r302, new 8kZ());
        8kZ r03 = r02.A01;
        r03.A04 = str;
        BitSet bitSet = r02.A02;
        bitSet.set(2);
        r03.A02 = i;
        r03.A00 = i2;
        bitSet.set(0);
        r03.A01 = i3;
        bitSet.set(1);
        r03.A03 = i4;
        bitSet.set(3);
        C1rs.A02(bitSet, r02.A03);
        r02.A0J();
        return 7zL.A0V(A01, r03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1338247159) {
            return null;
        }
        4YV.A1G(r302, obj, i);
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((8pE) r303).A00 = 7zL.A0D(1tG.A05(this.A02, 4YU.A0E(r302).getInteger(2131427339)));
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
