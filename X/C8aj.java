package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8aj, reason: invalid class name */
/* loaded from: 8aj.class */
public final class C8aj extends 1LH {
    public final Aa1 A00;
    public final MigColorScheme A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C8aj(Aa1 aa1, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3) {
        this.A01 = migColorScheme;
        this.A00 = aa1;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, A1W);
        7zM.A1W(migColorScheme, A0l);
        C9zj.A04(A0l, this, 49);
        A0l.A2c(2MG.A06);
        if (this.A03) {
            C9lC A00 = C9lC.A00();
            A00.A01 = migColorScheme;
            A00.A04 = "TAG_RESTORE_SKIP";
            C9lC.A01(A00, A0L, 2131957201);
            A00.A02 = 3yH.A09(A0L, 2131957201);
            9zQ.A02(A0l, A00, this, 10);
        }
        7zN.A1R(A0L, A0l);
        int i = 2131957576;
        if (this.A04) {
            i = 2131957577;
        }
        8NK r0 = new 8NK(C9py.A01(C9py.A03(this, 97), 3yH.A09(A0L, 2131962357), 3yH.A09(A0L, 2131957209), this, 98), (1LI) null, C8xf.A00(7zS.A02(C9ll.A0A, migColorScheme)), 3yH.A09(A0L, i), (CharSequence) null, (CharSequence) null, (Integer) null, (Integer) null, 7zO.A12(new 8Ll(C1u3.A4S, (CharSequence) null, 3yH.A09(A0L, 2131957574), (String) null, 10), 8Ll.A00(C1u3.A48, A0L, 2131957575, 10)), A1W, true);
        8Tn A09 = 8Tn.A09(AeS, migColorScheme);
        A09.A2Z(r0);
        A09.A01.A04 = this.A02;
        return 8Tn.A06(A0L, c2k5, A0T, A09);
    }
}
