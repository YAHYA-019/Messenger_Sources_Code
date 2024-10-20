package X;

/* loaded from: K9w.class */
public abstract class K9w extends 1nB implements C4u1 {
    @Override // X.C4u1
    public int AIN(Object obj) {
        return ((K9v) this).A03.AIN(obj);
    }

    @Override // X.C4u1
    public int Cdf(Object obj, int i) {
        return ((K9v) this).A03.Cdf(obj, i);
    }

    @Override // X.C4u1
    public boolean CnX(Object obj, int i, int i2) {
        return ((K9v) this).A03.CnX(obj, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (((X.K9v) r301).A03.equals(r302) != false) goto L6;
     */
    @Override // X.C4u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L19
            r0 = r301
            X.K9v r0 = (X.K9v) r0
            X.K9e r0 = r0.A03
            r1 = r302
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L1b
        L19:
            r0 = 1
            r304 = r0
        L1b:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K9w.equals(java.lang.Object):boolean");
    }

    @Override // X.C4u1
    public int hashCode() {
        return ((K9v) this).A03.hashCode();
    }
}
