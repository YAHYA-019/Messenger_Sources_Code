package X;

import android.graphics.Typeface;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ew, reason: invalid class name */
/* loaded from: 8ew.class */
public final class C8ew extends 1LH {
    public final MigColorScheme A00;
    public static final long A02 = Float.floatToRawIntBits(22.0f) | 9221683186994511872L;
    public static final long A01 = Float.floatToRawIntBits(26.0f) | 9221683186994511872L;

    public C8ew(MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A00 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        C1ro c1ro = C1ro.CENTER;
        Integer num = 0S2.A00;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, c1ro, A1W ? 1 : 0));
        C2sn A0L = 7zR.A0L(c2k5);
        float A00 = 9BJ.A00(A0L) * 0.9f;
        float f = 345.0f;
        if (345.0f > A00) {
            f = A00;
        }
        2lO A0Q = 7zR.A0Q(7zS.A0c(7zS.A0Z((2lO) null, num, f), 0S2.A0u, true), 0S2.A0j, 1);
        String A09 = 3yH.A09(A0L, 2131960315);
        long j = A02;
        long j2 = A01;
        int AZc = this.A00.AZc();
        Typeface typeface = Typeface.DEFAULT;
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(A0L.AeS(), A09, A1W ? 1 : 0);
        7zS.A1Q(A0L, A0v, AZc, j);
        A0v.A33(A1W ? 1 : 0);
        7zT.A15(typeface, A0L, A0v, A08);
        A0v.A2Y();
        7zS.A1W(A0v, A1W);
        A0v.A2u(1);
        7zV.A0z(A0L, A0v, j2);
        7zS.A1V(A0v, A1W);
        7zS.A1B((2K8) null, A0L, A0Q, A0v);
        return C2so.A0I(A0L, c2k5, A0g);
    }
}
