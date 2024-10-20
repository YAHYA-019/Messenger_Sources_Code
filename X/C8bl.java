package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8bl, reason: invalid class name */
/* loaded from: 8bl.class */
public final class C8bl extends 1LH {
    public final long A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 8Km A03;
    public final MigColorScheme A04;
    public final String A05;

    public C8bl(06Z r302, FbUserSession fbUserSession, 8Km r304, MigColorScheme migColorScheme, String str, long j) {
        11T.A0F(r304, 4);
        this.A04 = migColorScheme;
        this.A00 = j;
        this.A05 = str;
        this.A03 = r304;
        this.A02 = fbUserSession;
        this.A01 = r302;
    }

    public 1LI A0s(C2k5 c2k5) {
        2cL A02;
        11T.A0F(c2k5, 0);
        5X3 A0h = 7zL.A0h("CommunityHighlightsModuleComponent_root");
        A0h.A03(C2jm.A01);
        5XC.A00(c2k5, A0h);
        4NU A00 = 4NT.A00(c2k5, SH3.A00);
        4NU A002 = 4NT.A00(c2k5, SH4.A00);
        Long valueOf = Long.valueOf(this.A00);
        int i = 0;
        8Km r0 = this.A03;
        4FL.A00(c2k5, new AQj(7, this, c2k5, A00, A002), new Object[]{valueOf, r0});
        8Jq r02 = r0.A00;
        int i2 = r02.A00;
        int i3 = r02.A01;
        2lQ r03 = 2lO.A02;
        2lO A0g = 7zL.A0g((2lO) null, C82m.A07(0));
        long A08 = 7zQ.A08();
        2lO A0K = 4YV.A0K(A0g, 0S2.A06, A08);
        1Iw r04 = c2k5.A05;
        2lO A0O = 7zS.A0O(r04, A0K, "CommunityHighlightsModuleComponent_root");
        C2sn A0U = 7zQ.A0U(r04);
        while (i < i2) {
            java.util.Map map = (java.util.Map) 7zN.A0r(r02.A02, i);
            if (map == null) {
                A02 = null;
            } else {
                long doubleToRawLongBits = Double.doubleToRawLongBits(i > 0 ? 12.0d : 0.0d);
                int A04 = i2 <= 0 ? 0 : ((7zQ.A0L(A0U.AeS()).widthPixels - (7zO.A04(A0U, A08) * 2)) - (7zO.A04(A0U, A08) * (i2 - 1))) / i2;
                2lO A0T = 7zT.A0T((2lO) null, 7zL.A0i(0S2.A0u, doubleToRawLongBits));
                C2sn A0J = 7zS.A0J(A0U);
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= i3) {
                        break;
                    }
                    8KL r05 = (8KL) 7zN.A0r(map, i5);
                    if (r05 != null) {
                        long A082 = i5 > 0 ? A08 : 7zP.A08();
                        7zQ.A1F(new C8cf(this.A01, this.A02, r05, this.A04, this.A05, (i5 * i2) + i, A04), 7zS.A0K(A0J), A0J, 4YV.A0K((2lO) null, 0S2.A15, A082));
                    }
                    i4 = i5 + 1;
                }
                A02 = C2so.A02(A0J, A0U, A0T);
            }
            A0U.A00(A02);
            i++;
        }
        return C2so.A0I(A0U, c2k5, A0O);
    }
}
