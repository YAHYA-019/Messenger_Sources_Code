package com.facebook.user.profilepic;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: PicSquareDeserializer.class */
public class PicSquareDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public PicSquareDeserializer() {
        this.A00 = PicSquare.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
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
            java.lang.Class<com.facebook.user.profilepic.PicSquareDeserializer> r0 = com.facebook.user.profilepic.PicSquareDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.user.profilepic.PicSquareDeserializer.A00     // Catch: java.lang.Throwable -> L9d
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> L9d
            r304 = r0
            r0 = r304
            com.facebook.user.profilepic.PicSquareDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L9d
            goto L32
        L18:
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L9d
            r305 = r0
            r0 = r305
            com.facebook.common.json.FbJsonField r0 = (com.facebook.common.json.FbJsonField) r0     // Catch: java.lang.Throwable -> L9d
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
        L2d:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            goto L85
        L32:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L9d
            r306 = r0
            r0 = 151750859(0x90b88cb, float:1.6795836E-33)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L88
            java.lang.String r0 = "picSquareUrls"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L9d
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L88
            java.lang.Class<com.facebook.user.profilepic.PicSquare> r0 = com.facebook.user.profilepic.PicSquare.class
            r305 = r0
            java.lang.String r0 = "mPicSquareUrlsWithSizes"
            r304 = r0
            r0 = r305
            r1 = r304
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L9d
            r308 = r0
            java.lang.Class<com.facebook.user.profilepic.PicSquareUrlWithSize> r0 = com.facebook.user.profilepic.PicSquareUrlWithSize.class
            r305 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r308
            r1 = r305
            r2 = 0
            com.facebook.common.json.FbJsonField r0 = com.facebook.common.json.FbJsonField.jsonField(r0, r1, r2)     // Catch: java.lang.Exception -> L91 java.lang.Throwable -> L9d
            r305 = r0
            java.util.Map r0 = com.facebook.user.profilepic.PicSquareDeserializer.A00     // Catch: java.lang.Throwable -> L9d
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L9d
            goto L2d
        L85:
            r0 = r305
            return r0
        L88:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            r0 = 0
            return r0
        L91:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> L9d
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> L9d java.lang.Throwable -> L9d
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> L9d
        L9d:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9d
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.user.profilepic.PicSquareDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}