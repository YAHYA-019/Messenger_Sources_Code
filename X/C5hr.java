package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.5hr, reason: invalid class name */
/* loaded from: 5hr.class */
public final class C5hr extends C1rj {
    public static final C5hs A04 = C5hs.LARGE;
    public C5hs A00;
    public MigColorScheme A01;
    public boolean A02;
    public boolean A03;

    public C5hr() {
        super("MigCloseIconButton");
        this.A02 = true;
        this.A00 = A04;
    }

    public static 8Tl A00(1Iw r301) {
        return new 8Tl(r301, new C5hr());
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, Boolean.valueOf(this.A02), 1BK.A0d(), Boolean.valueOf(this.A03), this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        C5hs c5hs = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        C3aH c3aH = 2cQ.A08;
        2zB A00 = 2cP.A00(r302);
        A00.A2a(migColorScheme);
        int i = 2132345795;
        if (c5hs == C5hs.LARGE) {
            i = 2132345796;
        }
        A00.A2Y(i);
        A00.A2X(c5hs.sizeDp);
        A00.A2b(z);
        if (z2) {
            c3aH = new C3aH(c3aH, C1p7.A0F);
        }
        A00.A01.A05 = c3aH;
        A00.A1J(2131954232);
        return A00.A2W();
    }
}
