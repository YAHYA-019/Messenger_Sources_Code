package X;

/* loaded from: Dx6.class */
public final class Dx6 extends C1rj {
    public GL7 A00;
    public FyG A01;

    public Dx6() {
        super("FBMigButtonComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        GL7 gl7 = this.A00;
        FyG fyG = this.A01;
        GL7 Ay2 = gl7.Ay2(51);
        1LI A01 = Ay2 == null ? null : FJ9.A01(r302, Ay2, fyG);
        1Im r307 = null;
        if (A01 != null) {
            int Ad0 = gl7.Ad0(fyG, 44, 65, 0);
            boolean z = gl7.getBoolean(54, true);
            float A00 = C0A8.A00(r302.A0D, gl7.Amm(52, 0.0f));
            GL7 Ay22 = gl7.Ay2(42);
            FIJ A04 = Ay22 == null ? null : FJ9.A04(Ay22, fyG);
            C1rq A012 = C1rg.A01(r302, null, 0);
            A012.A2f(A01);
            int i = 520093696;
            if (0AT.A02(Ad0)) {
                i = (-1) >>> 3;
            }
            A012.A0D(z ? C2cn.A00(A00, Ad0, i) : C2cn.A02(A00, Ad0));
            if (A04 != null) {
                r307 = 1LI.A0B(r302, Dx6.class, "FBMigButtonComponent", new Object[]{A04});
            }
            A012.A2T(r307);
            7zL.A1J(A012);
            r307 = A012.A00;
        }
        return r307;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        ((FIJ) r302.A03[0]).A07();
        return null;
    }
}
