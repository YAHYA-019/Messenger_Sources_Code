package X;

/* loaded from: Kpq.class */
public final class Kpq {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Class A01;
    public final /* synthetic */ Object A02;

    public Kpq(Class cls, Object obj, int i) {
        this.A01 = cls;
        this.A00 = i;
        this.A02 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r302.getClass() != r0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = 1
            r303 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L86
            r0 = r301
            java.lang.Class r0 = r0.A01
            r304 = r0
            X.27F[] r0 = X.27C.A01
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L24
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r306
            r1 = r304
            if (r0 == r1) goto L2a
        L24:
            r0 = 0
            r307 = r0
            r0 = 0
            r305 = r0
        L2a:
            r0 = r307
            if (r0 == 0) goto L7b
            r0 = r302
            int r0 = java.lang.reflect.Array.getLength(r0)
            r307 = r0
            r0 = r301
            int r0 = r0.A00
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 != r1) goto L7b
            r0 = 0
            r309 = r0
            r0 = 0
            r304 = r0
        L47:
            r0 = r309
            r1 = r308
            if (r0 >= r1) goto L86
            r0 = r301
            java.lang.Object r0 = r0.A02
            r1 = r309
            java.lang.Object r0 = java.lang.reflect.Array.get(r0, r1)
            r306 = r0
            r0 = r302
            r1 = r309
            java.lang.Object r0 = java.lang.reflect.Array.get(r0, r1)
            r305 = r0
            r0 = r306
            r1 = r305
            if (r0 == r1) goto L7d
            r0 = r306
            if (r0 == 0) goto L7d
            r0 = r306
            r1 = r305
            boolean r0 = r0.equals(r1)
            r307 = r0
            r0 = r307
            if (r0 != 0) goto L7d
        L7b:
            r0 = 0
            return r0
        L7d:
            r0 = r309
            r1 = 1
            int r0 = r0 + r1
            r309 = r0
            goto L47
        L86:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Kpq.equals(java.lang.Object):boolean");
    }
}
