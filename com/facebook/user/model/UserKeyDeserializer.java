package com.facebook.user.model;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: UserKeyDeserializer.class */
public class UserKeyDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public UserKeyDeserializer() {
        this.A00 = UserKey.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x002a, code lost:
    
        if (r305 != null) goto L14;
     */
    @Override // com.facebook.common.json.FbJsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.common.json.FbJsonField A0X(java.lang.String r302) {
        /*
            r301 = this;
            java.lang.Class<com.facebook.user.model.UserKeyDeserializer> r0 = com.facebook.user.model.UserKeyDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.user.model.UserKeyDeserializer.A00     // Catch: java.lang.Throwable -> Lb3
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Lb3
            r304 = r0
            r0 = r304
            com.facebook.user.model.UserKeyDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Lb3
            goto L32
        L18:
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb3
            r305 = r0
            r0 = r305
            com.facebook.common.json.FbJsonField r0 = (com.facebook.common.json.FbJsonField) r0     // Catch: java.lang.Throwable -> Lb3
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
        L2d:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            goto L9b
        L32:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lb3
            r306 = r0
            r0 = 3355(0xd1b, float:4.701E-42)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L6e
            r0 = 3575610(0x368f3a, float:5.010497E-39)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L9e
            java.lang.String r0 = "type"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lb3
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            java.lang.Class<com.facebook.user.model.UserKey> r0 = com.facebook.user.model.UserKey.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lb3
            r305 = r0
            goto L8a
        L6e:
            java.lang.String r0 = "id"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lb3
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9e
            java.lang.Class<com.facebook.user.model.UserKey> r0 = com.facebook.user.model.UserKey.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La7 java.lang.Throwable -> Lb3
            r305 = r0
        L8a:
            java.util.Map r0 = com.facebook.user.model.UserKeyDeserializer.A00     // Catch: java.lang.Throwable -> Lb3
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb3
            goto L2d
        L9b:
            r0 = r305
            return r0
        L9e:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            r0 = 0
            return r0
        La7:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> Lb3
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> Lb3 java.lang.Throwable -> Lb3
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb3
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.model.UserKeyDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
