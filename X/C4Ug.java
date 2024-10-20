package X;

/* renamed from: X.4Ug, reason: invalid class name */
/* loaded from: 4Ug.class */
public abstract class C4Ug {
    public static final String A00;

    static {
        String A01 = 4IS.A01("NetworkStateTracker");
        11T.A0A(A01);
        A00 = A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001e, code lost:
    
        if (r0.isConnected() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.C4UQ A00(android.net.ConnectivityManager r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L21
            r0 = r304
            boolean r0 = r0.isConnected()
            r302 = r0
            r0 = 1
            r306 = r0
            r0 = r302
            if (r0 != 0) goto L24
        L21:
            r0 = 0
            r306 = r0
        L24:
            r0 = 0
            r307 = r0
            r0 = r301
            android.net.Network r0 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L46
            r303 = r0
            r0 = r301
            r1 = r303
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r1)     // Catch: java.lang.SecurityException -> L46
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L5d
            r0 = 16
            r302 = r0
            r0 = r308
            r1 = r302
            boolean r0 = r0.hasCapability(r1)     // Catch: java.lang.SecurityException -> L46
            r307 = r0
            goto L5d
        L46:
            r309 = move-exception
            X.4IS r0 = X.4IS.A00()
            java.lang.String r0 = X.C4Ug.A00
            r308 = r0
            java.lang.String r0 = "Unable to validate active network"
            r303 = r0
            r0 = r308
            r1 = r303
            r2 = r309
            int r0 = android.util.Log.e(r0, r1, r2)
        L5d:
            r0 = r301
            boolean r0 = r0.isActiveNetworkMetered()
            r310 = r0
            r0 = r304
            if (r0 == 0) goto L82
            r0 = r304
            boolean r0 = r0.isRoaming()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L82
        L70:
            X.4UQ r0 = new X.4UQ
            r303 = r0
            r0 = r303
            r1 = r306
            r2 = r307
            r3 = r310
            r4 = r305
            r0.<init>(r1, r2, r3, r4)
            r0 = r303
            return r0
        L82:
            r0 = 0
            r305 = r0
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Ug.A00(android.net.ConnectivityManager):X.4UQ");
    }
}
