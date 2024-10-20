package X;

/* renamed from: X.0Ak, reason: invalid class name */
/* loaded from: 0Ak.class */
public abstract class C0Ak {
    public static final Object A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0027, code lost:
    
        if (r303 == X.C0Ak.A00) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(X.0AE r301, int r302) {
        /*
            r0 = r301
            int[] r0 = r0.A02
            r303 = r0
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r303
            r1 = r304
            r2 = r302
            int r0 = X.0QP.A00(r0, r1, r2)
            r305 = r0
            r0 = r305
            if (r0 < 0) goto L2a
            r0 = r301
            java.lang.Object[] r0 = r0.A03
            r1 = r305
            r0 = r0[r1]
            r303 = r0
            java.lang.Object r0 = X.C0Ak.A00
            r306 = r0
            r0 = r303
            r1 = r306
            if (r0 != r1) goto L2f
        L2a:
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
        L2f:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Ak.A00(X.0AE, int):java.lang.Object");
    }

    public static final void A01(0AE r301) {
        int i = r301.A00;
        int[] iArr = r301.A02;
        Object[] objArr = r301.A03;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != A00) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        r301.A01 = false;
        r301.A00 = i2;
    }
}
