package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;

/* renamed from: X.8dz, reason: invalid class name */
/* loaded from: 8dz.class */
public final class C8dz extends 1LH {
    public final int A00 = 2131957725;
    public final int A01;
    public final C2iw A02;
    public final AaI A03;
    public final 99W A04;
    public final MigColorScheme A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C8dz(C2iw c2iw, AaI aaI, 99W r304, MigColorScheme migColorScheme, String str, int i, boolean z, boolean z2, boolean z3) {
        this.A05 = migColorScheme;
        this.A03 = aaI;
        this.A07 = z;
        this.A09 = z2;
        this.A06 = str;
        this.A02 = c2iw;
        this.A01 = i;
        this.A08 = z3;
        this.A04 = r304;
    }

    public 1LI A0s(C2k5 c2k5) {
        C5z2 c5z2;
        int i;
        11T.A0F(c2k5, 0);
        Object A00 = 2rO.A00(c2k5, AQv.A01(this, 18), new Object[]{this.A02});
        C2lh A002 = C2lc.A00(c2k5, ALw.A00);
        4FL.A00(c2k5, AQv.A01(A002, 17), AnonymousClass001.A1a(this.A01));
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A05;
        2lO A0T = 7zT.A0T((2lO) null, 7zS.A0n(migColorScheme));
        C2sn A0L = 7zR.A0L(c2k5);
        if (this.A08) {
            int i2 = C5yu.A00;
            LightColorScheme.A00();
            int i3 = this.A00;
            c5z2 = new C5z2(new 9zQ(this, 8), migColorScheme, 3yH.A09(A0L, i3), "HsmPinRestoreComponent-skip", 3yH.A09(A0L, i3), null, !this.A07);
        } else {
            c5z2 = null;
        }
        1Iw AeS = A0L.AeS();
        C5yw A0k = 7zS.A0k(AeS, migColorScheme);
        A0k.A2c(this.A09 ? 2MG.A02 : 2MG.A06);
        A0k.A2e(c5z2);
        C9zj.A04(A0k, this, 35);
        A0k.A2f("");
        7zN.A1R(A0L, A0k);
        A0L.A00(C9dC.A01(A0L, AV8.A00(A00, this, A002, 10)));
        C1ro c1ro = C1ro.FLEX_END;
        2lO A0O = 7zT.A0O((2lO) null, 7zL.A03());
        C2sn A0U = 7zQ.A0U(AeS);
        8TX A003 = C8nl.A00(A0U.A00);
        A003.A2b(!this.A07);
        A003.A2Z(migColorScheme);
        99W r02 = this.A04;
        if (11T.A0O(r02, C8tS.A00)) {
            i = 2131964537;
        } else if (11T.A0O(r02, 8tT.A00)) {
            i = 2131964538;
        } else if (11T.A0O(r02, 8tU.A00)) {
            i = 2131964540;
        } else {
            if (!(r02 instanceof C8tR)) {
                throw 1BK.A1F();
            }
            i = 2131964539;
        }
        A003.A2a(3yH.A09(A0U, i));
        C9py.A05(A0U, A003, this, 82);
        return 7zM.A0l(C2so.A08(A0U, A0L, A0O, c1ro), A0L, c2k5, A0T);
    }
}
