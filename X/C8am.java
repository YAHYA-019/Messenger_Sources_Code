package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8am, reason: invalid class name */
/* loaded from: 8am.class */
public final class C8am extends 1LH {
    public final RFR A00;
    public final MigColorScheme A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C8am(RFR rfr, MigColorScheme migColorScheme, boolean z, boolean z2, boolean z3) {
        11T.A0F(rfr, 2);
        this.A01 = migColorScheme;
        this.A00 = rfr;
        this.A02 = z;
        this.A04 = z2;
        this.A03 = z3;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, A1W);
        7zM.A1W(migColorScheme, A0l);
        C9zj.A04(A0l, this, 60);
        if (this.A02) {
            7zN.A1E(A0l, A0L, 2131962790);
            A0l.A2Y();
        } else {
            A0l.A2c(2MG.A06);
        }
        if (this.A04) {
            C9lC A00 = C9lC.A00();
            A00.A01 = migColorScheme;
            A00.A04 = "TAG_RESTORE_SKIP";
            C9lC.A01(A00, A0L, 2131962790);
            9zQ.A02(A0l, A00, this, 14);
        }
        7zN.A1R(A0L, A0l);
        String A09 = 3yH.A09(A0L, 2131962789);
        C8xf A01 = 9Di.A01(migColorScheme);
        String A092 = 3yH.A09(A0L, 2131962787);
        String A093 = 3yH.A09(A0L, 2131962788);
        C9py A03 = C9py.A03(this, ActionId.RTMP_CONNECTION_REQUESTED);
        int i = 2131964538;
        if (this.A03) {
            i = 2131964537;
        }
        8NK r0 = new 8NK(C9py.A01(A03, A093, 3yH.A09(A0L, i), this, ActionId.RTMP_CONNECTION_RELEASE), (1LI) null, A01, A09, A092, (CharSequence) null, (Integer) null, (Integer) null, (List) null, A1W, true);
        8Tn A094 = 8Tn.A09(AeS, migColorScheme);
        A094.A2Z(r0);
        return 8Tn.A06(A0L, c2k5, A0T, A094);
    }
}
