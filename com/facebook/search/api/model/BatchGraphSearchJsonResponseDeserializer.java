package com.facebook.search.api.model;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: BatchGraphSearchJsonResponseDeserializer.class */
public class BatchGraphSearchJsonResponseDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public BatchGraphSearchJsonResponseDeserializer() {
        this.A00 = BatchGraphSearchJsonResponse.class;
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
            java.lang.Class<com.facebook.search.api.model.BatchGraphSearchJsonResponseDeserializer> r0 = com.facebook.search.api.model.BatchGraphSearchJsonResponseDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.search.api.model.BatchGraphSearchJsonResponseDeserializer.A00     // Catch: java.lang.Throwable -> Lb6
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Lb6
            r304 = r0
            r0 = r304
            com.facebook.search.api.model.BatchGraphSearchJsonResponseDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Lb6
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
            r0 = -1857640538(0xffffffff9146a7a6, float:-1.5671107E-28)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L6f
            r0 = 3076010(0x2eefaa, float:4.310408E-39)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L9e
            java.lang.String r0 = "data"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            java.lang.Class<com.facebook.search.api.model.BatchGraphSearchJsonResponse> r0 = com.facebook.search.api.model.BatchGraphSearchJsonResponse.class
            r304 = r0
            r0 = r304
            r1 = r305
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r305 = r0
            java.lang.Class<com.facebook.search.api.model.GraphSearchTypeaheadJsonResult> r0 = com.facebook.search.api.model.GraphSearchTypeaheadJsonResult.class
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbM.A0H(r0, r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r305 = r0
            goto L8d
        L6f:
            java.lang.String r0 = "summary"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            java.lang.Class<com.facebook.search.api.model.BatchGraphSearchJsonResponse> r0 = com.facebook.search.api.model.BatchGraphSearchJsonResponse.class
            r305 = r0
            java.lang.String r0 = "numTopResultsToShow"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> Laa java.lang.Throwable -> Lb6
            r305 = r0
        L8d:
            java.util.Map r0 = com.facebook.search.api.model.BatchGraphSearchJsonResponseDeserializer.A00     // Catch: java.lang.Throwable -> Lb6
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.search.api.model.BatchGraphSearchJsonResponseDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
