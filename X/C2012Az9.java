package X;

/* renamed from: X.Az9, reason: case insensitive filesystem */
/* loaded from: Az9.class */
public final class C2012Az9 extends C1rj {
    public 1LI A00;
    public 2Yf A01;

    public C2012Az9() {
        super("ScrollableTopSectionWithFooterComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C2012Az9 c2012Az9 = (C2012Az9) super.A0l();
        1LI r0 = c2012Az9.A00;
        2Yf r304 = null;
        c2012Az9.A00 = r0 != null ? r0.A0l() : null;
        2Yf r02 = c2012Az9.A01;
        if (r02 != null) {
            r304 = r02.A0g(false);
        }
        c2012Az9.A01 = r304;
        return c2012Az9;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2Yf r0 = this.A01;
        1LI r02 = this.A00;
        11T.A0F(r302, 0);
        11T.A0G(r0, 1, r02);
        2cM A00 = 2cK.A00(r302);
        C2ki A002 = C2kV.A00(r302);
        A002.A2j(true);
        A002.A2f(new 2kW().A00());
        A002.A2d(r0);
        A002.A0R();
        AbG.A1M(A00, A002);
        return 7zL.A0V(A00, r02);
    }
}
