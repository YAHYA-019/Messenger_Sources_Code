package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Dul.class */
public final class Dul extends 1LH {
    public final String A00;

    public Dul(String str) {
        this.A00 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        Context context = r0.A0D;
        MigColorScheme migColorScheme = (MigColorScheme) 7zN.A0k(context, 16980);
        FFo fFo = (FFo) 7zN.A0k(context, 67677);
        C1ro c1ro = C1ro.CENTER;
        2lQ r02 = 2lO.A02;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A1J, 7zQ.A08());
        C2sn A0U = 7zQ.A0U(r0);
        if (1Br.A06(fFo.A08).AZk(36313905539587268L)) {
            2lO A0L = 4YV.A0L(32E.A00(4YV.A0K((2lO) null, 0S2.A01, 7zP.A0A()), 0.5f), 0S2.A00, c1ro, 0);
            A0U.A00(7zN.A0R(new DvZ(3Eh.A0e, ERC.A03, ERE.A01, 2MR.A1V, (8Hn) null), 7zQ.A0U(r0), c2k5, A0L));
        }
        1Iw r03 = A0U.A00;
        String str = this.A00;
        2KD A0f = 7zR.A0f(r03, str, false);
        A0f.A2f();
        A0f.A2b();
        A0f.A2x(migColorScheme);
        A0f.A2M(true);
        A0f.A2S(str);
        A0f.A16(8.0f);
        A0f.A1A(4.0f);
        7zN.A1Q(A0U, A0f);
        return C2so.A0M(A0U, c2k5, A0K);
    }
}
