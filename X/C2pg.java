package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.2pg, reason: invalid class name */
/* loaded from: 2pg.class */
public final class C2pg extends C1rj {
    public C1u7 A00;
    public MigColorScheme A01;
    public 2KE A02;
    public String A03;
    public boolean A04;

    public C2pg() {
        super("ThreadTimestampComponent");
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        String str = this.A03;
        2KE r0 = this.A02;
        C1u7 c1u7 = this.A00;
        boolean z = this.A04;
        11T.A0F(r302, 0);
        11T.A0F(migColorScheme, 1);
        11T.A0F(str, 2);
        11T.A0F(r0, 3);
        11T.A0F(c1u7, 4);
        String A0W = 0Pz.A0W(z ? "" : " · ", str);
        2KD A01 = 2K3.A01(r302, 0);
        A01.A32(false);
        A01.A2z(A0W);
        A01.A2y(r0);
        A01.A2w(c1u7);
        A01.A2x(migColorScheme);
        return A01.A2W();
    }
}
