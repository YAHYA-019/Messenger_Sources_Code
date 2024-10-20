package X;

/* renamed from: X.6nf, reason: invalid class name */
/* loaded from: 6nf.class */
public final class C6nf {
    public 64I A00;
    public final 64J A01;
    public final 64J A02;

    public C6nf(64J r302) {
        64J r0;
        synchronized (r302) {
            r0 = new 64J(r302.A07, r302.A08, r302.A09, r302.A0A, r302.A04);
            r0.A00(r302.A00);
            boolean z = r302.A06;
            synchronized (r0) {
                r0.A06 = z;
            }
            C15h c15h = r302.A02;
            String str = r302.A01;
            boolean z2 = r302.A05;
            boolean z3 = r302.A03;
            boolean z4 = r302.A04;
            synchronized (r0) {
                r0.A02 = c15h;
                r0.A01 = str;
                r0.A05 = z2;
                r0.A03 = z3;
                r0.A04 = z4;
            }
        }
        this.A01 = r0;
        this.A02 = r302;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r0.A06 != r0.A06) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A00(X.C6nf r301) {
        /*
            r0 = r301
            X.64J r0 = r0.A01
            r302 = r0
            r0 = r301
            X.64J r0 = r0.A02
            r303 = r0
            r0 = r302
            monitor-enter(r0)
            r0 = r302
            java.lang.String r0 = r0.A01     // Catch: java.lang.Throwable -> L80
            r304 = r0
            r0 = r303
            java.lang.String r0 = r0.A01     // Catch: java.lang.Throwable -> L80
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)     // Catch: java.lang.Throwable -> L80
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L73
            r0 = r302
            boolean r0 = r0.A05     // Catch: java.lang.Throwable -> L80
            r307 = r0
            r0 = r303
            boolean r0 = r0.A05     // Catch: java.lang.Throwable -> L80
            r306 = r0
            r0 = r307
            r1 = r306
            if (r0 != r1) goto L73
            r0 = r302
            boolean r0 = r0.A03     // Catch: java.lang.Throwable -> L80
            r307 = r0
            r0 = r303
            boolean r0 = r0.A03     // Catch: java.lang.Throwable -> L80
            r306 = r0
            r0 = r307
            r1 = r306
            if (r0 != r1) goto L73
            r0 = r302
            boolean r0 = r0.A04     // Catch: java.lang.Throwable -> L80
            r307 = r0
            r0 = r303
            boolean r0 = r0.A04     // Catch: java.lang.Throwable -> L80
            r306 = r0
            r0 = r307
            r1 = r306
            if (r0 != r1) goto L73
            r0 = r302
            boolean r0 = r0.A06     // Catch: java.lang.Throwable -> L80
            r308 = r0
            r0 = r303
            boolean r0 = r0.A06     // Catch: java.lang.Throwable -> L80
            r307 = r0
            r0 = 1
            r306 = r0
            r0 = r308
            r1 = r307
            if (r0 == r1) goto L79
        L73:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
        L79:
            r0 = r302
            monitor-exit(r0)
            r0 = r306
            r1 = 1
            r0 = r0 ^ r1
            return r0
        L80:
            r305 = move-exception
            r0 = r302
            monitor-exit(r0)
            r0 = r305
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6nf.A00(X.6nf):boolean");
    }
}
