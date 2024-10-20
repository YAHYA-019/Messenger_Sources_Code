package X;

/* loaded from: L1t.class */
public final class L1t {
    public final KrV A00 = new KrV();
    public final KrV A01 = new KrV();

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r301.A00.A00.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(X.L1t r301) {
        /*
            r0 = r301
            X.KrV r0 = r0.A01
            X.Lyk r0 = r0.A00
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L24
            r0 = r301
            X.KrV r0 = r0.A00
            X.Lyk r0 = r0.A00
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L28
        L24:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L28:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L1t.A00(X.L1t):boolean");
    }

    public final void A01(LPQ lpq, boolean z) {
        KrV krV = this.A00;
        if (z) {
            if (lpq.A0A != null) {
                krV.A00.add(lpq);
            }
            throw AnonymousClass001.A0N("DepthSortedSet.add called on an unattached node");
        }
        if (krV.A00.contains(lpq)) {
            return;
        }
        KrV krV2 = this.A01;
        if (lpq.A0A != null) {
            krV2.A00.add(lpq);
            return;
        }
        throw AnonymousClass001.A0N("DepthSortedSet.add called on an unattached node");
    }
}
