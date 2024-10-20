package X;

/* loaded from: Dx7.class */
public final class Dx7 extends C1rj {
    public F90 A00;
    public Aak A01;

    public Dx7() {
        super("InstantGameArcadeRetryComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        11T.A0F(r302, 0);
        2cM A0f = AbH.A0f(r302, 0);
        A0f.A1S((int) (DKD.A08().heightPixels * 0.75d));
        A0f.A2b();
        A0f.A2c();
        3yF A0L = 2KZ.A0L(r302, 0);
        A0L.A30(2131958254);
        A0L.A2z(2132213791);
        A0L.A2s(20.0f);
        A0f.A2d(A0L);
        3yF A0L2 = 2KZ.A0L(r302, 0);
        A0L2.A30(2131958253);
        A0L2.A2z(2132213791);
        A0L2.A2f();
        A0L2.A0Y();
        A0L2.A19(8.0f);
        A0L2.A1A(16.0f);
        A0L2.A2s(15.0f);
        A0f.A2d(A0L2);
        AwI awI = new AwI(r302, new 8jJ());
        awI.A2W(2131958252);
        7zN.A1D(awI, r302, Dx7.class, "InstantGameArcadeRetryComponent", -2118288641);
        A0f.A2d(awI);
        return A0f.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -2118288641) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        Dx7 dx7 = (Dx7) r302.A00.A01;
        Aak aak = dx7.A01;
        F90 f90 = dx7.A00;
        11T.A0F(aak, 1);
        if (f90 != null) {
            f90.A01("retry_loading", "retry_button");
        }
        aak.CI5();
        return null;
    }
}
