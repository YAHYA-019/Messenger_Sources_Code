package com.facebook.zero.sdk.json;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: JSONObjectImplDeserializer.class */
public class JSONObjectImplDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public JSONObjectImplDeserializer() {
        this.A00 = JSONObjectImpl.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0021, code lost:
    
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
            java.lang.Class<com.facebook.zero.sdk.json.JSONObjectImplDeserializer> r0 = com.facebook.zero.sdk.json.JSONObjectImplDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.zero.sdk.json.JSONObjectImplDeserializer.A00     // Catch: java.lang.Throwable -> L81
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> L81
            r304 = r0
            r0 = r304
            com.facebook.zero.sdk.json.JSONObjectImplDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L81
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> L81
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            goto L72
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L81
            r306 = r0
            r0 = 3386882(0x33ae02, float:4.746033E-39)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L69
            java.lang.String r0 = "node"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L81
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L69
            java.lang.Class<com.facebook.zero.sdk.json.JSONObjectImpl> r0 = com.facebook.zero.sdk.json.JSONObjectImpl.class
            r305 = r0
            java.lang.String r0 = "nodeInner"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> L75 java.lang.Throwable -> L81
            r305 = r0
            java.util.Map r0 = com.facebook.zero.sdk.json.JSONObjectImplDeserializer.A00     // Catch: java.lang.Throwable -> L81
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L81
            goto L24
        L69:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        L72:
            r0 = r305
            return r0
        L75:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> L81
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L81
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> L81
        L81:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L81
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.zero.sdk.json.JSONObjectImplDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}