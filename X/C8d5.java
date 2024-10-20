package X;

import android.graphics.Typeface;

/* renamed from: X.8d5, reason: invalid class name */
/* loaded from: 8d5.class */
public final class C8d5 extends 1LH {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Typeface A03;
    public final 1LI A04;
    public final 2lO A05;
    public final String A06;

    public C8d5(Typeface typeface, 1LI r303, 2lO r304, String str, int i, long j, long j2) {
        11T.A0F(typeface, 4);
        this.A04 = r303;
        this.A00 = i;
        this.A02 = j;
        this.A03 = typeface;
        this.A01 = j2;
        this.A05 = r304;
        this.A06 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A01;
        2lO A00 = C82m.A00(7zL.A0g((2lO) null, 7zL.A0k(num, 1.0f)), A1W ? 1 : 0).A00(this.A05);
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A0c = 7zS.A0c(7zQ.A0X((2lO) null, num, 1.0f), 0S2.A0u, true);
        C2sn A0K = 7zS.A0K(A0L);
        2lO A0K2 = 4YV.A0K((2lO) null, 0S2.A1J, this.A01);
        String str = this.A06;
        int i = this.A00;
        long j = this.A02;
        Typeface typeface = this.A03;
        long A08 = 7zP.A08();
        3yF A0W = 7zP.A0W(A0K, str, A1W ? 1 : 0);
        7zS.A1Q(A0K, A0W, i, j);
        A0W.A33(A1W ? 1 : 0);
        A0W.A34(typeface);
        7zU.A1H(A0K, A0W, A1W ? 1 : 0, A08);
        A0W.A2q(1.0f);
        7zT.A1M(A0W, A1W);
        7zS.A1B((2K8) null, A0K, A0K2, A0W);
        A0L.A00(C2so.A05(A0K, A0L, A0c));
        return 7zM.A0o(this.A04, A0L, c2k5, A00);
    }
}
