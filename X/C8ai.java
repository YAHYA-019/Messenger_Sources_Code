package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ai, reason: invalid class name */
/* loaded from: 8ai.class */
public final class C8ai extends 1LH {
    public final AZJ A00;
    public final MigColorScheme A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C8ai(AZJ azj, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3) {
        11T.A0F(azj, 2);
        this.A01 = migColorScheme;
        this.A00 = azj;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = z3;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0W = 7zU.A0W(AeS, migColorScheme, A1W);
        A0W.A2c(this.A04 ? 2MG.A03 : 2MG.A06);
        A0W.A2Z(migColorScheme.B4h());
        C9zj.A02(A0L, A0W, this, 46);
        8Tn A09 = 8Tn.A09(AeS, migColorScheme);
        A09.A2Z(new 8NK(C9py.A02(3yH.A09(A0L, 2131962332), this, 93), (1LI) null, 9Di.A01(migColorScheme), 3yH.A09(A0L, 2131962333), (CharSequence) null, (CharSequence) null, (Integer) null, (Integer) null, C0s8.A14(this.A03 ? new 8Ll[]{new 8Ll(C1u3.A4S, (CharSequence) null, 3yH.A09(A0L, 2131962329), (String) null, 10), 8Ll.A00(C1u3.A4i, A0L, 2131962330, 10), 8Ll.A00(C1u3.A1n, A0L, 2131962331, 10)} : new 8Ll[]{new 8Ll(C1u3.A2Z, (CharSequence) null, 3yH.A09(A0L, 2131962327), (String) null, 10), 8Ll.A00(C1u3.A48, A0L, 2131962328, 10)}), A1W, true));
        A09.A01.A04 = this.A02;
        return 8Tn.A06(A0L, c2k5, A0T, A09);
    }
}
