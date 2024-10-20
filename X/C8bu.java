package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8bu, reason: invalid class name */
/* loaded from: 8bu.class */
public final class C8bu extends 1LH {
    public final 8Jk A00;
    public final MigColorScheme A01;
    public final Function1 A02;
    public final Function1 A03;
    public final boolean A04;
    public final boolean A05;

    public C8bu(8Jk r302, MigColorScheme migColorScheme, Function1 function1, Function1 function12, boolean z, boolean z2) {
        C3o5.A0k(r302, 2, function1);
        this.A01 = migColorScheme;
        this.A00 = r302;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = function1;
        this.A02 = function12;
    }

    public 1LI A0s(C2k5 c2k5) {
        2K3 r309;
        C8m4 c8m4;
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A01;
        2lO A0c = 7zS.A0c(7zL.A0g((2lO) null, 7zL.A0k(num, 1.0f)), num, true);
        C2sn A0L = 7zR.A0L(c2k5);
        C2sn A0K = 7zS.A0K(A0L);
        C2sn A0K2 = 7zS.A0K(A0K);
        CallerContext A0B = CallerContext.A0B("UserInputComponent");
        1Iw AeS = A0K2.AeS();
        5BH A01 = 5BG.A01(AeS);
        C07004ik A00 = C06984ii.A00();
        7zM.A1K(A00, C0A8.A00(7zL.A0A(AeS), 4.0f));
        C06984ii.A01(A01, A00);
        A01.A1W(2132279314);
        A01.A1M(2132279314);
        A01.A0L();
        A01.A2b(A0B);
        8Jk r0 = this.A00;
        Uri uri = null;
        try {
            uri = C0A2.A03(r0.A01);
        } catch (SecurityException unused) {
        }
        A01.A2X(uri);
        2RH r02 = 2RH.A03;
        7zO.A1H(A01, r02);
        C26z c26z = C26z.BOTTOM;
        2RH r03 = 2RH.A07;
        7zO.A1M(A01, r03, c26z);
        A01.A2Q(true);
        A01.A2S(r0.A02);
        7zU.A1A(A01, A0K2);
        8TS A002 = 8oX.A00(AeS);
        MigColorScheme migColorScheme = this.A01;
        A002.A2Z(migColorScheme);
        A002.A2a(3yH.A09(A0K2, 2131962075));
        A002.A0j(1.0f);
        95N r04 = 95N.A03;
        8oX r05 = A002.A01;
        r05.A0G = r04;
        r05.A02 = 2;
        r05.A01 = 7zM.A01();
        2KE r06 = 2KE.A04;
        r05.A0L = r06;
        r05.A08 = 7zL.A0a(AV4.A00(this, 10));
        r05.A0C = 7zL.A0a(AV4.A00(this, 11));
        boolean z = this.A04;
        r05.A0J = new 8KX("", z);
        7zQ.A1D(A002.A2W(), A0K2, A0K);
        1Iw AeS2 = A0K.AeS();
        int i = 2132214025;
        if (C1oy.A00(7zQ.A0J(AeS2))) {
            i = 2132214026;
        }
        int A04 = A0K.B7k().A04(i);
        8O4 A003 = C8n8.A00(AeS2);
        C8n8 c8n8 = A003.A01;
        c8n8.A06 = A04;
        c8n8.A05 = A1W ? 1 : 0;
        C1qo c1qo = A003.A02;
        c8n8.A00 = c1qo.A02(4.0f);
        A003.A01.A01 = c1qo.A02(2.0f);
        A003.A0c();
        C26z c26z2 = C26z.HORIZONTAL;
        A003.A2E(c26z2, A1W ? 1 : 0);
        C26z c26z3 = C26z.TOP;
        A003.A2E(c26z3, 5);
        A003.A2E(c26z, 5);
        A003.A0J();
        C8n8 c8n82 = A003.A01;
        11T.A0A(c8n82);
        7zR.A1D(c8n82, A0K, A0L);
        if (z) {
            2KD A0a = 7zO.A0a(A0L, A1W ? 1 : 0);
            A0a.A32(A1W);
            7zM.A1X(A0a, A0L, 2131966928);
            A0a.A2Y();
            4YU.A1O(A0a, r02, c26z2);
            4YU.A1O(A0a, r03, c26z3);
            A0a.A2y(r06);
            A0a.A2w(C1u7.A05);
            A0a.A2x(migColorScheme);
            A0a.A2Q(true);
            7zN.A1E(A0a, A0L, 2131966928);
            r309 = A0a.A2W();
        } else {
            r309 = null;
        }
        A0L.A00(r309);
        if (this.A05) {
            8Tj A004 = C8m4.A00(A0L.AeS());
            A004.A2Y(migColorScheme.AZc());
            7zO.A1M(A004, 2RH.A04, c26z3);
            c8m4 = 8Tj.A06(A004, migColorScheme);
        } else {
            c8m4 = null;
        }
        return 7zM.A0l(c8m4, A0L, c2k5, A0c);
    }
}
