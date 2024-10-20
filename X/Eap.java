package X;

/* loaded from: Eap.class */
public abstract class Eap {
    public static int A00 = 255;
    public static Boolean A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r305 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(X.1YC r301, java.util.concurrent.atomic.AtomicInteger r302) {
        /*
            int r0 = X.C1Y6.A00
            r303 = r0
            int r0 = X.Eap.A00
            r304 = r0
            r0 = r304
            r1 = r303
            if (r0 != r1) goto L1d
            java.lang.Boolean r0 = X.Eap.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L1d
        L17:
            r0 = r305
            boolean r0 = r0.booleanValue()
            return r0
        L1d:
            java.lang.Boolean r0 = X.Eap.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2c
            r0 = r304
            r1 = r303
            if (r0 == r1) goto L65
        L2c:
            r0 = r302
            int r0 = r0.getAndIncrement()
            r306 = r0
            java.lang.String r0 = "com.facebook.messaging.fxcal.plugins.bloks.FxcalBloksKillSwitch"
            r305 = r0
            java.lang.String r0 = "messaging.fxcal.bloks.FxcalBloksKillSwitch"
            r307 = r0
            r0 = r301
            r1 = r305
            r2 = r307
            r3 = r306
            r0.A05(r1, r2, r3)
            r0 = 0
            r308 = r0
            r0 = 1
            r309 = r0
            r0 = r309
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L72
            r305 = r0
            r0 = r305
            X.Eap.A01 = r0     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L72
            r0 = r303
            X.Eap.A00 = r0     // Catch: java.lang.Exception -> L6d java.lang.Throwable -> L72
            r0 = r301
            r1 = r305
            r2 = 0
            r3 = r307
            r4 = r306
            r0.A01(r1, r2, r3, r4)
        L65:
            java.lang.Boolean r0 = X.Eap.A01
            r305 = r0
            goto L17
        L6d:
            r308 = move-exception
            r0 = r308
            throw r0     // Catch: java.lang.Throwable -> L72
        L72:
            r310 = move-exception
            java.lang.Boolean r0 = X.Eap.A01
            r305 = r0
            r0 = r301
            r1 = r305
            r2 = r308
            r3 = r307
            r4 = r306
            r0.A01(r1, r2, r3, r4)
            r0 = r310
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Eap.A00(X.1YC, java.util.concurrent.atomic.AtomicInteger):boolean");
    }
}
