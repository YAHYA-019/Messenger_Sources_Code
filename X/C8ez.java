package X;

/* renamed from: X.8ez, reason: invalid class name */
/* loaded from: 8ez.class */
public final class C8ez extends 1LH {
    public static final long A01;
    public static final long A02;
    public final String A00;

    static {
        long A08 = 7zQ.A08();
        A02 = A08;
        A01 = A08;
    }

    public C8ez(String str) {
        11T.A0F(str, 1);
        this.A00 = str;
    }

    public 1LI A0s(C2k5 c2k5) {
        int A1W = 7zL.A1W(c2k5);
        Integer num = 0S2.A00;
        2lO A0b = 7zS.A0b(C82m.A06(num, 100.0f, A1W), num, AQU.A00(c2k5, this, new Object[A1W], 25));
        2dP r0 = 2dP.A01;
        Integer num2 = 0S2.A0Y;
        2lO A0L = 4YV.A0L(A0b, num2, r0, A1W);
        long A08 = 7zP.A08();
        2lO A0P = 7zT.A0P(7zT.A0X(A0L, new 2lV(num2, A08), A08), A01, A02);
        C2sn A0L2 = 7zR.A0L(c2k5);
        A0L2.A00((1LI) AQs.A00(c2k5, A0L2, this, new Object[A1W], 27));
        return 7zN.A0N((1LI) AQU.A00(c2k5, this, new Object[A1W], 26), A0L2, c2k5, A0P);
    }
}
