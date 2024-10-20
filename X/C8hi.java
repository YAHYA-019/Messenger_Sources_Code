package X;

import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8hi, reason: invalid class name */
/* loaded from: 8hi.class */
public final class C8hi extends 1LH {
    public static final long A03 = 7zP.A0A();
    public final MemoryViewModel A00;
    public final 9lM A01;
    public final MigColorScheme A02;

    public C8hi(MemoryViewModel memoryViewModel, 9lM r303, MigColorScheme migColorScheme) {
        11T.A0F(r303, 3);
        this.A02 = migColorScheme;
        this.A00 = memoryViewModel;
        this.A01 = r303;
    }

    public static final 2cL A01(C1u3 c1u3, C2k6 c2k6, MigColorScheme migColorScheme, String str, C00m c00m) {
        C1u2 A0I = 4YV.A0I();
        2lQ r0 = 2lO.A02;
        2lO A0L = 4YV.A0L(7zS.A0g(0S2.A09, A03), 0S2.A1G, AVB.A01(c00m, 3), 1);
        C2sn A0L2 = 7zS.A0L(c2k6);
        1Iw r02 = A0L2.A00;
        C2cq A00 = C2cp.A00(r02, 0);
        7zM.A1I(c1u3, A0I, A00, migColorScheme.BKg());
        A00.A0l(36.0f);
        7zN.A1O(A0L2, A00);
        2KD A13 = 7zM.A13(r02, str, 0);
        A13.A2e();
        A13.A2i();
        A13.A2q(1);
        7zQ.A1K(A0L2, migColorScheme, A13);
        return C2so.A03(A0L2, c2k6, A0L);
    }

    public 1LI A0s(C2k5 c2k5) {
        String A09;
        C1u3 c1u3;
        int i;
        boolean A1W = 7zL.A1W(c2k5);
        2lO A00 = C82m.A00(7zT.A0T(7zS.A0g(0S2.A04, 7zP.A0A()), 7zL.A0i(0S2.A1J, 7zP.A0F())), A1W ? 1 : 0);
        C2sn A0L = 7zR.A0L(c2k5);
        MigColorScheme migColorScheme = this.A02;
        MemoryViewModel memoryViewModel = this.A00;
        9lM r0 = this.A01;
        1pQ A0h = 7zQ.A0h();
        1Iw AeS = A0L.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        A0U.A00(A01(C1u3.A36, A0U, migColorScheme, 3yH.A09(A0U, 2131957008), new AQd(r0, memoryViewModel, 30)));
        if (7zV.A1C(A0h)) {
            A09 = 3yH.A09(A0U, 2131955276);
            c1u3 = C1u3.A4C;
            i = 29;
        } else {
            A09 = 3yH.A09(A0U, 2131965431);
            c1u3 = C1u3.A2S;
            i = 31;
        }
        7zQ.A1D(A01(c1u3, A0U, migColorScheme, A09, new AQd(r0, memoryViewModel, i)), A0U, A0L);
        int A002 = C0A8.A00(7zL.A0A(AeS), 30.0f);
        C5Ax A003 = 5Av.A00(AeS);
        5Av r02 = A003.A01;
        r02.A00 = A002;
        A003.A2Z(40.0f);
        A003.A2e(migColorScheme.AZN());
        A003.A2f(C2cn.A00(A002, migColorScheme.BKg(), migColorScheme.AZM()));
        A003.A2i(3yH.A09(A0L, 2131959439));
        7zR.A1H(A003, 2KV.A07, A1W);
        A003.A2j(true);
        r02.A05 = 1;
        r02.A0E = C9py.A03(this, ActionId.MESSENGER_THREAD_LIST_DISPLAYED);
        A0L.A00(A003.A2V());
        return C2so.A0Q(A0L, c2k5, A00);
    }
}
