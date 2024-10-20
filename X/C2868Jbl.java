package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.Jbl, reason: case insensitive filesystem */
/* loaded from: Jbl.class */
public final class C2868Jbl extends C2874Jbr {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2868Jbl(X.LjB r302, int r303) {
        /*
            r301 = this;
            java.lang.Object r0 = X.LEY.A07
            r304 = r0
            r0 = r304
            monitor-enter(r0)
            java.util.List r0 = X.LEY.A03     // Catch: java.lang.Throwable -> L35
            r305 = r0
            r0 = r305
            java.lang.Object r0 = X.0QD.A0I(r0)     // Catch: java.lang.Throwable -> L35
            r306 = r0
            r0 = r306
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch: java.lang.Throwable -> L35
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L29
            r0 = 0
            r307 = r0
            r0 = r305
            r1 = 0
            X.M6m r0 = X.M6m.A00(r0, r1)     // Catch: java.lang.Throwable -> L35
            r306 = r0
        L29:
            r0 = r304
            monitor-exit(r0)
            r0 = r301
            r1 = r302
            r2 = 0
            r3 = r306
            r4 = r303
            r0.<init>(r1, r2, r3, r4)
            return
        L35:
            r307 = move-exception
            r0 = r304
            monitor-exit(r0)
            r0 = r307
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2868Jbl.<init>(X.LjB, int):void");
    }

    @Override // X.C2874Jbr, androidx.compose.runtime.snapshots.Snapshot
    public void A0B() {
        synchronized (LEY.A07) {
            int i = ((Snapshot) this).A01;
            if (i >= 0) {
                LEY.A0D(i);
                ((Snapshot) this).A01 = -1;
            }
        }
    }
}
