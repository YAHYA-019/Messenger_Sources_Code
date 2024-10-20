package X;

import com.google.common.collect.Multisets$ImmutableEntry;

/* renamed from: X.5ps, reason: invalid class name */
/* loaded from: 5ps.class */
public abstract class C5ps {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A01, r307.A06[r0]) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A00() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0 instanceof com.google.common.collect.Multisets$ImmutableEntry
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L13
            r0 = r301
            r303 = r0
            r0 = r301
            com.google.common.collect.Multisets$ImmutableEntry r0 = (com.google.common.collect.Multisets$ImmutableEntry) r0
            int r0 = r0.count
            return r0
        L13:
            r0 = r301
            r304 = r0
            r0 = r301
            X.5sM r0 = (X.5sM) r0
            r304 = r0
            r0 = r304
            int r0 = r0.A00
            r305 = r0
            r0 = -1
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L56
            r0 = r304
            X.5sJ r0 = r0.A02
            r307 = r0
            r0 = r307
            int r0 = r0.A01
            r302 = r0
            r0 = r305
            r1 = r302
            if (r0 >= r1) goto L56
            r0 = r304
            java.lang.Object r0 = r0.A01
            r308 = r0
            r0 = r307
            java.lang.Object[] r0 = r0.A06
            r1 = r305
            r0 = r0[r1]
            r303 = r0
            r0 = r308
            r1 = r303
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L6d
        L56:
            r0 = r304
            X.5sJ r0 = r0.A02
            r307 = r0
            r0 = r304
            java.lang.Object r0 = r0.A01
            r303 = r0
            r0 = r307
            r1 = r303
            int r0 = r0.A04(r1)
            r302 = r0
            r0 = r304
            r1 = r302
            r0.A00 = r1
        L6d:
            r0 = r304
            int r0 = r0.A00
            r309 = r0
            r0 = r309
            r1 = r306
            if (r0 != r1) goto L7c
            r0 = 0
            return r0
        L7c:
            r0 = r307
            int[] r0 = r0.A04
            r1 = r309
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ps.A00():int");
    }

    public Object A01() {
        return this instanceof Multisets$ImmutableEntry ? ((Multisets$ImmutableEntry) this).element : ((5sM) this).A01;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C5ps) {
            C5ps c5ps = (C5ps) obj;
            if (A00() == c5ps.A00()) {
                z = 4YV.A1Z(A01(), c5ps.A01());
            }
        }
        return z;
    }

    public int hashCode() {
        Object A01 = A01();
        return (A01 == null ? 0 : A01.hashCode()) ^ A00();
    }

    public String toString() {
        String valueOf = String.valueOf(A01());
        int A00 = A00();
        if (A00 != 1) {
            valueOf = AnonymousClass001.A0e(" x ", AnonymousClass001.A0n(valueOf), A00);
        }
        return valueOf;
    }
}
