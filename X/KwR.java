package X;

/* loaded from: KwR.class */
public abstract class KwR {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00df, code lost:
    
        if (r0 != 3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(X.6aO r301, X.C6a5[] r302, long r303) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KwR.A00(X.6aO, X.6a5[], long):void");
    }

    public static void A01(6aO r301, C6a5[] c6a5Arr, long j) {
        int A07 = r301.A07();
        if ((A07 & 64) != 0) {
            r301.A0Q(1);
            int i = (A07 & 31) * 3;
            int i2 = r301.A01;
            for (C6a5 c6a5 : c6a5Arr) {
                r301.A0P(i2);
                c6a5.Cj9(r301, i);
                if (j != -9223372036854775807L) {
                    c6a5.CjG(null, 1, i, 0, j);
                }
            }
        }
    }
}
