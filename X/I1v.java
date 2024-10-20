package X;

/* loaded from: I1v.class */
public final class I1v {
    public final HOX A00;
    public final HOY A01;
    public final ClassLoader A02;

    public I1v(HOY hoy, ClassLoader classLoader) {
        this.A02 = classLoader;
        this.A01 = hoy;
        this.A00 = new HOX(classLoader);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A00(java.lang.String r301, X.C00m r302) {
        /*
            java.lang.String r0 = ""
            r303 = r0
            java.lang.String r0 = "ReflectionGuard"
            r304 = r0
            r0 = r302
            boolean r0 = X.GOp.A1b(r0)     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L2b
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L1b
            r0 = r301
            if (r0 == 0) goto L1b
            r0 = r304
            r1 = r301
            int r0 = android.util.Log.e(r0, r1)     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L2b
        L1b:
            r0 = r305
            return r0
        L1e:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r306 = r0
            java.lang.String r0 = "NoSuchMethod: "
            r307 = r0
            goto L35
        L2b:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0k()
            r306 = r0
            java.lang.String r0 = "ClassNotFound: "
            r307 = r0
        L35:
            r0 = r306
            r1 = r307
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r301
            if (r0 != 0) goto L43
            r0 = r303
            r301 = r0
        L43:
            r0 = r301
            r1 = r306
            java.lang.String r0 = X.AnonymousClass001.A0d(r0, r1)
            r307 = r0
            r0 = r304
            r1 = r307
            int r0 = android.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I1v.A00(java.lang.String, X.00m):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x011a, code lost:
    
        if (A00(X.0Pz.A0j("WindowLayoutComponent#addWindowLayoutInfoListener(", android.content.Context.class.getName(), ", androidx.window.extensions.core.util.function.Consumer) is not valid"), new X.JR4(r301, 27)) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        if (A00("FoldingFeature class is not valid", new X.JR4(r301, 25)) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.window.extensions.layout.WindowLayoutComponent A01() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I1v.A01():androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
