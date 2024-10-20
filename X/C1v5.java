package X;

/* renamed from: X.1v5, reason: invalid class name */
/* loaded from: 1v5.class */
public final class C1v5 {
    public static final C1v5 A01 = new C1v5();
    public final String[] A00;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r303 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1v5() {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            android.content.Context r0 = X.C0f1.A00()     // Catch: java.lang.IllegalStateException -> L19
            r302 = r0
            r0 = r302
            X.0t9 r0 = X.0Zi.A01(r0)     // Catch: java.lang.IllegalStateException -> L19
            r302 = r0
            r0 = r302
            java.lang.String r0 = r0.A27     // Catch: java.lang.IllegalStateException -> L19
            r303 = r0
            r0 = r303
            X.C0t9.A00(r0)     // Catch: java.lang.IllegalStateException -> L19
            goto L20
        L19:
        L1a:
            java.lang.String r0 = ""
            r303 = r0
            goto L24
        L20:
            r0 = r303
            if (r0 == 0) goto L1a
        L24:
            r0 = r303
            int r0 = r0.length()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L38
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r302 = r0
        L32:
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        L38:
            X.04t r0 = new X.04t
            r302 = r0
            r0 = r302
            java.lang.String r1 = ":"
            r0.<init>(r1)
            r0 = r302
            r1 = r303
            r2 = 0
            java.util.List r0 = r0.A03(r1, r2)
            r305 = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r302 = r0
            r0 = r305
            r1 = r302
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r302 = r0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1v5.<init>():void");
    }

    public Boolean A00(String str) {
        String[] strArr = this.A00;
        int length = strArr.length;
        Boolean bool = null;
        if (length != 0) {
            int i = 0;
            while (true) {
                if (!str.equals(strArr[i])) {
                    i++;
                    if (i >= length) {
                        break;
                    }
                } else {
                    bool = false;
                    break;
                }
            }
        }
        return bool;
    }
}
