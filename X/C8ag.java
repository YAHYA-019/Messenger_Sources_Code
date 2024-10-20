package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8ag, reason: invalid class name */
/* loaded from: 8ag.class */
public final class C8ag extends 1LH {
    public final Aa1 A00;
    public final 99W A01;
    public final MigColorScheme A02;
    public final boolean A03;
    public final boolean A04;

    public C8ag(Aa1 aa1, 99W r303, MigColorScheme migColorScheme, boolean z, boolean z2) {
        1BK.A1K(aa1, 2, r303);
        this.A02 = migColorScheme;
        this.A00 = aa1;
        this.A04 = z;
        this.A01 = r303;
        this.A03 = z2;
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A02;
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, A1W);
        7zM.A1W(migColorScheme, A0l);
        C9zj.A04(A0l, this, 28);
        if (this.A03) {
            A0l.A2Y();
        } else {
            A0l.A2c(2MG.A06);
            C9lC A00 = C9lC.A00();
            A00.A01 = migColorScheme;
            A00.A04 = "TAG_RESTORE_SKIP";
            C9lC.A01(A00, A0L, 2131957201);
            A00.A02 = 3yH.A09(A0L, 2131957201);
            9zQ.A02(A0l, A00, this, 7);
        }
        7zN.A1R(A0L, A0l);
        String A09 = 3yH.A09(A0L, 2131957200);
        C8xf A002 = C8xf.A00(7zS.A02(C9ll.A0A, migColorScheme));
        String A092 = 3yH.A09(A0L, 2131957199);
        String A093 = 3yH.A09(A0L, 2131957203);
        C9py A03 = C9py.A03(this, 71);
        99W r0 = this.A01;
        if (11T.A0O(r0, 8tT.A00)) {
            i = 2131964538;
        } else if (11T.A0O(r0, C8tS.A00)) {
            i = 2131957209;
        } else if (11T.A0O(r0, 8tU.A00)) {
            i = 2131964540;
        } else {
            if (!(r0 instanceof C8tR)) {
                throw 1BK.A1F();
            }
            i = 2131964539;
        }
        8NK r02 = new 8NK(C9py.A01(A03, A093, 3yH.A09(A0L, i), this, 72), (1LI) null, A002, A09, A092, (CharSequence) null, (Integer) null, (Integer) null, (List) null, A1W, true);
        8Tn A094 = 8Tn.A09(AeS, migColorScheme);
        A094.A2Z(r02);
        A094.A01.A04 = this.A04;
        return 8Tn.A06(A0L, c2k5, A0T, A094);
    }
}
