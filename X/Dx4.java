package X;

/* loaded from: Dx4.class */
public final class Dx4 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dx4() {
        super("NTHScrollChildComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        GL7 A02 = GL7.A02(gl7);
        if (A02 == null) {
            return null;
        }
        1LI A01 = FJ9.A01(r302, A02, fyG);
        FIJ A05 = FJ9.A05(gl7, fyG, 55);
        FIJ A052 = FJ9.A05(gl7, fyG, 56);
        2dD A0p = 7zM.A0p(A01, r302);
        if (A05 != null) {
            A0p.A1n(1LI.A0C(r302, Dx4.class, "NTHScrollChildComponent", new Object[]{A05}, 1785121639));
        }
        if (A052 != null) {
            A0p.A1p(1LI.A0C(r302, Dx4.class, "NTHScrollChildComponent", new Object[]{A052}, -546900318));
        }
        return A0p.A2W();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -546900318 && i != 1785121639) {
            return null;
        }
        ((FIJ) r302.A03[0]).A07();
        return null;
    }
}
