package X;

/* renamed from: X.7xo, reason: invalid class name */
/* loaded from: 7xo.class */
public final class C7xo extends 5RZ {
    public final Throwable A00;

    public C7xo(Throwable th) {
        this.A00 = th;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (X.11T.A0O(r301.A00, ((X.C7xo) r302).A00) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.C7xo
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r301
            java.lang.Throwable r0 = r0.A00
            r304 = r0
            r0 = r302
            X.7xo r0 = (X.C7xo) r0
            r302 = r0
            r0 = r302
            java.lang.Throwable r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = X.11T.A0O(r0, r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L2d
        L28:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L2d:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7xo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return AnonymousClass002.A04(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Closed(");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
