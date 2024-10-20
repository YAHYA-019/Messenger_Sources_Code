package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.44k, reason: invalid class name */
/* loaded from: 44k.class */
public abstract class C44k {
    public static final long A00(long j) {
        long j2 = 0;
        if (j > 0) {
            long A02 = C0zc.A02(j, C0za.A02(0zY.A07, 999999L));
            if ((((int) A02) & 1) != 1 || !(!C0zc.A05(A02))) {
                return C0zc.A03(0zY.A05, A02);
            }
            j2 = A02 >> 1;
        }
        return j2;
    }

    public static final Object A01(0DR r301, long j) {
        if (j > 0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C2s7.A02;
            C2s7 c2s7 = new C2s7(1, 0DT.A02(r301));
            c2s7.A0F();
            if (j < Long.MAX_VALUE) {
                A03(c2s7.A01).Cjn(c2s7, j);
            }
            Object A0C = c2s7.A0C();
            if (A0C == 0Ds.A02) {
                return A0C;
            }
        }
        return 04S.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.0Ds A02(X.0DR r301) {
        /*
            r0 = 3
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = X.AIY.A01(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L56
            r0 = r301
            r304 = r0
            r0 = r301
            X.AIY r0 = (X.AIY) r0
            r304 = r0
            r0 = r304
            int r0 = r0.A00
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L56
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r304
            r1 = r305
            r0.A00 = r1
        L35:
            r0 = r304
            java.lang.Object r0 = r0.A01
            r307 = r0
            X.0Ds r0 = X.0Ds.A02
            r308 = r0
            r0 = r304
            int r0 = r0.A00
            r303 = r0
            r0 = 1
            r305 = r0
            r0 = r303
            if (r0 == 0) goto L63
            r0 = r303
            r1 = r305
            if (r0 == r1) goto L9d
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        L56:
            X.AIY r0 = new X.AIY
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r301
            r0.<init>(r1, r2)
            goto L35
        L63:
            r0 = r307
            X.0Dt.A00(r0)
            r0 = r304
            r1 = r305
            r0.A00 = r1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.C2s7.A02
            r309 = r0
            r0 = r304
            X.0DR r0 = X.0DT.A02(r0)
            r307 = r0
            X.2s7 r0 = new X.2s7
            r309 = r0
            r0 = r309
            r1 = r305
            r2 = r307
            r0.<init>(r1, r2)
            r0 = r309
            r0.A0F()
            r0 = r309
            java.lang.Object r0 = r0.A0C()
            r309 = r0
            r0 = r309
            r1 = r308
            if (r0 != r1) goto La2
            r0 = r308
            return r0
        L9d:
            r0 = r307
            X.0Dt.A00(r0)
        La2:
            X.14y r0 = new X.14y
            r309 = r0
            r0 = r309
            r0.<init>()
            r0 = r309
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44k.A02(X.0DR):X.0Ds");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r301 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.2Zt A03(X.0DE r301) {
        /*
            X.0DI r0 = X.0DF.A00
            r302 = r0
            r0 = r301
            r1 = r302
            X.0DD r0 = r0.get(r1)
            r301 = r0
            r0 = r301
            boolean r0 = r0 instanceof X.2Zt
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L1e
            r0 = r301
            X.2Zt r0 = (X.2Zt) r0
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L22
        L1e:
            X.2Zt r0 = X.C2ae.A00
            r301 = r0
        L22:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44k.A03(X.0DE):X.2Zt");
    }
}
