package X;

/* loaded from: L28.class */
public final class L28 {
    public int A00;
    public KiQ A01;
    public final LtK A02 = LtK.A02(new KiQ[16]);

    public static final void A00(L28 l28, int i) {
        if (i < 0 || i >= l28.A00) {
            throw JQy.A0m("Index ", ", size ", i, l28.A00);
        }
    }

    public KiQ A01(int i) {
        A00(this, i);
        KiQ kiQ = this.A01;
        if (kiQ != null) {
            int i2 = kiQ.A01;
            if (i < kiQ.A00 + i2 && i2 <= i) {
                return kiQ;
            }
        }
        LtK ltK = this.A02;
        KiQ kiQ2 = (KiQ) ltK.A02[KU8.A00(ltK, i)];
        this.A01 = kiQ2;
        return kiQ2;
    }
}
