package X;

import java.util.Collections;

/* loaded from: L9l.class */
public final class L9l {
    public static final L9l A01 = new L9l(true);
    public static volatile L9l A02;
    public final java.util.Map A00;

    public L9l() {
        this.A00 = AnonymousClass001.A0u();
    }

    public L9l(boolean z) {
        this.A00 = Collections.emptyMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r301 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.L9l A00() {
        /*
            X.L9l r0 = X.L9l.A02
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L52
            java.lang.Class<X.L9l> r0 = X.L9l.class
            r302 = r0
            r0 = r302
            monitor-enter(r0)
            X.L9l r0 = X.L9l.A02     // Catch: java.lang.Throwable -> L4d
            r301 = r0
            r0 = r301
            if (r0 != 0) goto L49
            java.lang.String r0 = "getEmptyRegistry"
            r303 = r0
            java.lang.Class r0 = X.KbH.A00     // Catch: java.lang.Throwable -> L4d
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
            X.L9l r0 = (X.L9l) r0     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L4d
            r301 = r0
            r0 = r301
            if (r0 == 0) goto L41
            goto L45
        L40:
        L41:
            X.L9l r0 = X.L9l.A01     // Catch: java.lang.Throwable -> L4d
            r301 = r0
        L45:
            r0 = r301
            X.L9l.A02 = r0     // Catch: java.lang.Throwable -> L4d
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
        throw new UnsupportedOperationException("Method not decompiled: X.L9l.A00():X.L9l");
    }
}
