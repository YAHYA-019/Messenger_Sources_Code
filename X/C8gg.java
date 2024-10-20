package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8gg, reason: invalid class name */
/* loaded from: 8gg.class */
public final class C8gg extends 1LH {
    public static final long A06;
    public static final long A07;
    public static final long A08;
    public static final long A0A;
    public static final long A0B;
    public static final long A0C;
    public static final long A0D;
    public static final long A0E;
    public static final long A0F;
    public static final long A0G;
    public final MigColorScheme A00;
    public final Function1 A01;
    public final Function1 A02;
    public final String A03;
    public final String A04;
    public static final long A05 = Double.doubleToRawLongBits(68.0d);
    public static final long A09 = Double.doubleToRawLongBits(283.0d);

    static {
        long A0A2 = 7zP.A0A();
        A0A = A0A2;
        long A082 = 7zQ.A08();
        A0G = A082;
        A06 = A0A2;
        A0F = 7zP.A0D();
        A0E = 7zQ.A0B();
        A0D = 7zP.A0F();
        A0C = A082;
        A0B = Double.doubleToRawLongBits(15.96d);
        A08 = 7zQ.A06();
        A07 = 7zQ.A07();
    }

    public C8gg(MigColorScheme migColorScheme, String str, Function1 function1, Function1 function12) {
        7zR.A1N(migColorScheme, str);
        this.A00 = migColorScheme;
        this.A04 = "Any plans for this weekend?";
        this.A03 = str;
        this.A01 = function1;
        this.A02 = function12;
    }

    public 1LI A0s(C2k5 c2k5) {
        1Iw A0X = 7zL.A0X(c2k5);
        Object systemService = A0X.A0D.getSystemService("input_method");
        11T.A0I(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        2lQ r0 = 2lO.A02;
        MigColorScheme migColorScheme = this.A00;
        int Awo = migColorScheme.Awo();
        Integer num = 0S2.A00;
        C1rh c1rh = null;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(num, 7zL.A0j(Awo), 1));
        long j = A05;
        Integer num2 = 0S2.A01;
        2lO A0K = 4YV.A0K(4YV.A0K(A0g, num2, j), num, A09);
        C2sn A0U = 7zQ.A0U(A0X);
        2lO A0P = 7zT.A0P((2lO) null, A0A, A0G);
        C2sn A0K2 = 7zS.A0K(A0U);
        2lO A0K3 = 4YV.A0K((2lO) null, num2, A0E);
        1Iw r02 = A0K2.A00;
        C2sn A0U2 = 7zQ.A0U(r02);
        String str = this.A04;
        int B9Q = migColorScheme.B9Q();
        long j2 = A0F;
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(40);
        int B9Q2 = migColorScheme.B9Q();
        AVC A01 = AVC.A01(this, 16);
        AVC A012 = AVC.A01(systemService, 17);
        Typeface typeface = Typeface.DEFAULT;
        11T.A0B(typeface);
        7ZF A013 = 6rU.A01(A0U2.A00, 0);
        7zT.A1O(A013, "", str, B9Q2, B9Q);
        int A04 = 7zO.A04(A0U2, j2);
        6rU r03 = A013.A01;
        r03.A08 = A04;
        r03.A0B = typeface;
        r03.A07 = 1;
        r03.A01 = 8388627;
        r03.A0i = true;
        A013.A2k(false);
        r03.A06 = 1;
        int i = (-1) >>> 1;
        A013.A2Z(i);
        A013.A2Y(1);
        r03.A02 = 6;
        A013.A2d(lengthFilter);
        A013.A01.A0C = null;
        A013.A1w(null);
        A013.A2f(7zL.A0a(A01));
        A013.A01.A0H = 7zL.A0a(A012);
        7zQ.A1F(7zR.A0T(A013), A0U2, A0K2, A0K3);
        2lO A0K4 = 4YV.A0K((2lO) null, 0S2.A08, A0D);
        C2sn A0U3 = 7zQ.A0U(r02);
        Drawable A082 = 7zN.A0A().A08(C1u3.A0I, migColorScheme.AZN());
        2lO A0k = 7zT.A0k((2lO) null, num, num2, A06);
        C2sn A0J = 7zS.A0J(A0U3);
        11T.A0D(A082);
        C2cq A0V = 7zP.A0V(A082, A0J, 0);
        A0V.A2Y();
        A0V.A2X();
        7zQ.A1F(A0V.A2W(), A0J, A0U3, A0k);
        long j3 = A0C;
        long j4 = A0B;
        int B4i = migColorScheme.B4i();
        long A083 = 7zP.A08();
        3yF A0W = 7zP.A0W(A0U3, "Friends highlights only", 0);
        7zS.A1Q(A0U3, A0W, B4i, j3);
        A0W.A33(0);
        7zT.A15(typeface, A0U3, A0W, A083);
        A0W.A2Y();
        7zS.A1W(A0W, false);
        A0W.A2u(i);
        7zV.A0z(A0U3, A0W, j4);
        7zS.A1V(A0W, false);
        7zR.A13((2K8) null, A0U3, A0W);
        7zQ.A1E(C2so.A0P(A0U3, A0K2, A0K4), A0K2, A0U, A0P);
        String str2 = this.A03;
        if (str2.length() > 0) {
            Drawable A084 = 7zN.A0A().A08(C1u3.A5k, migColorScheme.AUz());
            C1ro c1ro = C1ro.FLEX_END;
            2lO A0K5 = 4YV.A0K(7zS.A0W((2lO) null, 7zQ.A0q(0), num, c1ro, 0), num2, j);
            long j5 = A08;
            long j6 = A07;
            Integer num3 = 0S2.A1G;
            2lO A0L = 4YV.A0L(7zT.A0Y(A0K5, 7zL.A0i(num3, j5), j6), num3, new AV7(str2, this, 16), 1);
            C2sn A0J2 = 7zS.A0J(A0U);
            11T.A0D(A084);
            7zV.A0j(A084, A0J2.A00, A0J2);
            c1rh = C2so.A0S(A0J2, A0U, A0L, c1ro);
        }
        return 7zM.A0l(c1rh, A0U, c2k5, A0K);
    }
}
