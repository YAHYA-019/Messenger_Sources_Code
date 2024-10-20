package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.8b2, reason: invalid class name */
/* loaded from: 8b2.class */
public final class C8b2 extends 1LH {
    public final String A00;
    public final C00m A01;
    public final boolean A02;
    public final MigColorScheme A03;
    public final ImmutableMap A04;

    public C8b2(MigColorScheme migColorScheme, ImmutableMap immutableMap, String str, C00m c00m, boolean z) {
        7zR.A1N(migColorScheme, immutableMap);
        this.A03 = migColorScheme;
        this.A02 = z;
        this.A04 = immutableMap;
        this.A00 = str;
        this.A01 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        int i;
        11T.A0F(c2k5, 0);
        1Br A00 = 1Bu.A00(68572);
        1yM r0 = (1yM) 1Bi.A03(16885);
        1Iw r02 = c2k5.A05;
        String A01 = C3Om.A01(r02.A0D, r0);
        11T.A0A(A01);
        boolean z = this.A02;
        2qQ A0o = 7zL.A0o();
        if (z) {
            7zM.A1V(A0o, 2132346664);
            i = 2132346665;
        } else {
            7zM.A1V(A0o, 2132346597);
            i = 2132346598;
        }
        2qR A0k = 7zQ.A0k(A0o, i);
        String str = (String) this.A04.get("qr_code_hash");
        if (str == null) {
            str = "";
        }
        String A09 = z ? 3yH.A09(c2k5, 2131960150) : 3yH.A0A(c2k5, A01, 2131960147);
        MigColorScheme migColorScheme = this.A03;
        8NJ r03 = new 8NJ(new 8Lf(new 9pY(A00, this, str, 0), 3yH.A09(c2k5, 2131960143)), new C8xg(null, (Integer) migColorScheme.Ci4(A0k), null, null), (CharSequence) null, (CharSequence) null, A09, 7zN.A0v(new 8Ll(C1u3.A1K, (CharSequence) null, 3yH.A09(c2k5, 2131960144), (String) null, 10), new 8Ll(C1u3.A28, (CharSequence) null, 3yH.A0A(c2k5, A01, 2131960145), (String) null, 10), 8Ll.A00(C1u3.A5l, c2k5, 2131960146, 10)), true);
        2lQ r04 = 2lO.A02;
        int BDl = migColorScheme.BDl();
        Integer num = 0S2.A00;
        2lO A0Z = 7zQ.A0Z(4YV.A0K(7zS.A0a((2lO) null, num, BDl), 0S2.A15, 7zP.A0I()), num, new ARE(A00, this, str, 9));
        C2sn A0U = 7zQ.A0U(r02);
        return 8Tn.A06(A0U, c2k5, A0Z, 8Tn.A08(A0U.A00, r03, migColorScheme));
    }
}
