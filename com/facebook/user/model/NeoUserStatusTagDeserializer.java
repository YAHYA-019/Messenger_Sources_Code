package com.facebook.user.model;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: NeoUserStatusTagDeserializer.class */
public class NeoUserStatusTagDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public NeoUserStatusTagDeserializer() {
        this.A00 = NeoUserStatusTag.class;
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
            java.lang.Class<com.facebook.user.model.NeoUserStatusTagDeserializer> r0 = com.facebook.user.model.NeoUserStatusTagDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.user.model.NeoUserStatusTagDeserializer.A00     // Catch: java.lang.Throwable -> Laa
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Laa
            r304 = r0
            r0 = r304
            com.facebook.user.model.NeoUserStatusTagDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Laa
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> Laa
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            goto L9b
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Laa
            r306 = r0
            r0 = 3355(0xd1b, float:4.701E-42)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L65
            r0 = 96632902(0x5c28046, float:1.8290793E-35)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L92
            java.lang.String r0 = "emoji"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Laa
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L92
            java.lang.Class<com.facebook.user.model.NeoUserStatusTag> r0 = com.facebook.user.model.NeoUserStatusTag.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Laa
            r305 = r0
            goto L81
        L65:
            java.lang.String r0 = "id"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Laa
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L92
            java.lang.Class<com.facebook.user.model.NeoUserStatusTag> r0 = com.facebook.user.model.NeoUserStatusTag.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Laa
            r305 = r0
        L81:
            java.util.Map r0 = com.facebook.user.model.NeoUserStatusTagDeserializer.A00     // Catch: java.lang.Throwable -> Laa
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Laa
            goto L24
        L92:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        L9b:
            r0 = r305
            return r0
        L9e:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> Laa
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> Laa java.lang.Throwable -> Laa
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Laa
        Laa:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.NeoUserStatusTagDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
