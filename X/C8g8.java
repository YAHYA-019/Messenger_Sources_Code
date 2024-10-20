package X;

import android.graphics.Typeface;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8g8, reason: invalid class name */
/* loaded from: 8g8.class */
public final class C8g8 extends 1LH {
    public static final long A04 = 7zP.A0C();
    public final int A00;
    public final long A01;
    public final String A02;
    public final MigColorScheme A03;

    public C8g8(MigColorScheme migColorScheme, String str, int i, long j) {
        11T.A0F(migColorScheme, 4);
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
        this.A03 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        C9l1 c9l1 = (C9l1) 2rO.A00(c2k5, AQc.A00(c2k5, this, 40), 7zL.A1Z(c2k5));
        C2lh A00 = C2lc.A00(c2k5, ALU.A00);
        c9l1.A02 = new 9HQ(A00);
        4FL.A00(c2k5, AQc.A00(c9l1, this, 39), new Object[]{this.A02});
        2lQ r0 = 2lO.A02;
        C1ro c1ro = C1ro.CENTER;
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, c1ro, 0));
        long j = A04;
        2lO A0Y = 7zT.A0Y(A0g, 7zL.A0i(0S2.A15, j), j);
        float A002 = 9BJ.A00(c2k5) * 0.88f;
        float f = 345.0f;
        if (345.0f > A002) {
            f = A002;
        }
        2lO A0Z = 7zQ.A0Z(7zR.A0Q(7zS.A0c(7zS.A0Z(A0Y, num, f), 0S2.A0u, true), 0S2.A0j, 1), 0S2.A01, AV1.A00(c9l1, 35));
        String str = (String) A00.A02;
        2K4 r02 = 2K4.A03;
        long floatToRawIntBits = Float.floatToRawIntBits(10.0f / 7zO.A0I(3vP.A00(c2k5)).density) | 9221683186994511872L;
        int AZc = this.A03.AZc();
        Typeface typeface = Typeface.DEFAULT;
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(c2k5.A05, str, 0);
        7zS.A1N(c2k5, A0v, AZc, Float.floatToRawIntBits(18.0f) | 9221683186994511872L);
        A0v.A33(0);
        7zU.A0y(typeface, c2k5, A0v, A08);
        A0v.A2Y();
        A0v.A2t(0);
        A0v.A39(r02);
        7zP.A1D(A0v);
        A0v.A2c();
        A0v.A01.A01 = 7zO.A03(c2k5, floatToRawIntBits);
        A0v.A2b();
        A0v.A3E(false);
        A0v.A3B(false);
        A0v.A3C(true);
        A0v.A1w(null);
        return 7zQ.A0c(A0Z, A0v);
    }
}
