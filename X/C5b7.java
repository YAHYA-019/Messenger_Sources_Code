package X;

/* renamed from: X.5b7, reason: invalid class name */
/* loaded from: 5b7.class */
public final class C5b7 {
    public String A00 = AbstractC00603o4.A00(71);
    public final 0OB A01;
    public final 0Nu A02;

    public C5b7(0OB r302, 0Nu r303) {
        this.A02 = r303;
        this.A01 = r302;
    }

    public 0OB A00(C0B1 c0b1, String str) {
        if (c0b1 == null) {
            return null;
        }
        0OB r0 = this.A01;
        C5b3 c5b3 = (C5b3) r0;
        1Rf A01 = 1RX.A01(c5b3.A00, 0S2.A00, (String) null, this.A00, false);
        c5b3.A01 = A01;
        A01.getClass();
        if (!A01.A0D()) {
            return null;
        }
        this.A02.Cgc(c0b1, r0);
        r0.A56("dimension", str);
        return r0;
    }
}
