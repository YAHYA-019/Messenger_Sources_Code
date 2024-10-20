package X;

/* renamed from: X.7g2, reason: invalid class name */
/* loaded from: 7g2.class */
public final class C7g2 extends C1rj {
    public 1LI A00;
    public AnonymousClass638 A01;
    public AnonymousClass622 A02;

    public C7g2() {
        super("RetryListenerWrapper");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A02, this.A01};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        C7g2 c7g2 = (C7g2) super.A0l();
        c7g2.A00 = 4YV.A0J(c7g2.A00);
        return c7g2;
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI r0 = this.A00;
        1BK.A1M(r302, r0);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        2dD A00 = C2dB.A00(r302);
        A00.A2X(r0);
        A00.A2U(false);
        A01.A2e(A00.A2W());
        A01.A2T(1LI.A09(r302, C7g2.class, "RetryListenerWrapper", -2118288641));
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -2118288641) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        C7g2 c7g2 = (C7g2) r302.A00.A01;
        AnonymousClass622 anonymousClass622 = c7g2.A02;
        AnonymousClass638 anonymousClass638 = c7g2.A01;
        1BL.A1F(anonymousClass622, anonymousClass638);
        anonymousClass638.CI3(anonymousClass622.A03);
        return null;
    }
}
