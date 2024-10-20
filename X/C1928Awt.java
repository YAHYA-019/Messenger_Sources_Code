package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Awt, reason: case insensitive filesystem */
/* loaded from: Awt.class */
public final class C1928Awt extends 1LH {
    public final MigColorScheme A00;
    public final CharSequence A01;

    public C1928Awt(MigColorScheme migColorScheme, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A15, 4YV.A06(2RH.A04));
        C2sn A0L = 7zR.A0L(c2k5);
        2KD A01 = 2K3.A01(A0L.A00, A1W ? 1 : 0);
        A01.A2z(this.A01);
        A01.A2i();
        A01.A2c();
        A01.A2x(this.A00);
        A01.A16(56.0f);
        A01.A2X();
        A01.A32(true);
        7zN.A1Q(A0L, A01);
        return C2so.A0M(A0L, c2k5, A0K);
    }
}
