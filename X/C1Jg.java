package X;

/* renamed from: X.1Jg, reason: invalid class name */
/* loaded from: 1Jg.class */
public final class C1Jg implements 1Jh {
    public final 1Br A00 = 1Bq.A00(16511);
    public final 1Br A01;

    public C1Jg() {
        1Br A00 = 1Bu.A00(33035);
        this.A01 = A00;
        A00.A00.get();
    }

    public void Cg3(1Lc r302, String str, String str2, Throwable th, java.util.Map map, int i) {
        11T.A0F(r302, 0);
        11T.A0F(str, 1);
        11T.A0F(str2, 2);
        boolean z = true;
        if (r302.ordinal() != 2) {
            0BS A01 = 0BR.A01(0Pz.A0W("Litho:", str), str2);
            if (r302 != 1Lc.A04) {
                z = false;
            }
            A01.A05 = z;
            if (i > 0) {
                A01.A00 = i;
            }
            ((C01s) this.A00.A00.get()).D0u(new 0BR(A01));
        }
    }
}
