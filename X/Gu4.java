package X;

/* loaded from: Gu4.class */
public final class Gu4 extends Ico {
    public Icw A00;
    public Icw A01;
    public final I1d A02;
    public final boolean A03;

    public Gu4(I1d i1d, boolean z) {
        super(null);
        this.A02 = i1d;
        this.A03 = z;
    }

    public static JMv A00(JMu jMu, I9U i9u, JMv jMv, IFJ ifj, Gu4 gu4, Integer num, Integer num2, int i) {
        Hp4 BKK = jMv.BKK();
        if (BKK == null) {
            gu4.A02.A00(HBq.A0n);
            return jMv;
        }
        int intValue = num != null ? num.intValue() : BKK.A01;
        int intValue2 = num2 != null ? num2.intValue() : BKK.A00;
        Icw icw = gu4.A00;
        if (icw == null) {
            I1d i1d = gu4.A02;
            Gu6 gu6 = new Gu6();
            if (ifj == null) {
                ifj = new Gu5();
            }
            Icw icw2 = new Icw(i1d, gu6, ifj);
            gu4.A00 = icw2;
            icw2.A02(intValue, intValue2, jMv.Ahi());
            gu4.A00.AAv(jMu);
        } else {
            icw.A02(intValue, intValue2, jMv.Ahi());
        }
        if (num != null || num2 != null) {
            gu4.A00.A03 = true;
        }
        if (i != 0) {
            gu4.A00.Cn3(i);
        }
        gu4.A02().A00(i9u.A01(), jMv, gu4.A00);
        return gu4.A00.A0A;
    }
}
