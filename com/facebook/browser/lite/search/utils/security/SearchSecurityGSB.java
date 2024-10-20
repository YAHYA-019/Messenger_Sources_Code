package com.facebook.browser.lite.search.utils.security;

/* loaded from: SearchSecurityGSB.class */
public abstract class SearchSecurityGSB {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Boolean A00(X.0DR r301) {
        /*
            r0 = 10
            r302 = r0
            r0 = r302
            r1 = r301
            boolean r0 = X.AIg.A05(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L55
            r0 = r301
            r304 = r0
            r0 = r301
            X.AIg r0 = (X.AIg) r0
            r304 = r0
            r0 = r304
            int r0 = r0.A00
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L55
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r304
            r1 = r305
            r0.A00 = r1
        L36:
            r0 = r304
            java.lang.Object r0 = r0.A03
            r307 = r0
            r0 = r304
            int r0 = r0.A00
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L97
            r0 = r305
            r1 = r303
            if (r0 != r1) goto L93
            goto L63
        L55:
            X.AIg r0 = new X.AIg
            r304 = r0
            r0 = r304
            r1 = 0
            r2 = r301
            r3 = r302
            r0.<init>(r1, r2, r3)
            goto L36
        L63:
            r0 = r307
            X.0Dt.A00(r0)     // Catch: java.lang.Exception -> La2
            r0 = r307
            X.K2S r0 = (X.K2S) r0     // Catch: java.lang.Exception -> La2
            r307 = r0
            r0 = r307
            java.util.ArrayList r0 = r0.A00()     // Catch: java.lang.Exception -> La2
            r308 = r0
            r0 = r308
            boolean r0 = X.7zM.A1b(r0)     // Catch: java.lang.Exception -> La2
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8e
            java.lang.String r0 = "blockedDomains"
            r308 = r0
            r0 = r308
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0Q(r0)     // Catch: java.lang.Exception -> La2
            r308 = r0
            r0 = r308
            throw r0     // Catch: java.lang.Exception -> La2
        L8e:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L93:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        L97:
            r0 = r307
            X.0Dt.A00(r0)
            java.lang.String r0 = "safeNetKey"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0Q(r0)
            throw r0
        La2:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browser.lite.search.utils.security.SearchSecurityGSB.A00(X.0DR):java.lang.Boolean");
    }
}
