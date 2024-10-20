package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.8a5, reason: invalid class name */
/* loaded from: 8a5.class */
public final class C8a5 extends 1LH {
    public final Uri A00;
    public final C9I7 A01;
    public final List A02;
    public final C2lu A03;

    public C8a5(Uri uri, C9I7 c9i7, C2lu c2lu, List list) {
        1BK.A1K(list, 3, c9i7);
        this.A00 = uri;
        this.A03 = c2lu;
        this.A02 = list;
        this.A01 = c9i7;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2lO r305 = 2lO.A02;
        C2lu c2lu = this.A03;
        if (c2lu != null) {
            r305 = 7zQ.A0Y((2lO) null, 0S2.A0j, c2lu.A00);
        }
        C2xi A0q = 7zQ.A0q(0);
        if (r305 == r305) {
            r305 = null;
        }
        2lO A0g = 7zL.A0g(r305, A0q);
        C1ro c1ro = C1ro.CENTER;
        Integer num = 0S2.A00;
        2lO A0L = 4YV.A0L(A0g, num, c1ro, 0);
        Integer num2 = 0S2.A0C;
        2lO A0a = 7zS.A0a(4YV.A0L(A0L, num2, false, 1), num, 0);
        long A0E = 7zP.A0E();
        Integer num3 = 0S2.A01;
        2lO A0K = 4YV.A0K(A0a, num3, A0E);
        C2sn A0L2 = 7zR.A0L(c2k5);
        1Iw r0 = A0L2.A00;
        DuU A01 = Dzb.A01(r0);
        2lO A0L3 = 4YV.A0L((2lO) null, num2, false, 1);
        C2sn A0U = 7zQ.A0U(r0);
        for (9ZZ r02 : this.A02) {
            2lO r323 = null;
            2lO A0R = 7zR.A0R(7zT.A0L(7zS.A0V((2lO) null, 7zL.A0i(num3, A0E), num, A0E), 8.0d), AV5.A00(this, r02, 23), 1);
            Uri uri = this.A00;
            Uri uri2 = r02.A01;
            if (11T.A0O(uri, uri2)) {
                long doubleToRawLongBits = Double.doubleToRawLongBits(3.0d);
                long doubleToRawLongBits2 = Double.doubleToRawLongBits(11.0d);
                C6nh A0R2 = 7zO.A0R(A0U.A00, 0);
                C26z c26z = C26z.ALL;
                C1qo c1qo = A0U.AeS().A0E;
                11T.A0A(c1qo);
                A0R2.A08(c26z, -1);
                A0R2.A0A(c26z, C2lu.A01(c1qo, doubleToRawLongBits));
                A0R2.A04(7zN.A03(A0U, doubleToRawLongBits2));
                r323 = 4YV.A0L((2lO) null, num3, A0R2.A01(), 0);
            }
            7zQ.A1G(new QHw(uri2, Float.valueOf(11.0f), 7zN.A0g()), 7zS.A0K(A0U), A0U, A0R.A00(r323));
        }
        A01.A2Y(C2so.A0I(A0U, A0L2, A0L3));
        Dzb dzb = A01.A01;
        dzb.A04 = false;
        dzb.A05 = true;
        dzb.A03 = false;
        dzb.A02 = null;
        return 7zN.A0R(A01.A2W(), A0L2, c2k5, A0K);
    }
}
