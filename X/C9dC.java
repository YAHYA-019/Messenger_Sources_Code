package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9dC, reason: invalid class name */
/* loaded from: 9dC.class */
public abstract class C9dC {
    public static final 2cL A00(1LI r301, 1LI r302, C2k5 c2k5, MigColorScheme migColorScheme, Function1 function1) {
        11T.A0F(migColorScheme, 1);
        2lQ r0 = 2lO.A02;
        2lO A0T = 7zT.A0T((2lO) null, 7zS.A0n(migColorScheme));
        C2sn A0L = 7zR.A0L(c2k5);
        A0L.A00(r301);
        A0L.A00(A01(A0L, function1));
        return 7zM.A0l(r302, A0L, c2k5, A0T);
    }

    public static final 2cL A01(C2k6 c2k6, Function1 function1) {
        2lQ r0 = 2lO.A02;
        C1ro c1ro = C1ro.CENTER;
        Integer num = 0S2.A00;
        2lO A0J = 7zT.A0J(7zT.A0T((2lO) null, 7zL.A0u(num, c1ro, 0)), 7zL.A03());
        C2sn A0L = 7zS.A0L(c2k6);
        1Iw r02 = A0L.A00;
        Dud A01 = Dzc.A01(r02);
        A01.A1y(c1ro);
        2lO A0L2 = 4YV.A0L((2lO) null, num, c1ro, 0);
        C2sn A0U = 7zQ.A0U(r02);
        function1.invoke(A0U);
        return 7zM.A0l(7zM.A0w(C2so.A06(A0U, A0L, A0L2), A01), A0L, c2k6, A0J);
    }
}
