package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3OD, reason: invalid class name */
/* loaded from: 3OD.class */
public final class C3OD {
    public C3lA A00;
    public final int A01;
    public final 43Q A02;
    public final C00i A03;
    public final AtomicReference A07;
    public final C00i A05 = 1BQ.A02(16687);
    public final C00i A04 = 1BQ.A02(32888);
    public final C00i A06 = 1BQ.A02(16918);

    public C3OD() {
        1BV A00 = 1BV.A00(85033);
        this.A03 = A00;
        final double Ai7 = F8S.A00((F8S) A00.get()).Ai7(37157213778149658L);
        this.A02 = new 43Q(Ai7) { // from class: X.3Wr
            public double A00;
            public int A01;
            public final double A02;
            public final int A03;

            {
                this.A02 = Ai7;
                this.A03 = Ai7 == 0.0d ? (-1) >>> 1 : (int) Math.ceil(1.0d / Ai7);
                this.A00 = -1.0d;
            }

            public void A6M(double d) {
                double d2;
                double d3 = this.A02;
                double d4 = 1.0d - d3;
                int i = this.A01;
                int i2 = this.A03;
                double d5 = this.A00;
                if (i > i2) {
                    d2 = (d5 * d4) + (d3 * d);
                } else {
                    double d6 = i;
                    d2 = (((d5 * d6) * d4) + d) / ((d6 * d4) + 1.0d);
                }
                this.A00 = d2;
                this.A01 = i + 1;
            }

            public double AYQ() {
                return this.A00;
            }

            public void reset() {
                this.A00 = -1.0d;
                this.A01 = 0;
            }
        };
        this.A07 = new AtomicReference(40H.A07);
        this.A01 = 2yD.A00(F8S.A00((F8S) A00.get()), 36594263824795574L) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x014e, code lost:
    
        if (r311 != ((-1) << (-1))) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap A00() {
        /*
            Method dump skipped, instructions count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3OD.A00():java.util.HashMap");
    }
}
