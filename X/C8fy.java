package X;

/* renamed from: X.8fy, reason: invalid class name */
/* loaded from: 8fy.class */
public final class C8fy extends 1LH {
    public static final long A03 = 7zP.A0H();
    public static final long A04 = 7zQ.A06();
    public final Integer A00;
    public final String A01;
    public final String A02;

    public C8fy(String str, Integer num, String str2) {
        11T.A0F(str, 1);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = num;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0Y = 7zQ.A0Y(C82m.A04(7zL.A0g((2lO) null, 7zS.A0o(0S2.A00, A1W ? 1 : 0)), 0S2.A0N, 100.0f, A1W ? 1 : 0), 0S2.A01, 7zP.A08());
        long j = A03;
        long j2 = A04;
        2lO A0K = 4YV.A0K(A0Y, 0S2.A04, j);
        Integer num = 0S2.A05;
        2lO A0S = 7zS.A0S(4YV.A0K(A0K, num, j2), A1W ? 1 : 0);
        C2sn A0L = 7zR.A0L(c2k5);
        Integer num2 = this.A00;
        if (num2 == null) {
            num2 = num;
        }
        A0L.A00(new 8YN(num2, 0S2.A0C, 0S2.A0S));
        String str = this.A02;
        2KG r0 = 2KG.A01;
        Integer num3 = 0S2.A0j;
        Integer num4 = 0S2.A0g;
        A0L.A00(new 8A0((2lO) null, r0, str, num3, num4, 2, true));
        String str2 = this.A01;
        return 7zM.A0k(str2 == null ? null : new 8A0((2lO) null, r0, str2, 0S2.A1G, num4, 2, true), A0L, c2k5, A0S);
    }
}
