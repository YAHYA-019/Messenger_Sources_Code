package X;

import java.util.Collections;

/* loaded from: L9k.class */
public final class L9k {
    public static final L9k A01 = new L9k(true);
    public static volatile L9k A02;
    public final java.util.Map A00;

    public L9k() {
        this.A00 = AnonymousClass001.A0u();
    }

    public L9k(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r301 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.L9k A00() {
        /*
            X.L9k r0 = X.L9k.A02
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L52
            java.lang.Class<X.L9k> r0 = X.L9k.class
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            X.L9k r0 = X.L9k.A02     // Catch: java.lang.Throwable -> L4d
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L49
            java.lang.String r0 = "getEmptyRegistry"
            r303 = r0
            java.lang.Class r0 = X.KbE.A00     // Catch: java.lang.Throwable -> L4d
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L41
            r0 = 0
            r301 = r0
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L4d
            r301 = r0
            r0 = r304
            r1 = r303
            r2 = r301
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L4d
            r301 = r0
            r0 = 0
            r1 = r301
            java.lang.Object r0 = X.AnonymousClass001.A0S(r0, r1)     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L4d
            r301 = r0
            r0 = r301
            X.L9k r0 = (X.L9k) r0     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L4d
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L41
            goto L45
        L40:
        L41:
            X.L9k r0 = X.L9k.A01     // Catch: java.lang.Throwable -> L4d
            r301 = r0
        L45:
            r0 = r301
            X.L9k.A02 = r0     // Catch: java.lang.Throwable -> L4d
        L49:
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            r0 = r301
            return r0
        L4d:
            r301 = move-exception
            r0 = r302
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            r0 = r301
            throw r0
        L52:
            r0 = r301
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L9k.A00():X.L9k");
    }
}
