package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ce, reason: invalid class name */
/* loaded from: 8ce.class */
public final class C8ce extends 1LH {
    public final 7QI A00;
    public final C2q1 A01;
    public final Integer A02;
    public final boolean A03;
    public final boolean A04;
    public final 1LI A05;
    public final 2lO A06;

    public C8ce(1LI r302, 2lO r303, 7QI r304, C2q1 c2q1, Integer num, boolean z, boolean z2) {
        7zP.A1L(r304, 4, c2q1);
        this.A05 = r302;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = r304;
        this.A02 = num;
        this.A01 = c2q1;
        this.A06 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r0, 16979);
        C2lh A00 = C2lc.A00(c2k5, SGy.A00);
        C2lh A002 = C2lc.A00(c2k5, SGx.A00);
        C2lh A003 = C2lc.A00(c2k5, new AKs(2, A00, A002, migColorScheme, c2k5, this));
        C2lh A004 = C2lc.A00(c2k5, new DCx(A003, 29));
        4FL.A00(c2k5, AQc.A00(A003, this, 43), 7zL.A1Y());
        4FL.A00(c2k5, AQc.A00(A003, this, 44), 4YU.A1b(this.A04));
        boolean z = this.A03;
        4FL.A00(c2k5, AQc.A00(A003, this, 45), 4YU.A1b(z));
        C31f A005 = 5Ot.A00(r0);
        C2q1 c2q1 = this.A01;
        int i = c2q1.A06;
        A005.A2Z(i);
        A005.A2Y(c2q1.A05);
        A005.A2X(c2q1.A00);
        A005.A2a(C2q2.A03);
        A005.A2b(migColorScheme);
        1LI A2W = A005.A2W();
        5BH A01 = 5BG.A01(r0);
        A01.A0L();
        A01.A0m(100.0f);
        A01.A10(100.0f);
        A01.A1e((Drawable) A002.A02);
        A01.A2b(CallerContext.A0B("AvatarCoinFlipComponent"));
        C2sn A0H = 7zS.A0H(7zO.A0O(A01), r0);
        if (z) {
            A0H.A00(A2W);
        }
        2cL r02 = new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0H.A01, false);
        2lO r316 = this.A06;
        long A08 = 7zL.A08(i);
        C02963wp A0i = 7zL.A0i(0S2.A01, A08);
        if (r316 == 2lO.A02) {
            r316 = null;
        }
        2lO A0K = 4YV.A0K(7zL.A0g(r316, A0i), 0S2.A00, A08);
        Integer num = 0S2.A0C;
        2lO A0L = 4YV.A0L(7zQ.A0X(A0K, num, 0.0f), num, false, 1);
        C2sn A0U = 7zQ.A0U(r0);
        1LI r03 = this.A05;
        boolean A1V = 7zP.A1V(A00);
        C00m c00m = (C00m) A004.A02;
        return 7zN.A0R(new QI3(r03, r02, c00m, c00m, A1V), A0U, c2k5, A0L);
    }
}
