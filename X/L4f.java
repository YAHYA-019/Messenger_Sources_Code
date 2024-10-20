package X;

import java.util.Arrays;

/* loaded from: L4f.class */
public final class L4f {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final byte[] A06;
    public final char[] A07;

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0036. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013e A[LOOP:0: B:30:0x0131->B:32:0x013e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0163 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L4f(java.lang.String r302, byte[] r303, char[] r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4f.<init>(java.lang.String, byte[], char[], boolean):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L4f(java.lang.String r302, char[] r303) {
        /*
            r301 = this;
            r0 = 128(0x80, float:1.8E-43)
            r304 = r0
            r0 = r304
            byte[] r0 = new byte[r0]
            r305 = r0
            r0 = -1
            r306 = r0
            r0 = r305
            r1 = r306
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r307 = r0
        L16:
            r0 = r303
            int r0 = r0.length
            r308 = r0
            r0 = r307
            r1 = r308
            if (r0 >= r1) goto La4
            r0 = r303
            r1 = r307
            char r0 = r0[r1]
            r309 = r0
            r0 = 1
            r310 = r0
            r0 = r309
            r1 = r304
            boolean r0 = X.AnonymousClass001.A1R(r0, r1)
            r308 = r0
            java.lang.String r0 = "Non-ASCII character: %s"
            r311 = r0
            r0 = r308
            if (r0 == 0) goto L87
            r0 = r305
            r1 = r309
            r0 = r0[r1]
            r308 = r0
            r0 = r308
            r1 = r306
            if (r0 == r1) goto L4c
            r0 = 0
            r310 = r0
        L4c:
            java.lang.String r0 = "Duplicate character: %s"
            r311 = r0
            r0 = r310
            if (r0 == 0) goto L6a
            r0 = r307
            byte r0 = (byte) r0
            r308 = r0
            r0 = r305
            r1 = r309
            r2 = r308
            r0[r1] = r2
            r0 = r307
            r1 = 1
            int r0 = r0 + r1
            r307 = r0
            goto L16
        L6a:
            r0 = r309
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r312 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r312
            r1[r2] = r3
            r312 = r0
            r0 = r311
            r1 = r312
            java.lang.String r0 = X.KYC.A00(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        L87:
            r0 = r309
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r312 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r312
            r1[r2] = r3
            r312 = r0
            r0 = r311
            r1 = r312
            java.lang.String r0 = X.KYC.A00(r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A0L(r0)
            throw r0
        La4:
            r0 = r301
            r1 = r302
            r2 = r305
            r3 = r303
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4f.<init>(java.lang.String, char[]):void");
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof L4f) {
            L4f l4f = (L4f) obj;
            if (this.A05 == l4f.A05 && Arrays.equals(this.A07, l4f.A07)) {
                z = true;
            }
        }
        return z;
    }

    public final int hashCode() {
        boolean z = this.A05;
        int hashCode = Arrays.hashCode(this.A07);
        int i = 1231;
        if (true != z) {
            i = 1237;
        }
        return hashCode + i;
    }

    public final String toString() {
        return this.A04;
    }
}
