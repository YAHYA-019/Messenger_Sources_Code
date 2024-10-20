package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8cv, reason: invalid class name */
/* loaded from: 8cv.class */
public final class C8cv extends 1LH {
    public final MigColorScheme A00;
    public final C00m A01;
    public final C2616Gj5 A02;
    public final C00m A03;
    public final C00m A04;
    public final C00m A05;
    public final Function1 A06;

    public C8cv(C2616Gj5 c2616Gj5, MigColorScheme migColorScheme, C00m c00m, C00m c00m2, C00m c00m3, C00m c00m4, Function1 function1) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
        this.A02 = c2616Gj5;
        this.A06 = function1;
        this.A04 = c00m;
        this.A03 = c00m2;
        this.A01 = c00m3;
        this.A05 = c00m4;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        2lQ r0 = 2lO.A02;
        Integer num = 0S2.A00;
        2lO A0I = 7zT.A0I(C82m.A01(null, C82m.A08(num, 100.0f, 0), 0), 7zL.A02());
        C2sn A0L = 7zR.A0L(c2k5);
        C1rp c1rp2 = C1rp.FLEX_END;
        2lO A04 = C82m.A04(null, num, 100.0f, 0);
        1Iw r02 = A0L.A00;
        C2sn A0U = 7zQ.A0U(r02);
        C83g A00 = C02413v4.A00(A0U.AeS());
        A00.A2Z(2MQ.A11);
        A00.A2Y();
        MigColorScheme migColorScheme = this.A00;
        A00.A2e(migColorScheme);
        A00.A2d(C1u7.A08);
        A00.A2c(C83o.A04);
        C83g.A06(A0U, A00, new J9x(this, 37));
        A0L.A00(C2so.A0X(A0U, A0L, A04, c1rp2));
        2lO A042 = C82m.A04(null, num, 100.0f, 0);
        C2sn A0U2 = 7zQ.A0U(r02);
        C2616Gj5 c2616Gj5 = this.A02;
        boolean z = c2616Gj5.A03;
        if (z) {
            A0U2.A00(new QFZ(migColorScheme));
        } else {
            A0U2.A00(new QGd(c2616Gj5, migColorScheme, this.A06));
        }
        7zN.A1J(A0U2, A0L, A042);
        2lO A043 = C82m.A04(null, num, 100.0f, 0);
        C2sn A0U3 = 7zQ.A0U(r02);
        if (!z) {
            A0U3.A00(new QHF(c2616Gj5, migColorScheme, this.A04, this.A03, this.A05));
        }
        7zN.A1J(A0U3, A0L, A043);
        return C2so.A0C(A0L, c2k5, A0I, c1rp);
    }
}
