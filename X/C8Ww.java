package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8Ww, reason: invalid class name */
/* loaded from: 8Ww.class */
public final class C8Ww extends 1LH {
    public final MigColorScheme A00;
    public final C00m A01;
    public final C00m A02;

    public C8Ww(MigColorScheme migColorScheme, C00m c00m, C00m c00m2) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A02 = c00m;
        this.A01 = c00m2;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A00;
        2lO A0T = 7zT.A0T((2lO) null, 7zV.A0U(migColorScheme));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C9zj.A02(A0L, 7zV.A0T(AeS, migColorScheme, A1W), this, 33);
        C8xf A00 = C8xf.A00(7zS.A02(C9ll.A03, migColorScheme));
        String A09 = 3yH.A09(A0L, 2131963337);
        8Tn A08 = 8Tn.A08(AeS, new 8NJ(C9py.A02(3yH.A09(A0L, 2131963334), this, 80), A00, 3yH.A09(A0L, 2131963336), (CharSequence) null, A09, (List) null, A1W), migColorScheme);
        A08.A2X();
        return 8Tn.A06(A0L, c2k5, A0T, A08);
    }
}
