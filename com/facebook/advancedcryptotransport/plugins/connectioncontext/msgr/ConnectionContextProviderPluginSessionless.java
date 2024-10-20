package com.facebook.advancedcryptotransport.plugins.connectioncontext.msgr;

/* loaded from: ConnectionContextProviderPluginSessionless.class */
public final class ConnectionContextProviderPluginSessionless extends Sessionless {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if ((((X.C0dr) r0.A02.A00.get()).now() - r0.A00) >= com.mapbox.mapboxsdk.location.LocationComponentOptions.STALE_STATE_DELAY_MS) goto L15;
     */
    @Override // com.facebook.advancedcryptotransport.plugins.connectioncontext.msgr.Sessionless
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean MEMConnectionContextProviderImpl_MEMConnectionContextProviderIsPushTriggered() {
        /*
            r301 = this;
            r0 = 66781(0x104dd, float:9.358E-41)
            r302 = r0
            r0 = r302
            java.lang.Object r0 = X.1Bi.A03(r0)
            X.2Fa r0 = (X.2Fa) r0
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            r0 = r303
            boolean r0 = r0.A01     // Catch: java.lang.Throwable -> L61
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L54
            r0 = r303
            X.1Br r0 = r0.A02     // Catch: java.lang.Throwable -> L61
            r304 = r0
            r0 = r304
            X.00i r0 = r0.A00     // Catch: java.lang.Throwable -> L61
            r304 = r0
            r0 = r304
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L61
            r304 = r0
            r0 = r304
            X.0dr r0 = (X.C0dr) r0     // Catch: java.lang.Throwable -> L61
            r304 = r0
            r0 = r304
            long r0 = r0.now()     // Catch: java.lang.Throwable -> L61
            r305 = r0
            r0 = r303
            long r0 = r0.A00     // Catch: java.lang.Throwable -> L61
            r307 = r0
            r0 = r305
            r1 = r307
            long r0 = r0 - r1
            r305 = r0
            r0 = 30000(0x7530, double:1.4822E-319)
            r309 = r0
            r0 = r305
            r1 = r309
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r311 = r0
            r0 = 1
            r302 = r0
            r0 = r311
            if (r0 < 0) goto L58
        L54:
            r0 = 0
            r302 = r0
            r0 = 0
            r304 = r0
        L58:
            r0 = r303
            r1 = 0
            r0.A01 = r1     // Catch: java.lang.Throwable -> L61
            r0 = r303
            monitor-exit(r0)
            r0 = r302
            return r0
        L61:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.advancedcryptotransport.plugins.connectioncontext.msgr.ConnectionContextProviderPluginSessionless.MEMConnectionContextProviderImpl_MEMConnectionContextProviderIsPushTriggered():boolean");
    }
}
