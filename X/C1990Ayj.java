package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ayj, reason: case insensitive filesystem */
/* loaded from: Ayj.class */
public final class C1990Ayj extends C1rj {
    public C1u2 A00;
    public AnonymousClass553 A01;
    public MigColorScheme A02;
    public C5xv A03;
    public String A04;
    public boolean A05;

    public C1990Ayj() {
        super("RestrictedListTitleBarComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00, this.A03, this.A04, Boolean.valueOf(this.A05)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A02;
        String str = this.A04;
        C5xv c5xv = this.A03;
        boolean z = this.A05;
        C1u2 c1u2 = this.A00;
        AnonymousClass553 anonymousClass553 = this.A01;
        11T.A0F(r302, 0);
        1BL.A1H(migColorScheme, str, c5xv);
        C5yw A00 = C5yv.A00(r302);
        A00.A2f(str);
        A00.A2b(migColorScheme);
        A00.A2i(false);
        A00.A2c(z ? 2MG.A03 : 2MG.A02);
        A00.A2d(c5xv);
        C5z1 c5z1 = null;
        if (c1u2 != null) {
            int A01 = c1u2.A01(2MQ.A1V);
            if (Integer.valueOf(A01) != null) {
                int i = C5yu.A00;
                6T0 r0 = new 6T0();
                r0.A06 = migColorScheme;
                r0.A00 = A01;
                r0.A04 = anonymousClass553;
                r0.A07 = 4YU.A0E(r302).getString(2131964545);
                c5z1 = new C5z1(r0);
            }
        }
        A00.A2e(c5z1);
        return A00.A2V();
    }
}
