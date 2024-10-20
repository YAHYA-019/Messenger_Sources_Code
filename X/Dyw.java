package X;

/* loaded from: Dyw.class */
public final class Dyw extends C1rj {
    public static final int A03 = 3yG.A01(24.0f);
    public static final C1rp A04 = C1rp.CENTER;
    public int A00;
    public C1rp A01;
    public String A02;

    public Dyw() {
        super("ProgressSpinnerDupComponent");
        this.A01 = A04;
        this.A00 = A03;
    }

    public final Object[] A0k() {
        return new Object[]{4YU.A0k(), this.A01, Integer.valueOf(this.A00), this.A02, 2132279327};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A00;
        C1rp c1rp = this.A01;
        String str = this.A02;
        Object A032 = 1Bi.A03(66341);
        2cM A0f = AbH.A0f(r302, 0);
        A0f.A0S();
        A0f.A2f(C1ro.FLEX_START);
        A0f.A2h(c1rp);
        A0f.A2b();
        A0f.A23(C26z.VERTICAL);
        A0f.A2K(str);
        DzM dzM = new DzM();
        C1rs c1rs = new C1rs(dzM, r302, 0, 0);
        ((DrV) c1rs).A01 = dzM;
        ((DrV) c1rs).A00 = r302;
        c1rs.A0S();
        c1rs.A0C(i);
        c1rs.A1L(i);
        c1rs.A1v(1LI.A0C(r302, Dyw.class, "ProgressSpinnerDupComponent", new Object[]{A032}, 1803022739));
        c1rs.A1p(1LI.A0C(r302, Dyw.class, "ProgressSpinnerDupComponent", new Object[]{A032}, -1932591986));
        c1rs.A0J();
        return 7zL.A0V(A0f, ((DrV) c1rs).A01);
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 262644498145293L);
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        C2we c2we;
        int i;
        int i2 = r302.A01;
        if (i2 == -1932591986) {
            c2we = (C2we) r302.A03[0];
            i = c2we.A00 - 1;
        } else {
            if (i2 == -1048037474) {
                1LI.A0J(r302, obj);
                return null;
            }
            if (i2 != 1803022739) {
                return null;
            }
            c2we = (C2we) r302.A03[0];
            i = c2we.A00 + 1;
        }
        c2we.A00 = i;
        return null;
    }
}
