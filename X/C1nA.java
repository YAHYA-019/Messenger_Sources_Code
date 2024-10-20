package X;

import java.util.Set;

/* renamed from: X.1nA, reason: invalid class name */
/* loaded from: 1nA.class */
public abstract class C1nA extends 1nB implements Set {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        if ((r301 instanceof X.C1n9 ? ((X.C1n9) r301).A00.A00 : ((X.3Ce) r301).A00).equals(r302) != false) goto L9;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = r301
            if (r0 == r1) goto L32
            r0 = r301
            r303 = r0
            r0 = r301
            boolean r0 = r0 instanceof X.C1n9
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L36
            r0 = r301
            X.1n9 r0 = (X.C1n9) r0
            r303 = r0
            r0 = r303
            X.1n1 r0 = r0.A00
            java.util.Set r0 = r0.A00
            r305 = r0
        L1e:
            r0 = r305
            r1 = r302
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L34
        L32:
            r0 = 1
            r304 = r0
        L34:
            r0 = r304
            return r0
        L36:
            r0 = r301
            X.3Ce r0 = (X.3Ce) r0
            r303 = r0
            r0 = r303
            java.util.Set r0 = r0.A00
            r305 = r0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1nA.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return (this instanceof C1n9 ? ((C1n9) this).A00.A00 : ((3Ce) this).A00).hashCode();
    }
}
