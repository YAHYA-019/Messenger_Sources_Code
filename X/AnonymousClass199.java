package X;

/* renamed from: X.199, reason: invalid class name */
/* loaded from: 199.class */
public final class AnonymousClass199 implements C0Bb {
    public final Class A00;

    public AnonymousClass199(Class cls) {
        this.A00 = cls;
    }

    @Override // X.C0Bb
    public Class Asa() {
        return this.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (X.11T.A0O(r301.A00, ((X.AnonymousClass199) r302).A00) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.AnonymousClass199
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r301
            java.lang.Class r0 = r0.A00
            r304 = r0
            r0 = r302
            X.199 r0 = (X.AnonymousClass199) r0
            r302 = r0
            r0 = r302
            java.lang.Class r0 = r0.A00
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
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass199.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return 0Pz.A0W(this.A00.toString(), " (Kotlin reflection is not available)");
    }
}
