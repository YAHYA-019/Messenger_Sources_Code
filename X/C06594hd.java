package X;

import java.util.HashMap;

/* renamed from: X.4hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4hd.class */
public final class C06594hd {
    public final C1m1 A00;
    public final C0dp A03;
    public final java.util.Map A02 = new HashMap();
    public final java.util.Map A04 = new HashMap();
    public final java.util.Map A01 = new HashMap();

    public C06594hd() {
        C1m1 c1m1 = (C1m1) 1Bi.A03(16782);
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        this.A00 = c1m1;
        this.A03 = c0dp;
    }

    public void A00(CIY ciy) {
        synchronized (this) {
            this.A01.put(ciy, Boolean.TRUE);
        }
    }

    public void A01(CIY ciy) {
        synchronized (this) {
            AnonymousClass001.A18(ciy, this.A03.now(), this.A04);
            A00(ciy);
        }
    }

    public void A02(CIY ciy, long j) {
        synchronized (this) {
            this.A02.put(ciy, Long.valueOf(j));
            this.A01.remove(ciy);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (r301.A03.now() >= (r305 + 1200000)) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A03(X.CIY r302) {
        /*
            r301 = this;
            r0 = r301
            r303 = r0
            r0 = r301
            monitor-enter(r0)
            r0 = r301
            java.util.Map r0 = r0.A02     // Catch: java.lang.Throwable -> L9d
            r304 = r0
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L9d
            r304 = r0
            r0 = r304
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L9d
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L21
            r0 = -1
            long r0 = (long) r0
            r305 = r0
            goto L27
        L21:
            r0 = r304
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L9d
            r305 = r0
        L27:
            r0 = r301
            X.1m1 r0 = r0.A00     // Catch: java.lang.Throwable -> La0
            r307 = r0
            r0 = r307
            boolean r0 = r0.A03()     // Catch: java.lang.Throwable -> La0
            r308 = r0
            r0 = r308
            if (r0 == 0) goto L93
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L9d
            r309 = r0
            r0 = r301
            java.util.Map r0 = r0.A01     // Catch: java.lang.Throwable -> L9d
            r304 = r0
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L9d
            r304 = r0
            r0 = r309
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L9d
            r308 = r0
            r0 = r308
            if (r0 != 0) goto L93
            r0 = r307
            long r0 = r0.A00()     // Catch: java.lang.Throwable -> La0
            r310 = r0
            r0 = r310
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = r308
            if (r0 >= 0) goto L93
            r0 = r301
            X.0dp r0 = r0.A03     // Catch: java.lang.Throwable -> La0
            r304 = r0
            r0 = r304
            long r0 = r0.now()     // Catch: java.lang.Throwable -> La0
            r312 = r0
            r0 = 1200000(0x124f80, double:5.92879E-318)
            r314 = r0
            r0 = r305
            r1 = r314
            long r0 = r0 + r1
            r305 = r0
            r0 = r312
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r316 = r0
            r0 = 1
            r308 = r0
            r0 = r316
            if (r0 < 0) goto L98
        L93:
            r0 = 0
            r308 = r0
            r0 = 0
            r304 = r0
        L98:
            r0 = r303
            monitor-exit(r0)
            r0 = r308
            return r0
        L9d:
            r304 = move-exception
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06594hd.A03(X.CIY):boolean");
    }

    public boolean A04(CIY ciy) {
        boolean z;
        synchronized (this) {
            java.util.Map map = this.A04;
            Long l = (Long) map.get(ciy);
            z = false;
            if (l != null) {
                if (this.A03.now() > l.longValue() + 60000) {
                    map.remove(ciy);
                } else {
                    z = true;
                }
            }
        }
        return z;
    }
}
