package androidx.compose.ui.input.nestedscroll;

import X.2aI;
import X.C00m;
import X.L5f;
import X.LPR;
import X.M3K;

/* loaded from: NestedScrollDispatcher.class */
public final class NestedScrollDispatcher {
    public NestedScrollNode A00;
    public C00m A01 = M3K.A00(this, 34);
    public 2aI A02;

    public static final NestedScrollNode A00(NestedScrollDispatcher nestedScrollDispatcher) {
        NestedScrollNode nestedScrollNode = nestedScrollDispatcher.A00;
        if (nestedScrollNode == null || !((LPR) nestedScrollNode).A08) {
            return null;
        }
        return (NestedScrollNode) L5f.A01(nestedScrollNode);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A01(X.0DR r302, long r303) {
        /*
            r301 = this;
            r0 = 3
            r305 = r0
            r0 = r305
            r1 = r302
            boolean r0 = X.AId.A03(r0, r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lb4
            r0 = r302
            r307 = r0
            r0 = r302
            X.AId r0 = (X.AId) r0
            r307 = r0
            r0 = r307
            int r0 = r0.A00
            r308 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r309 = r0
            r0 = r308
            r1 = r309
            r0 = r0 & r1
            r306 = r0
            r0 = r306
            if (r0 == 0) goto Lb4
            r0 = r308
            r1 = r309
            int r0 = r0 - r1
            r308 = r0
            r0 = r307
            r1 = r308
            r0.A00 = r1
        L3f:
            r0 = r307
            java.lang.Object r0 = r0.A01
            r310 = r0
            X.0Ds r0 = X.0Ds.A02
            r311 = r0
            r0 = r307
            int r0 = r0.A00
            r306 = r0
            r0 = 1
            r309 = r0
            r0 = r306
            if (r0 == 0) goto L83
            r0 = r306
            r1 = r309
            if (r0 != r1) goto Lc5
            r0 = r310
            X.0Dt.A00(r0)
        L66:
            r0 = r310
            X.L8V r0 = (X.L8V) r0
            r310 = r0
            r0 = r310
            long r0 = r0.A00
            r312 = r0
        L74:
            X.L8V r0 = new X.L8V
            r311 = r0
            r0 = r311
            r1 = r312
            r0.<init>(r1)
            r0 = r311
            return r0
        L83:
            r0 = r310
            X.0Dt.A00(r0)
            r0 = r301
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = A00(r0)
            r314 = r0
            r0 = r314
            if (r0 == 0) goto Lae
            r0 = r307
            r1 = r309
            r0.A00 = r1
            r0 = r314
            r1 = r307
            r2 = r303
            java.lang.Object r0 = r0.CD6(r1, r2)
            r310 = r0
            r0 = r310
            r1 = r311
            if (r0 != r1) goto L66
            r0 = r311
            return r0
        Lae:
            r0 = 0
            r312 = r0
            goto L74
        Lb4:
            X.AId r0 = new X.AId
            r307 = r0
            r0 = r307
            r1 = r301
            r2 = r302
            r3 = r305
            r0.<init>(r1, r2, r3)
            goto L3f
        Lc5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A01(X.0DR, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A02(X.0DR r302, long r303, long r305) {
        /*
            r301 = this;
            r0 = 2
            r307 = r0
            r0 = r307
            r1 = r302
            boolean r0 = X.AId.A03(r0, r1)
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lb6
            r0 = r302
            r309 = r0
            r0 = r302
            X.AId r0 = (X.AId) r0
            r309 = r0
            r0 = r309
            int r0 = r0.A00
            r310 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r311 = r0
            r0 = r310
            r1 = r311
            r0 = r0 & r1
            r308 = r0
            r0 = r308
            if (r0 == 0) goto Lb6
            r0 = r310
            r1 = r311
            int r0 = r0 - r1
            r310 = r0
            r0 = r309
            r1 = r310
            r0.A00 = r1
        L3f:
            r0 = r309
            java.lang.Object r0 = r0.A01
            r312 = r0
            X.0Ds r0 = X.0Ds.A02
            r313 = r0
            r0 = r309
            int r0 = r0.A00
            r311 = r0
            r0 = 1
            r308 = r0
            r0 = r311
            if (r0 == 0) goto L83
            r0 = r311
            r1 = r308
            if (r0 != r1) goto Lc7
            r0 = r312
            X.0Dt.A00(r0)
        L66:
            r0 = r312
            X.L8V r0 = (X.L8V) r0
            r312 = r0
            r0 = r312
            long r0 = r0.A00
            r314 = r0
        L74:
            X.L8V r0 = new X.L8V
            r313 = r0
            r0 = r313
            r1 = r314
            r0.<init>(r1)
            r0 = r313
            return r0
        L83:
            r0 = r312
            X.0Dt.A00(r0)
            r0 = r301
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r0 = A00(r0)
            r312 = r0
            r0 = r312
            if (r0 == 0) goto Lb0
            r0 = r309
            r1 = r308
            r0.A00 = r1
            r0 = r312
            r1 = r309
            r2 = r303
            r3 = r305
            java.lang.Object r0 = r0.CCy(r1, r2, r3)
            r312 = r0
            r0 = r312
            r1 = r313
            if (r0 != r1) goto L66
            r0 = r313
            return r0
        Lb0:
            r0 = 0
            r314 = r0
            goto L74
        Lb6:
            X.AId r0 = new X.AId
            r309 = r0
            r0 = r309
            r1 = r301
            r2 = r302
            r3 = r307
            r0.<init>(r1, r2, r3)
            goto L3f
        Lc7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.A02(X.0DR, long, long):java.lang.Object");
    }
}
