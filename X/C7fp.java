package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.7fp, reason: invalid class name */
/* loaded from: 7fp.class */
public final class C7fp extends C1rj {
    public AnonymousClass553 A00;
    public MigColorScheme A01;
    public CharSequence A02;
    public CharSequence A03;
    public boolean A04;

    public C7fp() {
        super("PollSubmitButton");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02, Boolean.valueOf(this.A04), this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence = this.A03;
        boolean z = this.A04;
        CharSequence charSequence2 = this.A02;
        MigColorScheme migColorScheme = this.A01;
        AnonymousClass553 anonymousClass553 = this.A00;
        1BK.A1K(r302, 0, migColorScheme);
        8Ti A01 = 8oM.A01(r302);
        A01.A2a(charSequence);
        A01.A2b(z);
        A01.A2Z(migColorScheme);
        A01.A2Y(anonymousClass553);
        8oM A2W = A01.A2W();
        2dD A00 = C2dB.A00(r302);
        A00.A2X(A2W);
        A00.A1H(migColorScheme.AjC());
        A00.A0w(4.0f);
        C6bn.A00(A00);
        if (charSequence2 == null) {
            2dC A2W2 = A00.A2W();
            11T.A0D(A2W2);
            return A2W2;
        }
        2cM A002 = 2cK.A00(r302);
        A002.A2b();
        2KD A012 = 2K3.A01(r302, 0);
        A012.A2z(charSequence2);
        4YU.A1M(A012, 2RH.A05);
        A012.A2x(migColorScheme);
        A012.A24(C26z.ALL, 4YU.A00(2RH.A04));
        A012.A2X();
        A012.A2k();
        A012.A2d();
        4YU.A1K(A002, A012);
        A002.A2d(A00);
        return A002.A00;
    }
}
