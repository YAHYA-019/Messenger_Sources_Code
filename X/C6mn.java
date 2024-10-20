package X;

/* renamed from: X.6mn, reason: invalid class name */
/* loaded from: 6mn.class */
public abstract class C6mn {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        if (r0 < r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean A00(X.C6ic r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            int r0 = r0.ordinal()
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 == r1) goto L8c
            r0 = 2
            r302 = r0
            r0 = r304
            r1 = r302
            if (r0 != r1) goto L22
            r0 = 104(0x68, float:1.46E-43)
            r305 = r0
        L22:
            r0 = r305
            java.util.Map r0 = com.facebook.messenger.platform_logger.MPLTracker.getCurrentSyncGroupState(r0)
            r306 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r307 = r0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r309 = r0
            r0 = r307
            r1 = r309
            long r0 = r0 - r1
            r307 = r0
            r0 = r306
            java.lang.String r1 = "sync_status"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            r311 = r0
            r0 = r306
            java.lang.String r1 = "last_sync_timestamp"
            java.lang.Object r0 = r0.get(r1)
            r303 = r0
            r0 = 0
            r312 = r0
            r0 = r303
            if (r0 != 0) goto L5f
            r0 = r312
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r303 = r0
        L5f:
            r0 = r303
            java.lang.Number r0 = (java.lang.Number) r0
            r303 = r0
            r0 = r303
            long r0 = r0.longValue()
            r314 = r0
            r0 = r311
            if (r0 == 0) goto Laf
            r0 = r311
            long r0 = r0.longValue()
            r316 = r0
            r0 = r316
            r1 = r312
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L94
            r0 = r314
            r1 = r312
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L94
            r0 = 0
            return r0
        L8c:
            r0 = 10000(0x2710, float:1.4013E-41)
            r305 = r0
            goto L22
        L94:
            r0 = 2
            long r0 = (long) r0
            r312 = r0
            r0 = r316
            r1 = r312
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = r302
            if (r0 != 0) goto Laf
            r0 = r314
            r1 = r307
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r302 = r0
            r0 = 1
            r305 = r0
            r0 = r302
            if (r0 >= 0) goto Lb2
        Laf:
            r0 = 0
            r305 = r0
        Lb2:
            r0 = r305
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6mn.A00(X.6ic):java.lang.Boolean");
    }
}
