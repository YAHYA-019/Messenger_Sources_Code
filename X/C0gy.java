package X;

/* renamed from: X.0gy, reason: invalid class name */
/* loaded from: 0gy.class */
public abstract class C0gy {
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if ('f' == r301) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(char r301) {
        /*
            r0 = 114(0x72, float:1.6E-43)
            r302 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L2a
            r0 = 99
            r302 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L2a
            r0 = 115(0x73, float:1.61E-43)
            r302 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L2a
            r0 = 112(0x70, float:1.57E-43)
            r302 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L2a
            r0 = 102(0x66, float:1.43E-43)
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            r1 = r301
            if (r0 != r1) goto L2c
        L2a:
            r0 = 1
            r302 = r0
        L2c:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0gy.A00(char):boolean");
    }

    public static boolean A01(C0gz c0gz, char c) {
        C0h0[] values = C0h0.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                break;
            }
            C0h0 c0h0 = values[i2];
            if (c0h0.mSymbol != c) {
                i = i2 + 1;
            } else if (c0h0.mCrashType == c0gz) {
                z = true;
            }
        }
        return z;
    }
}
