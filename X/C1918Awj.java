package X;

import com.facebook.auth.usersession.FbUserSession;
import java.util.BitSet;

/* renamed from: X.Awj, reason: case insensitive filesystem */
/* loaded from: Awj.class */
public final class C1918Awj extends 1LH {
    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2lh A00 = C2lc.A00(c2k5, DCh.A00);
        1Iw r0 = c2k5.A05;
        FbUserSession A01 = 1Fw.A01(r0.A0D);
        2lQ r02 = 2lO.A02;
        2lO A0Z = 7zQ.A0Z(7zQ.A0Z(4YV.A0K((2lO) null, 0S2.A04, Double.doubleToRawLongBits(12.0d)), 0S2.A01, new AV8(45, c2k5, this, A01)), 0S2.A00, new AV8(46, c2k5, this, A01));
        C2sn A0U = 7zQ.A0U(r0);
        1Iw r03 = A0U.A00;
        C2ki A002 = C2kV.A00(r03);
        C2kx c2kx = (C2kx) A00.A02;
        A002.A2e(c2kx);
        A002.A2j(true);
        A002.A2h(true);
        7zL.A1K(r03);
        A002.A2d(new B22());
        3wU r04 = new 3wU();
        r04.A01 = 3;
        A002.A2f(r04.A00());
        C1828Au1 c1828Au1 = new C1828Au1(r03, new Az3());
        Az3 az3 = c1828Au1.A01;
        az3.A00 = A01;
        BitSet bitSet = c1828Au1.A02;
        bitSet.set(0);
        az3.A01 = c2kx;
        bitSet.set(1);
        C1rs.A00(bitSet, c1828Au1.A03);
        c1828Au1.A0J();
        A002.A2b(az3);
        return 7zM.A0l(A002.A2W(), A0U, c2k5, A0Z);
    }
}
