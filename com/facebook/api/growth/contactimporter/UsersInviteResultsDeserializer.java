package com.facebook.api.growth.contactimporter;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: UsersInviteResultsDeserializer.class */
public class UsersInviteResultsDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public UsersInviteResultsDeserializer() {
        this.A00 = UsersInviteResults.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0021, code lost:
    
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
            java.lang.Class<com.facebook.api.growth.contactimporter.UsersInviteResultsDeserializer> r0 = com.facebook.api.growth.contactimporter.UsersInviteResultsDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.api.growth.contactimporter.UsersInviteResultsDeserializer.A00     // Catch: java.lang.Throwable -> L8a
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> L8a
            r304 = r0
            r0 = r304
            com.facebook.api.growth.contactimporter.UsersInviteResultsDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L8a
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> L8a
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            goto L7b
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L8a
            r306 = r0
            r0 = -934426595(0xffffffffc84dc81d, float:-210720.45)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L72
            java.lang.String r0 = "result"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L8a
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L72
            java.lang.Class<com.facebook.api.growth.contactimporter.UsersInviteResults> r0 = com.facebook.api.growth.contactimporter.UsersInviteResults.class
            r304 = r0
            r0 = r304
            r1 = r305
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L8a
            r305 = r0
            java.lang.Class<com.facebook.api.growth.contactimporter.UsersInviteResult> r0 = com.facebook.api.growth.contactimporter.UsersInviteResult.class
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbM.A0H(r0, r1)     // Catch: java.lang.Exception -> L7e java.lang.Throwable -> L8a
            r305 = r0
            java.util.Map r0 = com.facebook.api.growth.contactimporter.UsersInviteResultsDeserializer.A00     // Catch: java.lang.Throwable -> L8a
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L8a
            goto L24
        L72:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        L7b:
            r0 = r305
            return r0
        L7e:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> L8a
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> L8a java.lang.Throwable -> L8a
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.api.growth.contactimporter.UsersInviteResultsDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
