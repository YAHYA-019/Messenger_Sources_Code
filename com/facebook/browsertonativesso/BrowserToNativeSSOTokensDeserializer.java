package com.facebook.browsertonativesso;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: BrowserToNativeSSOTokensDeserializer.class */
public class BrowserToNativeSSOTokensDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public BrowserToNativeSSOTokensDeserializer() {
        this.A00 = BrowserToNativeSSOTokens.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0021, code lost:
    
        if (r305 != null) goto L13;
     */
    @Override // com.facebook.common.json.FbJsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.common.json.FbJsonField A0X(java.lang.String r302) {
        /*
            r301 = this;
            java.lang.Class<com.facebook.browsertonativesso.BrowserToNativeSSOTokensDeserializer> r0 = com.facebook.browsertonativesso.BrowserToNativeSSOTokensDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.browsertonativesso.BrowserToNativeSSOTokensDeserializer.A00     // Catch: java.lang.Throwable -> Laf
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Laf
            r304 = r0
            r0 = r304
            com.facebook.browsertonativesso.BrowserToNativeSSOTokensDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Laf
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> Laf
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            goto La0
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> La3 java.lang.Throwable -> Laf
            r306 = r0
            r0 = 3645(0xe3d, float:5.108E-42)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L68
            r0 = 3646(0xe3e, float:5.109E-42)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L97
            java.lang.String r0 = "t2"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La3 java.lang.Throwable -> Laf
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L97
            java.lang.Class<com.facebook.browsertonativesso.BrowserToNativeSSOTokens> r0 = com.facebook.browsertonativesso.BrowserToNativeSSOTokens.class
            r305 = r0
            java.lang.String r0 = "encryptedToken"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La3 java.lang.Throwable -> Laf
            r305 = r0
            goto L86
        L68:
            java.lang.String r0 = "t1"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La3 java.lang.Throwable -> Laf
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L97
            java.lang.Class<com.facebook.browsertonativesso.BrowserToNativeSSOTokens> r0 = com.facebook.browsertonativesso.BrowserToNativeSSOTokens.class
            r305 = r0
            java.lang.String r0 = "plainTextToken"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La3 java.lang.Throwable -> Laf
            r305 = r0
        L86:
            java.util.Map r0 = com.facebook.browsertonativesso.BrowserToNativeSSOTokensDeserializer.A00     // Catch: java.lang.Throwable -> Laf
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Laf
            goto L24
        L97:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        La0:
            r0 = r305
            return r0
        La3:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> Laf
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> Laf java.lang.Throwable -> Laf
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Laf
        Laf:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laf
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.browsertonativesso.BrowserToNativeSSOTokensDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
