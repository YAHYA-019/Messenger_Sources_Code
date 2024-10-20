package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.Azy, reason: case insensitive filesystem */
/* loaded from: Azy.class */
public final class C2037Azy extends C1rj {
    public static final MigColorScheme A05 = LightColorScheme.A00();
    public C85 A00;
    public AnonymousClass553 A01;
    public MigColorScheme A02;
    public C5xv A03;
    public boolean A04;

    public C2037Azy() {
        super("BlockViewLayout");
        this.A02 = A05;
        this.A04 = false;
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, true, Boolean.valueOf(this.A04), this.A03, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C1rh c1rh;
        C5z2 c5z2;
        C85 c85 = this.A00;
        boolean z = this.A04;
        C5xv c5xv = this.A03;
        AnonymousClass553 anonymousClass553 = this.A01;
        MigColorScheme migColorScheme = this.A02;
        C7M c7m = c85.A00;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        if (c7m != null) {
            2MG r311 = c7m.A01 ? 2MG.A02 : 2MG.A03;
            C5yw A0b = 7zN.A0b(r302, false);
            A0b.A2f(c7m.A00);
            A0b.A2c(r311);
            AbM.A1N(migColorScheme, A0b, c5xv, false);
            if (z) {
                C9lC A00 = C9lC.A00();
                A00.A04(r302.A08(2131955714));
                11T.A0F(migColorScheme, 0);
                A00.A01 = migColorScheme;
                A00.A03(anonymousClass553);
                c5z2 = A00.A02();
            } else {
                c5z2 = null;
            }
            A0b.A2e(c5z2);
            A01.A2X(A0b.A2V());
        }
        if (c85.A04) {
            C1rq A012 = C1rg.A01(r302, null, 0);
            A012.A2g(C1ro.CENTER);
            A012.A2c();
            A012.A0R();
            c1rh = 7zL.A0d(8Tj.A06(C8m4.A00(r302), migColorScheme), A012);
        } else {
            8T0 A002 = 8mB.A00(r302);
            7zM.A1O(A002, migColorScheme);
            A002.A2Y(c85.A01);
            A002.A0R();
            A002.A0J();
            c1rh = A002.A01;
        }
        A01.A2X(c1rh);
        return A01.A00;
    }
}
