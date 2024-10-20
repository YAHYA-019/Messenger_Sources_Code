package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8jf, reason: invalid class name */
/* loaded from: 8jf.class */
public final class C8jf extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MigColorScheme A04;

    public C8jf() {
        super("MontageLoadingComponent");
    }

    public final Object[] A0k() {
        return 7zU.A1b(this.A04, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A03);
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        int i = this.A03;
        int i2 = this.A01;
        int i3 = this.A02;
        int i4 = this.A00;
        MigColorScheme migColorScheme = this.A04;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        int i5 = 0;
        do {
            C1rq A012 = C1rg.A01(r302, null, 0);
            int i6 = 0;
            while (true) {
                int i7 = i6;
                if (i7 >= i4) {
                    break;
                }
                2cM A013 = 2cK.A01(r302, (String) null, 0);
                A013.A1H(migColorScheme.AmV());
                A013.A0L();
                float f = i;
                A013.A0z(f);
                float f2 = i2;
                A013.A0l(f2);
                8Tm A06 = 8Tm.A06(A013, r302);
                A06.A00.A00 = migColorScheme.BDl();
                A06.A2d(2132279327);
                8Tm.A08(A06, migColorScheme);
                A06.A24(C26z.ALL, i3);
                A06.A0z(f);
                A06.A0l(f2);
                A012.A2e(A06);
                i6 = i7 + 1;
            }
            A012.A1C(16 - i3);
            7zL.A1I(A01, A012);
            i5++;
        } while (i5 < 3);
        return A01.A00;
    }
}
