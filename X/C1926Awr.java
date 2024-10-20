package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.Awr, reason: case insensitive filesystem */
/* loaded from: Awr.class */
public final class C1926Awr extends 1LH {
    public final Bdj A00;
    public final MigColorScheme A01;

    public C1926Awr(Bdj bdj, MigColorScheme migColorScheme) {
        this.A01 = migColorScheme;
        this.A00 = bdj;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A01;
        2lO A0X = 7zQ.A0X(7zL.A0g((2lO) null, 7zV.A0U(migColorScheme)), 0S2.A01, 1.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A00 = C5yv.A00(AeS);
        A00.A2b(migColorScheme);
        A00.A2i(A1W);
        A00.A2c(2MG.A06);
        A00.A2Z(migColorScheme.B4i());
        CxE.A01(A00, this, 42);
        7zN.A1R(A0L, A00);
        C8xf c8xf = new C8xf(null, 7zS.A02(C9ll.A03, migColorScheme));
        String A09 = 3yH.A09(A0L, 2131962068);
        8NJ r0 = new 8NJ(new 8Lf(CZD.A00(this, ActionId.LEGACY_MARKER), 3yH.A09(A0L, 2131962066)), c8xf, 3yH.A09(A0L, 2131962067), (CharSequence) null, A09, (List) null, A1W);
        8Tn A002 = C8nn.A00(AeS);
        A002.A2a(migColorScheme);
        A002.A2Y(r0);
        A002.A2X();
        return 7zM.A0l(A002.A2W(), A0L, c2k5, A0X);
    }
}
