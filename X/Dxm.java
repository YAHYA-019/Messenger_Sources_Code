package X;

/* loaded from: Dxm.class */
public final class Dxm extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dxm() {
        super("FigNTRadioButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        QN0 A0P = 4YU.A0P(r302);
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        DKG.A0b(gl7, fyG).A00[1] = Boolean.valueOf(A0P.A00);
        FIJ A05 = FJ9.A05(gl7, fyG, 54);
        boolean z = gl7.getBoolean(55, true);
        String A07 = GL7.A07(gl7);
        Dx9 dx9 = new Dx9();
        C1rs c1rs = new C1rs(dx9, r302, 0, 0);
        ((DrS) c1rs).A00 = dx9;
        ((DrS) c1rs).A01 = r302;
        ((DrS) c1rs).A00.A01 = GL7.A03(gl7, 53);
        ((DrS) c1rs).A00.A00 = z ? 1LI.A0C(r302, Dxm.class, "FigNTRadioButtonComponent", new Object[]{A05}, -952092468) : null;
        c1rs.A2S(A07);
        c1rs.A0J();
        return ((DrS) c1rs).A00;
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
        1Is r0 = r302.A00.A01;
        boolean z = ((Ehh) obj).A01;
        FIJ fij = (FIJ) r302.A03[0];
        Dxm dxm = (Dxm) r0;
        GL7 gl7 = dxm.A00;
        FyG fyG = dxm.A01;
        F4N.A00(DKG.A0b(gl7, fyG), Boolean.valueOf(z));
        DKC.A0Y(fyG).A09(fyG, new SE3(fij, gl7, fyG, z));
        return null;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
