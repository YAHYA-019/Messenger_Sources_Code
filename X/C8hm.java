package X;

import android.content.Context;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8hm, reason: invalid class name */
/* loaded from: 8hm.class */
public final class C8hm extends 1LH {
    public static final long A05 = 7zP.A0A();
    public static final long A06 = 7zP.A0F();
    public final E1r A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C8hm(E1r e1r, String str, boolean z, boolean z2, boolean z3) {
        11T.A0F(e1r, 5);
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A00 = e1r;
    }

    private final C02413v4 A01(C2k6 c2k6, MigColorScheme migColorScheme) {
        C83g A00 = C02413v4.A00(c2k6.AeS());
        A00.A2Z(2MQ.A11);
        A00.A2X();
        A00.A2e(migColorScheme);
        A00.A2d(C1u7.A08);
        A00.A2c(C83o.A04);
        C83g.A08(A00, 83U.A01(c2k6, this, 12));
        return A00.A2V();
    }

    public 1LI A0s(C2k5 c2k5) {
        2K3 r305;
        11T.A0F(c2k5, 0);
        Context A0A = 7zL.A0A(c2k5.A05);
        1BV A0R = 7zL.A0R(A0A, 16980);
        1BV A0R2 = 7zL.A0R(A0A, 67677);
        boolean z = this.A02;
        if (z && this.A04) {
            MigColorScheme A0W = 7zN.A0W(A0R);
            A0R2.get();
            2lQ r0 = 2lO.A02;
            long j = A06;
            Integer num = 0S2.A04;
            float f = 1.0f;
            2lO A0X = 7zQ.A0X(4YV.A0K(7zT.A0a((2lO) null, 7zL.A0i(num, j), j), 0S2.A00, 3yH.A06(c2k5, 2132279303)), 0S2.A01, 1.0f);
            boolean z2 = this.A03;
            if (z2) {
                f = 0.0f;
            }
            2lO A0L = 4YV.A0L(4YV.A0L(32E.A00(A0X, f), 0S2.A0F, Boolean.valueOf(!z2), 1), num, new J9x(this, 19), 1);
            C1rp c1rp = C1rp.SPACE_BETWEEN;
            C1ro c1ro = C1ro.FLEX_START;
            C2sn A0I = 7zS.A0I(c2k5);
            A0I.A00(A01(A0I, A0W));
            return C2so.A0B(A0I, c2k5, A0L, c1ro, c1rp);
        }
        MigColorScheme A0W2 = 7zN.A0W(A0R);
        FFo fFo = (FFo) A0R2.get();
        2lQ r02 = 2lO.A02;
        long j2 = A05;
        Integer num2 = 0S2.A04;
        float f2 = 1.0f;
        2lO A0X2 = 7zQ.A0X(7zS.A0g(num2, j2), 0S2.A01, 1.0f);
        boolean z3 = this.A03;
        if (z3) {
            f2 = 0.0f;
        }
        2lO A0L2 = 4YV.A0L(4YV.A0L(32E.A00(A0X2, f2), 0S2.A0F, Boolean.valueOf(!z3), 1), num2, new J9x(this, 18), 1);
        C2sn A0I2 = 7zS.A0I(c2k5);
        C2sn A0K = 7zS.A0K(A0I2);
        if (fFo.A0R || (z && fFo.A0S)) {
            r305 = null;
        } else {
            2KD A0a = 7zO.A0a(A0K, 0);
            A0a.A2x(A0W2);
            7zP.A1I(A0a, 2131955063);
            r305 = A0a.A2W();
        }
        A0K.A00(r305);
        2KD A0X3 = 7zN.A0X(A0K.A00, A0W2, 0);
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        A0X3.A2z(str);
        A0X3.A2f();
        A0X3.A2b();
        7zN.A1Q(A0K, A0X3);
        7zN.A1H(A0K, A0I2);
        A0I2.A00(A01(A0I2, A0W2));
        return C2so.A0Q(A0I2, c2k5, A0L2);
    }
}
