package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Ayf, reason: case insensitive filesystem */
/* loaded from: Ayf.class */
public final class C1986Ayf extends C1rj {
    public CQY A00;
    public MigColorScheme A01;
    public C5xv A02;
    public String A03;
    public String A04;

    public C1986Ayf() {
        super("ReachabilitySettingDeliveryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, 1BK.A0d(), this.A03, this.A04, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A04;
        String str2 = this.A03;
        C5xv c5xv = this.A02;
        MigColorScheme migColorScheme = this.A01;
        CQY cqy = this.A00;
        11T.A0F(r302, 0);
        1BL.A11(1, str, c5xv, migColorScheme);
        11T.A0F(cqy, 6);
        2cM A00 = 2cK.A00(r302);
        A00.A0R();
        7zM.A1O(A00, migColorScheme);
        C5yw A002 = C5yv.A00(r302);
        A002.A2f(str);
        A002.A01.A0A = str2;
        A002.A2b(migColorScheme);
        A002.A2i(false);
        A002.A2d(c5xv);
        A00.A2d(A002);
        A00.A2e((1LI) null);
        return 7zL.A0V(A00, cqy.A09());
    }
}
