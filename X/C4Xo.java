package X;

/* renamed from: X.4Xo, reason: invalid class name */
/* loaded from: 4Xo.class */
public final class C4Xo implements 0Jf {
    public final int A00;
    public final Object A01;

    public C4Xo(C4Fm c4Fm, int i) {
        this.A00 = i;
        this.A01 = c4Fm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (((X.C4Xo) r302).A00 != r305) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r302
            r304 = r0
            r0 = r303
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L74;
                default: goto L20;
            }
        L20:
            r0 = 2
            r305 = r0
        L23:
            r0 = r302
            boolean r0 = r0 instanceof X.C4Xo
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L40
            r0 = r304
            X.4Xo r0 = (X.C4Xo) r0
            r304 = r0
            r0 = r304
            int r0 = r0.A00
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            r1 = r305
            if (r0 == r1) goto L45
        L40:
            r0 = 0
            r303 = r0
            r0 = 0
            r307 = r0
        L45:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L71
            r0 = r302
            boolean r0 = r0 instanceof X.0Jf
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L71
            r0 = r301
            X.00l r0 = r0.getFunctionDelegate()
            r304 = r0
            r0 = r302
            X.0Jf r0 = (X.0Jf) r0
            r302 = r0
            r0 = r302
            X.00l r0 = r0.getFunctionDelegate()
            r307 = r0
            r0 = r304
            r1 = r307
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
        L71:
            r0 = r306
            return r0
        L74:
            r0 = 1
            r305 = r0
            goto L23
        L7a:
            r0 = 0
            r305 = r0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Xo.equals(java.lang.Object):boolean");
    }

    public final C00l getFunctionDelegate() {
        return new 01I(0, this.A01, C4Fm.class, "invalidateDrawerContents", "invalidateDrawerContents()V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
