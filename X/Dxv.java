package X;

import com.facebook.forker.Process;

/* loaded from: Dxv.class */
public final class Dxv extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxv() {
        super("FigNTSwitchComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QNk A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        Boolean bool = A0P.A00;
        boolean z = A0P.A01;
        11T.A0F(gl7, 1);
        FIJ A05 = FJ9.A05(gl7, fyG, 54);
        FIJ A052 = FJ9.A05(gl7, fyG, 57);
        boolean z2 = gl7.getBoolean(55, true);
        String A07 = GL7.A07(gl7);
        boolean z3 = gl7.getBoolean(53, false);
        if (z3 != z) {
            11T.A0D(fyG);
            Object A072 = FJ3.A07(gl7, fyG);
            11T.A0D(A072);
            bool = Boolean.valueOf(z3);
            ((F4N) A072).A00[1] = bool;
            if (r302.A02 != null) {
                4YV.A1F(r302, bool, (-1) << (-1));
            }
            if (r302.A02 != null) {
                4YV.A1F(r302, bool, Process.WAIT_RESULT_STOPPED);
            }
        }
        Dyl dyl = new Dyl();
        C1rs c1rs = new C1rs(dyl, r302, 0, 0);
        ((DrT) c1rs).A00 = dyl;
        ((DrT) c1rs).A01 = r302;
        11T.A0D(bool);
        boolean booleanValue = bool.booleanValue();
        Dyl dyl2 = ((DrT) c1rs).A00;
        dyl2.A01 = booleanValue;
        dyl2.A02 = z2;
        ((DrT) c1rs).A00.A00 = z2 ? 1LI.A0C(r302, Dxv.class, "FigNTSwitchComponent", new Object[]{A05, A052}, -1554445437) : null;
        c1rs.A2S(A07);
        c1rs.A0J();
        Dyl dyl3 = ((DrT) c1rs).A00;
        11T.A0A(dyl3);
        return dyl3;
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return DKF.A0P(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1554445437) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        boolean z = ((Ehh) obj).A01;
        Object[] objArr = r302.A03;
        FIJ fij = (FIJ) objArr[0];
        FIJ fij2 = (FIJ) objArr[1];
        Dxv dxv = (Dxv) r02;
        GL7 gl7 = dxv.A00;
        FyG fyG = dxv.A01;
        11T.A0F(r03, 0);
        11T.A0F(gl7, 1);
        Boolean valueOf = Boolean.valueOf(z);
        if (r03.A02 != null) {
            4YV.A1F(r03, valueOf, (-1) << (-1));
        }
        11T.A0D(fyG);
        DKG.A0b(gl7, fyG).A00[1] = valueOf;
        if (z) {
            if (fij == null) {
                return null;
            }
            fij.A07();
            return null;
        }
        if (fij2 == null) {
            return null;
        }
        fij2.A07();
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNk qNk = (QNk) r303;
        GL7 gl7 = this.A00;
        11T.A0F(gl7, 3);
        Boolean A03 = GL7.A03(gl7, 53);
        qNk.A01 = gl7.getBoolean(53, false);
        qNk.A00 = A03;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
