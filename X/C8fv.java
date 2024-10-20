package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8fv, reason: invalid class name */
/* loaded from: 8fv.class */
public final class C8fv extends 1LH {
    public static final long A03;
    public static final long A04;
    public final float A00;
    public final MigColorScheme A01;
    public final String A02;

    static {
        long A0A = 7zP.A0A();
        A03 = A0A;
        A04 = A0A;
    }

    public C8fv(MigColorScheme migColorScheme, String str, float f) {
        11T.A0F(migColorScheme, 2);
        this.A02 = str;
        this.A01 = migColorScheme;
        this.A00 = f;
    }

    public 1LI A0s(C2k5 c2k5) {
        long j = ((C2lu) 2rO.A00(c2k5, AQg.A00(this, c2k5, 47), 7zL.A1Z(c2k5))).A00;
        2lQ r0 = 2lO.A02;
        long j2 = A03;
        2lO A0K = 4YV.A0K(7zT.A0a((2lO) null, 7zL.A0i(0S2.A04, j2), A04), 0S2.A08, j);
        C2sn A0L = 7zR.A0L(c2k5);
        2KD A0r = 7zL.A0r(A0L, 0);
        A0r.A2z(this.A02);
        A0r.A2g();
        A0r.A2x(this.A01);
        A0r.A2b();
        A0r.A2a();
        A0r.A2M(true);
        7zN.A1Q(A0L, A0r);
        return C2so.A02(A0L, c2k5, A0K);
    }
}
