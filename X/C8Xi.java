package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.Constants;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8Xi, reason: invalid class name */
/* loaded from: 8Xi.class */
public final class C8Xi extends 1LH {
    public final MigColorScheme A00;
    public final Function1 A01;
    public final C2iw A02;

    public C8Xi(C2iw c2iw, MigColorScheme migColorScheme, Function1 function1) {
        11T.A0F(c2iw, 2);
        this.A00 = migColorScheme;
        this.A02 = c2iw;
        this.A01 = function1;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        2lQ r0 = 2lO.A02;
        2RH r02 = 2RH.A05;
        long A0D = 7zQ.A0D(r02);
        Integer num = 0S2.A04;
        2lO A0T = 7zT.A0T((2lO) null, 7zL.A0i(num, A0D));
        long A04 = 7zU.A04();
        Integer num2 = 0S2.A15;
        2lO A0K = 4YV.A0K(A0T, num2, A04);
        Integer num3 = 0S2.A00;
        2lO A042 = C82m.A04(A0K, num3, 100.0f, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        8Tk A00 = C8mn.A00(A0L.A00);
        A00.A10(100.0f);
        MigColorScheme migColorScheme = this.A00;
        8Tk.A07(A00, migColorScheme);
        A00.A01.A03 = migColorScheme.Abp();
        A00.A2Y(4YU.A00(r02));
        A00.A2X(24.0f);
        C2iw c2iw = this.A02;
        User A0v = 7zQ.A0v();
        long A06 = 4YV.A06(2RH.A03);
        long A062 = 4YV.A06(2RH.A04);
        long A063 = 7zQ.A06();
        2lO A0V = 7zS.A0V((2lO) null, 7zL.A0i(num, A06), num2, A062);
        Integer num4 = 0S2.A1J;
        2lO A02 = C82m.A02(A0V, 7zL.A0i(num4, A063), num3, 100.0f, 0);
        C2sn A0J = 7zS.A0J(A0L);
        2lO A043 = C82m.A04(7zT.A0d((2lO) null, 2RH.A07, num4), num3, 100.0f, 0);
        C2sn A0J2 = 7zS.A0J(A0J);
        String A07 = A0v.A07();
        if (A07 == null) {
            A07 = "";
        }
        Uri uri = null;
        try {
            uri = C0A2.A03(A07);
        } catch (SecurityException unused) {
        }
        C1u2 A0I = 4YV.A0I();
        5BH A0B = 7zN.A0B(uri, A0J2.AeS());
        A0B.A0l(32.0f);
        A0B.A0z(32.0f);
        C07004ik A0I2 = 7zR.A0I();
        A0I2.A03(A0I.A03(C1u3.A02));
        ((C07014il) A0I2).A04 = 5BK.A05;
        C06984ii.A01(A0B, A0I2);
        A0B.A2b(CallerContext.A0B("PromptAddResponseCardComponent"));
        4YU.A1O(A0B, r02, C26z.END);
        7zU.A1A(A0B, A0J2);
        2KD A0Y = 7zN.A0Y(A0J2.A00, false);
        A0Y.A2z(A0v.A0X.displayName);
        A0Y.A2x(migColorScheme);
        A0Y.A2j();
        A0Y.A2b();
        7zN.A1Q(A0J2, A0Y);
        A0J.A00(C2so.A0H(A0J2, A0J, A043));
        8TI A002 = 8oZ.A00(A0J.A00);
        A002.A2Z(migColorScheme);
        8oZ r03 = A002.A01;
        r03.A01 = Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
        r03.A00 = 6;
        r03.A04 = 2;
        A002.A10(100.0f);
        A002.A1w(c2iw);
        A002.A1m(7zL.A0a(AV8.A00(A0J, this, c2iw, 41)));
        r03.A0A = 7zL.A0a(new AR2(this, 16));
        A0J.A00(A002.A2W());
        A00.A2e(C2so.A05(A0J, A0L, A02));
        return 7zM.A0l(A00.A2W(), A0L, c2k5, A042);
    }
}
