package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Azr, reason: case insensitive filesystem */
/* loaded from: Azr.class */
public final class C2030Azr extends C1rj {
    public CHq A00;
    public MigColorScheme A01;
    public CharSequence A02;

    public C2030Azr() {
        super("TitleComponent");
    }

    public static AwT A00(1Iw r301) {
        return new AwT(r301, new C2030Azr());
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2KE r310;
        Integer num;
        2KE r307;
        Bjx bjx;
        Integer num2;
        CHq cHq = this.A00;
        CharSequence charSequence = this.A02;
        MigColorScheme migColorScheme = this.A01;
        MigColorScheme A0o = AbF.A0o(r302.A0D, 16981);
        if (migColorScheme == null) {
            migColorScheme = A0o;
        }
        2KD A0e = 7zR.A0e(r302, migColorScheme, false);
        if (cHq instanceof B3Z) {
            r310 = 2KE.A06;
            num = 0S2.A0C;
            bjx = new Bjx(num, 2KE.A07);
            num2 = 0S2.A01;
            r307 = 2KE.A0D;
        } else {
            r310 = 2KE.A08;
            num = 0S2.A0C;
            r307 = 2KE.A0D;
            bjx = new Bjx(num, r307);
            num2 = 0S2.A01;
        }
        A0e.A2y((2KE) cHq.A01(r310, new Bjx[]{bjx, new Bjx(num2, r307)}));
        A0e.A2b();
        A0e.A2z(charSequence);
        2RH r0 = 2RH.A04;
        2RH r02 = 2RH.A05;
        Bjx bjx2 = new Bjx(num, r02);
        2RH r03 = 2RH.A07;
        4YU.A1N(A0e, (2RH) cHq.A01(r0, new Bjx[]{bjx2, new Bjx(num2, r03)}));
        4YU.A1M(A0e, (2RH) cHq.A01(r02, new Bjx[]{new Bjx(num, r03), new Bjx(num2, 2RH.A09)}));
        7zO.A1K(A0e, r03);
        A0e.A2X();
        return A0e.A2W();
    }
}
