package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8b5, reason: invalid class name */
/* loaded from: 8b5.class */
public final class C8b5 extends 1LH {
    public final MigColorScheme A00;
    public final String A01;
    public final C00m A02;
    public final C00m A03;
    public final String A04;

    public C8b5(MigColorScheme migColorScheme, String str, String str2, C00m c00m, C00m c00m2) {
        7zR.A1N(migColorScheme, c00m);
        this.A00 = migColorScheme;
        this.A04 = str;
        this.A02 = c00m;
        this.A01 = str2;
        this.A03 = c00m2;
    }

    public 1LI A0s(C2k5 c2k5) {
        C00m c00m;
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A00;
        C1rh c1rh = null;
        2lO A0g = 7zL.A0g((2lO) null, C82m.A08(num, 100.0f, A1W ? 1 : 0));
        C2sn A0L = 7zR.A0L(c2k5);
        8TZ A00 = C8nr.A00(A0L.A00);
        A00.A2b(this.A04);
        MigColorScheme migColorScheme = this.A00;
        A00.A2a(migColorScheme);
        A00.A0R();
        A00.A0S();
        A00.A10(100.0f);
        A00.A2Z(83S.A00(this, A1W ? 1 : 0));
        A0L.A00(A00.A2W());
        String str = this.A01;
        if (str != null && (c00m = this.A03) != null) {
            2lO A02 = C82m.A02(null, 7zM.A0r(4YV.A06(2RH.A05)), num, 100.0f, A1W ? 1 : 0);
            C2sn A0J = 7zS.A0J(A0L);
            8TV A002 = C8ns.A00(A0J.AeS());
            A002.A2Z(str);
            A002.A2Y(migColorScheme);
            A002.A0R();
            A002.A0S();
            A002.A10(100.0f);
            A002.A01.A03 = C9py.A03(c00m, ActionId.CONNECTIVITY_CHANGED);
            c1rh = 7zN.A0R(A002.A2W(), A0J, A0L, A02);
        }
        return 7zN.A0N(c1rh, A0L, c2k5, A0g);
    }
}
