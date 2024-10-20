package X;

import android.content.Context;
import android.util.SparseArray;

/* loaded from: Dxk.class */
public final class Dxk extends C1rj {
    public SparseArray A00;
    public DkW A01;
    public GCq A02;
    public String A03;
    public java.util.Map A04;

    public Dxk() {
        super("FbBloksBaseComponent");
    }

    public final Object[] A0k() {
        return new Object[]{null, this.A01, null, null, null, AnonymousClass001.A0K(), null, this.A02, this.A04, null, null, null, this.A00, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QO5 A0P = 4YU.A0P(r302);
        java.util.Map map = this.A04;
        SparseArray sparseArray = this.A00;
        FHf fHf = A0P.A02;
        50F r0 = A0P.A00;
        r0.A03(r302.A05());
        if (fHf == null) {
            return 2cK.A01(r302, (String) null, 0).A00;
        }
        if (sparseArray == null) {
            sparseArray = DKC.A0E();
        }
        sparseArray.put(2131362438, r0);
        Duf A06 = Duf.A06(r302);
        A06.A2X(fHf);
        A06.A2Y(null);
        DzD dzD = A06.A01;
        dzD.A05 = map;
        dzD.A06 = true;
        dzD.A00 = sparseArray;
        return A06.A2V();
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        String str = this.A03;
        1Bn.A0A(148032);
        50F r0 = (50F) 1Bn.A0A(49434);
        Context context = r302.A0D;
        1Hv.A02(context, 82353);
        r0.A00 = str;
        r0.A03(r302.A05());
        DKG.A1D(context);
        throw AnonymousClass001.A0q(7zK.A00(172));
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
