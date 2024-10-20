package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8d6, reason: invalid class name */
/* loaded from: 8d6.class */
public final class C8d6 extends 1LH {
    public final int A00;
    public final Drawable A01;
    public final 1LI A02;
    public final 6tM A03;
    public final Integer A04;
    public final String A05;
    public final Function1 A06;

    public C8d6(Drawable drawable, 1LI r303, 6tM r304, Integer num, String str, Function1 function1, int i) {
        1BL.A11(1, r304, function1, drawable);
        this.A03 = r304;
        this.A00 = i;
        this.A06 = function1;
        this.A01 = drawable;
        this.A05 = str;
        this.A02 = r303;
        this.A04 = num;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = this.A04;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(num != null ? num.intValue() : this.A03.A00(0S2.A0i)), 1));
        Integer num2 = 0S2.A0C;
        2lO A0X = 7zQ.A0X(A0g, num2, 0.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw r0 = A0L.A00;
        C2cm A00 = C2cl.A00(r0);
        A00.A2a(this.A00);
        7zL.A1J(A00);
        A00.A1J(2131957307);
        6tM r02 = this.A03;
        A00.A2X(r02.A00(0S2.A08));
        long floatToRawIntBits = Float.floatToRawIntBits(12.0f) | 9221683186994511872L;
        7zS.A1M(A00, 4YV.A0K((2lO) null, 0S2.A06, floatToRawIntBits), 0S2.A1G, this.A06, 1);
        7zO.A19(A00, A0L);
        C2cq A002 = C2cp.A00(r0, A1W ? 1 : 0);
        A002.A2a(this.A01);
        A002.A0v(0.8f);
        7zS.A1K(A002, 4YV.A0K((2lO) null, 0S2.A05, floatToRawIntBits), 0S2.A03, Float.floatToRawIntBits(4.0f) | 9221683186994511872L);
        7zN.A1O(A0L, A002);
        Integer num3 = 0S2.A01;
        2lO A0X2 = 7zQ.A0X((2lO) null, num3, 1.0f);
        C2sn A0U = 7zQ.A0U(r0);
        String A09 = 3yH.A09(A0U, 2131957308);
        1Iw r03 = A0U.A00;
        Context context = r03.A0D;
        Typeface A01 = 2KU.A01(context, num2);
        long A08 = 7zP.A08();
        3yF A0v = 7zM.A0v(r03, A09, A1W ? 1 : 0);
        7zS.A1Q(A0U, A0v, r02.A00(0S2.A0b), Float.floatToRawIntBits(16.0f) | 9221683186994511872L);
        A0v.A33(A1W ? 1 : 0);
        A0v.A34(A01);
        7zU.A1H(A0U, A0v, A1W ? 1 : 0, A08);
        A0v.A2q(1.0f);
        7zV.A11(A0v, A1W);
        7zR.A13((2K8) null, A0U, A0v);
        String str = this.A05;
        int A003 = r02.A00(0S2.A0d);
        Typeface A012 = 2KU.A01(context, num3);
        3yF A0v2 = 7zM.A0v(r03, str, A1W ? 1 : 0);
        7zS.A1Q(A0U, A0v2, A003, floatToRawIntBits);
        A0v2.A33(A1W ? 1 : 0);
        A0v2.A34(A012);
        7zU.A1H(A0U, A0v2, A1W ? 1 : 0, A08);
        A0v2.A2q(1.0f);
        7zV.A11(A0v2, A1W);
        A0v2.A37((2K8) null);
        7zQ.A1E(A0v2.A2W(), A0U, A0L, A0X2);
        A0L.A00(this.A02);
        return C2so.A0H(A0L, c2k5, A0X);
    }
}
