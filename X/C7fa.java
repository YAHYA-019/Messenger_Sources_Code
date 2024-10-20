package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.7fa, reason: invalid class name */
/* loaded from: 7fa.class */
public final class C7fa extends C1rj {
    public MigColorScheme A00;

    public C7fa() {
        super("LandingPageLoadingScreen");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A00;
        11T.A0H(r302, migColorScheme);
        2cM A00 = 2cK.A00(r302);
        A00.A1H(migColorScheme.BDl());
        A00.A0m(100.0f);
        A00.A10(100.0f);
        A00.A2b();
        A00.A2c();
        8Tj A002 = C8m4.A00(r302);
        A002.A2Z(migColorScheme);
        A00.A2d(A002);
        return A00.A00;
    }
}
