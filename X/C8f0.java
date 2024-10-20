package X;

import android.content.Context;

/* renamed from: X.8f0, reason: invalid class name */
/* loaded from: 8f0.class */
public final class C8f0 extends 1LH {
    public final 96O A00;
    public final 8Hn A01;

    public C8f0() {
        this(96O.A03, null);
    }

    public C8f0(96O r302, 8Hn r303) {
        this.A00 = r302;
        this.A01 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        1Iw A0T = 7zO.A0T(c2k5);
        2lO r305 = null;
        2lO A0H = 7zT.A0H(7zL.A0g((2lO) null, 7zQ.A0b()), 0.5d);
        Context context = A0T.A0D;
        2MR r0 = this.A00.backgroundColor;
        2Mg r02 = 2Me.A02;
        if (r0 == null) {
            throw 1BK.A0h();
        }
        2lO A0g = 7zT.A0g(A0H, 0S2.A00, r02.A03(context, r0));
        8Hn r03 = this.A01;
        if (r03 != null) {
            r305 = r03.A01;
        }
        return Qze.A00(C2so.A0E(c2k5, A0g.A00(r305)), A0T, "FDSDivider");
    }
}
