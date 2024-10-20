package X;

import java.util.Set;

/* loaded from: K78.class */
public abstract class K78 extends Ly5 implements Set {
    public transient K75 A00;

    @Override // X.Ly5
    public K75 A0B() {
        K75 k75 = this.A00;
        if (k75 == null) {
            k75 = A0C();
            this.A00 = k75;
        }
        return k75;
    }

    public K75 A0C() {
        Object[] array = toArray();
        return K75.A03(array, array.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (containsAll(r0) == false) goto L15;
     */
    @Override // java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = 1
            r303 = r0
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L38
            r0 = r302
            boolean r0 = r0 instanceof java.util.Set
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L36
            r0 = r302
            java.util.Set r0 = (java.util.Set) r0
            r302 = r0
            r0 = r301
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L3a java.lang.Throwable -> L3a
            r305 = r0
            r0 = r302
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L3a java.lang.Throwable -> L3a
            r304 = r0
            r0 = r305
            r1 = r304
            if (r0 != r1) goto L36
            r0 = r301
            r1 = r302
            boolean r0 = r0.containsAll(r1)     // Catch: java.lang.Throwable -> L3a
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L38
        L36:
            r0 = 0
            r303 = r0
        L38:
            r0 = r303
            return r0
        L3a:
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K78.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return KYI.A00(this);
    }
}
