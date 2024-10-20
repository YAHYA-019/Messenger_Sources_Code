package X;

import com.facebook.forker.Process;

/* loaded from: Dy6.class */
public final class Dy6 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dy6() {
        super("FigNTCheckBoxComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QNi A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        boolean z = A0P.A00;
        boolean z2 = A0P.A01;
        FIJ A05 = FJ9.A05(gl7, fyG, 54);
        FIJ A052 = FJ9.A05(gl7, fyG, 57);
        boolean z3 = gl7.getBoolean(55, true);
        String A07 = GL7.A07(gl7);
        boolean z4 = gl7.getBoolean(53, false);
        if (z2 != z4) {
            F4N A0b = DKG.A0b(gl7, fyG);
            Boolean valueOf = Boolean.valueOf(z4);
            F4N.A00(A0b, valueOf);
            if (r302.A02 != null) {
                4YV.A1F(r302, valueOf, (-1) << (-1));
            }
            if (r302.A02 != null) {
                4YV.A1F(r302, valueOf, Process.WAIT_RESULT_STOPPED);
            }
            z = z4;
        }
        DrQ A00 = DzP.A00(r302);
        A00.A00.A03 = Boolean.valueOf(z);
        A00.A00.A02 = z3 ? 1LI.A0C(r302, Dy6.class, "FigNTCheckBoxComponent", new Object[]{A05, A052}, -952092468) : null;
        A00.A2S(A07);
        A00.A0J();
        return A00.A00;
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
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -952092468) {
            return null;
        }
        1Iv r0 = r302.A00;
        1Is r02 = r0.A01;
        1Iw r03 = r0.A00;
        boolean z = ((Ehh) obj).A01;
        Object[] objArr = r302.A03;
        FIJ fij = (FIJ) objArr[0];
        FIJ fij2 = (FIJ) objArr[1];
        Dy6 dy6 = (Dy6) r02;
        F4N A0b = DKG.A0b(dy6.A00, dy6.A01);
        Boolean valueOf = Boolean.valueOf(z);
        A0b.A00[1] = valueOf;
        if (z) {
            if (fij != null) {
                fij.A07();
            }
        } else if (fij2 != null) {
            fij2.A07();
        }
        if (r03.A02 == null) {
            return null;
        }
        r03.A0H(7zQ.A0V(valueOf, 0), "updateState:FigNTCheckBoxComponent.updateChecked");
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNi qNi = (QNi) r303;
        boolean booleanValue = GL7.A03(this.A00, 53).booleanValue();
        qNi.A01 = booleanValue;
        qNi.A00 = booleanValue;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
