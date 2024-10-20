package com.facebook.user.profilepic;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: ProfilePicUriWithFilePathDeserializer.class */
public class ProfilePicUriWithFilePathDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public ProfilePicUriWithFilePathDeserializer() {
        this.A00 = ProfilePicUriWithFilePath.class;
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
            java.lang.Class<com.facebook.user.profilepic.ProfilePicUriWithFilePathDeserializer> r0 = com.facebook.user.profilepic.ProfilePicUriWithFilePathDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.user.profilepic.ProfilePicUriWithFilePathDeserializer.A00     // Catch: java.lang.Throwable -> Lb2
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Lb2
            r304 = r0
            r0 = r304
            com.facebook.user.profilepic.ProfilePicUriWithFilePathDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Lb2
            goto L32
        L18:
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lb2
            r305 = r0
            r0 = r305
            com.facebook.common.json.FbJsonField r0 = (com.facebook.common.json.FbJsonField) r0     // Catch: java.lang.Throwable -> Lb2
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
        L2d:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            goto L9a
        L32:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb2
            r306 = r0
            r0 = -1153791349(0xffffffffbb3a8a8b, float:-0.0028463926)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L6d
            r0 = -735662143(0xffffffffd426afc1, float:-2.863653E12)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L9d
            java.lang.String r0 = "filePath"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb2
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9d
            java.lang.Class<com.facebook.user.profilepic.ProfilePicUriWithFilePath> r0 = com.facebook.user.profilepic.ProfilePicUriWithFilePath.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb2
            r305 = r0
            goto L89
        L6d:
            java.lang.String r0 = "profilePicUri"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb2
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L9d
            java.lang.Class<com.facebook.user.profilepic.ProfilePicUriWithFilePath> r0 = com.facebook.user.profilepic.ProfilePicUriWithFilePath.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La6 java.lang.Throwable -> Lb2
            r305 = r0
        L89:
            java.util.Map r0 = com.facebook.user.profilepic.ProfilePicUriWithFilePathDeserializer.A00     // Catch: java.lang.Throwable -> Lb2
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb2
            goto L2d
        L9a:
            r0 = r305
            return r0
        L9d:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            r0 = 0
            return r0
        La6:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> Lb2
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> Lb2 java.lang.Throwable -> Lb2
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb2
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.profilepic.ProfilePicUriWithFilePathDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
