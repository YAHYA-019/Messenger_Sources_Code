package com.facebook.interstitial.api;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: InterstitialNUXFetchResultDeserializer.class */
public class InterstitialNUXFetchResultDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public InterstitialNUXFetchResultDeserializer() {
        this.A00 = InterstitialNUXFetchResult.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0021, code lost:
    
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
            java.lang.Class<com.facebook.interstitial.api.InterstitialNUXFetchResultDeserializer> r0 = com.facebook.interstitial.api.InterstitialNUXFetchResultDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.interstitial.api.InterstitialNUXFetchResultDeserializer.A00     // Catch: java.lang.Throwable -> Lb6
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Lb6
            r304 = r0
            r0 = r304
            com.facebook.interstitial.api.InterstitialNUXFetchResultDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Lb6
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> Lb6
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            goto La7
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r306 = r0
            r0 = 109761319(0x68ad327, float:5.222009E-35)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L66
            r0 = 747380345(0x2c8c1e79, float:3.9824225E-12)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L9e
            java.lang.String r0 = "extra_data"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            java.lang.Class<com.facebook.interstitial.api.InterstitialNUXFetchResult> r0 = com.facebook.interstitial.api.InterstitialNUXFetchResult.class
            r305 = r0
            java.lang.String r0 = "extraData"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r305 = r0
            goto L8d
        L66:
            java.lang.String r0 = "steps"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            java.lang.Class<com.facebook.interstitial.api.InterstitialNUXFetchResult> r0 = com.facebook.interstitial.api.InterstitialNUXFetchResult.class
            r304 = r0
            r0 = r304
            r1 = r305
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r305 = r0
            java.lang.Class<com.facebook.ipc.model.NuxStep> r0 = com.facebook.ipc.model.NuxStep.class
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbM.A0H(r0, r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r305 = r0
        L8d:
            java.util.Map r0 = com.facebook.interstitial.api.InterstitialNUXFetchResultDeserializer.A00     // Catch: java.lang.Throwable -> Lb6
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb6
            goto L24
        L9e:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        La7:
            r0 = r305
            return r0
        Laa:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> Lb6
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> Lb6 java.lang.Throwable -> Lb6
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.interstitial.api.InterstitialNUXFetchResultDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
