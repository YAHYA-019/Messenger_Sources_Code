package X;

/* renamed from: X.41p, reason: invalid class name */
/* loaded from: 41p.class */
public final class C41p {
    public final 0I2 A00 = (0I2) 1Bn.A0A(131093);

    public void A00(String str, long j) {
        11T.A0F(str, 0);
        0I2 r0 = this.A00;
        synchronized (r0) {
            0I2.A00(r0, str).A01 += j;
            r0.A00.fineTimeMs += j;
        }
    }
}
