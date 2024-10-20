package X;

import android.graphics.Typeface;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8fz, reason: invalid class name */
/* loaded from: 8fz.class */
public final class C8fz extends 1LH {
    public final String A00;
    public final Set A01;
    public final Function1 A02;
    public static final long A07 = 7zP.A0A();
    public static final long A05 = 7zP.A08();
    public static final long A06 = 7zQ.A07();
    public static final long A04 = 7zS.A06(16.0f);
    public static final long A03 = 7zP.A0F();

    public C8fz(String str, Set set, Function1 function1) {
        1BL.A1H(str, set, function1);
        this.A00 = str;
        this.A01 = set;
        this.A02 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, new J8q(this, 22));
        long j = A07;
        long j2 = A05;
        boolean A1V = 7zP.A1V(A00);
        int i = 251658240;
        if (A1V) {
            i = 2130706432;
        }
        2lQ r0 = 2lO.A02;
        long j3 = A06;
        Integer num = 0S2.A0G;
        2lO A0R = 7zR.A0R(7zS.A0c(4YV.A0K((2lO) null, num, j3), 0S2.A01, true), new M6y(this, A00, 41), 1);
        1Iw r02 = c2k5.A05;
        8Tk A002 = C8mn.A00(r02);
        A002.A2f(false);
        C8mn c8mn = A002.A01;
        c8mn.A03 = i;
        c8mn.A00 = 7zO.A03(c2k5, j);
        c8mn.A01 = 7zO.A03(c2k5, j2);
        A002.A2Z((-1) << (-1));
        c8mn.A07 = 922746880;
        A002.A2c(50331648);
        c8mn.A05 = -1;
        String str = this.A00;
        int i2 = -16777216;
        if (A1V) {
            i2 = -1;
        }
        Typeface A003 = 2KU.A00(3vP.A00(c2k5));
        long j4 = A04;
        2lO A0K = 4YV.A0K((2lO) null, num, A03);
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(r02, str, 0);
        7zS.A1N(c2k5, A0v, i2, j4);
        A0v.A33(0);
        7zU.A0y(A003, c2k5, A0v, A08);
        7zP.A1G(A0v, 0);
        7zT.A1N(A0v, false, true);
        A002.A2e(7zQ.A0c(A0K, A0v));
        C5z7.A00(A002, A0R);
        return A002.A2W();
    }
}
