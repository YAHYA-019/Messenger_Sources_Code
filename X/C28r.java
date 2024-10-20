package X;

/* renamed from: X.28r, reason: invalid class name */
/* loaded from: 28r.class */
public final class C28r {
    public C2e4 A00;
    public final 1Br A03 = 1Bq.A00(16794);
    public final 1Br A02 = 1Bq.A00(16962);
    public final 1Br A04 = 1Bq.A00(16919);
    public final 1Br A01 = 1Bq.A00(16782);

    public final boolean A00(boolean z) {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.A00 == null) {
                this.A00 = new C2e4(C1md.A03);
                1mZ r0 = (1mZ) this.A03.A00.get();
                C2e4 c2e4 = this.A00;
                11T.A0D(c2e4);
                synchronized (r0) {
                    r0.A00.add(c2e4);
                }
            }
            C2e4 c2e42 = this.A00;
            if (c2e42 == null || c2e42.A00 != z) {
                if (z) {
                    11T.A0D(c2e42);
                    c2e42.A00 = true;
                } else {
                    11T.A0D(c2e42);
                    c2e42.A00 = false;
                }
                ((2JT) this.A02.A00.get()).A00.A01();
                z2 = true;
            }
        }
        return z2;
    }
}
