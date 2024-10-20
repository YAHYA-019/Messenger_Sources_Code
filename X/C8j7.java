package X;

/* renamed from: X.8j7, reason: invalid class name */
/* loaded from: 8j7.class */
public final class C8j7 extends C1rj {
    public Dky A00;

    public C8j7() {
        super("InstantGameArcadeGlimmerCardComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        DzF dzF;
        Dky dky = this.A00;
        11T.A0F(r302, 0);
        int i = 0;
        if (dky != null) {
            DuS A00 = DzF.A00(r302);
            A00.A2X(dky);
            dzF = A00.A2W();
        } else {
            C1rq A01 = C1rg.A01(r302, null, 0);
            A01.A17(8.0f);
            A01.A16(8.0f);
            8TN A002 = C8m2.A00(r302);
            Integer num = 0S2.A00;
            11T.A0F(num, 0);
            Integer num2 = 0S2.A01;
            11T.A0F(num2, 0);
            A002.A2Z(new C9hj(num2, num, 0, 200));
            A002.A2X();
            A002.A2Y(8.0f);
            A002.A0l(40.0f);
            A002.A0z(40.0f);
            A01.A2f(A002.A2W());
            2cM A012 = 2cK.A01(r302, (String) null, 0);
            A012.A2h(C1rp.SPACE_AROUND);
            A012.A17(8.0f);
            A012.A2g(C1ro.FLEX_START);
            A012.A24(C26z.LEFT, 8.0f);
            8TN A003 = C8m2.A00(r302);
            A003.A2Z(new C9hj(num2, num, 1, 300));
            A003.A2X();
            A003.A2Y(12.0f);
            A003.A0l(10.0f);
            A003.A0z(70.0f);
            A012.A2e(A003.A2W());
            8TN A004 = C8m2.A00(r302);
            A004.A2Z(new C9hj(num2, num, 1, 200));
            A004.A2X();
            A004.A2Y(12.0f);
            A004.A0l(10.0f);
            A004.A0z(251.0f);
            A012.A2e(A004.A2W());
            7zL.A1H(A012, A01);
            dzF = A01.A00;
        }
        C1rq A013 = C1rg.A01(r302, null, 0);
        8Tm A005 = C8mf.A00(r302);
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        if (dky == null) {
            i = 2132279353;
        }
        A014.A1T(i);
        A014.A0j(1.0f);
        A014.A12(6.0f);
        A014.A0W();
        A014.A1I(2132213804);
        A014.A2e(dzF);
        A005.A2f(A014);
        A005.A2Y(1.0f);
        A005.A2Z(12.0f);
        A005.A2b(2132213799);
        A005.A2X();
        return 7zL.A0c(A005, A013);
    }
}
