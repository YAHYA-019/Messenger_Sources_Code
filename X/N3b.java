package X;

/* loaded from: N3b.class */
public class N3b {
    public static final double A00(double d, double d2) {
        return (2.0d / (Math.exp((d2 * (-1.0d)) * d) + 1.0d)) - 1.0d;
    }

    public static Hcc A01(N1D n1d, N3b n3b, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, boolean z4) {
        int i8 = i3;
        int i9 = i6;
        if (i3 > 1 && i4 > 1 && i > 1 && i2 > 1 && i5 > 1 && i6 > 1 && i7 > 1 && n1d != null) {
            if (i3 >= i4) {
                i8 = i4;
            }
            if (i9 >= i7) {
                i9 = i7;
            }
            double d = i8;
            double d2 = (d * 1.0d) / i9;
            double d3 = i5;
            double d4 = 0.0d;
            double log = n1d.A0B + (n1d.A09 * Math.log(d)) + (n1d.A00 * Math.log(50.0d)) + (n1d.A0A * Math.log(d3)) + (n1d.A05 * Math.log(15000.0d)) + (n1d.A06 * Math.log(1800.0d)) + (n1d.A01 * Math.log(i2)) + (n1d.A08 * d2) + (n1d.A07 * ((i * 1.0d) / d3)) + (z4 ? n1d.A04 : 0.0d) + (z ? n1d.A02 : 0.0d);
            if (z3 || z2) {
                d4 = n1d.A03;
            }
            double d5 = log + d4;
            if (d5 > 10.0d && d5 < 100.0d) {
                return new Hcc(n3b, d5);
            }
        }
        return new Hcc(n3b, -1.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0234, code lost:
    
        if (r314 < 100.0d) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.Hcc A02(X.N1C r301, X.N3b r302, int r303, int r304, int r305, int r306, int r307, int r308, int r309, int r310, boolean r311) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N3b.A02(X.N1C, X.N3b, int, int, int, int, int, int, int, int, boolean):X.Hcc");
    }
}
