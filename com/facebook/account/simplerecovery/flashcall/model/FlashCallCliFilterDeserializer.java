package com.facebook.account.simplerecovery.flashcall.model;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: FlashCallCliFilterDeserializer.class */
public class FlashCallCliFilterDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public FlashCallCliFilterDeserializer() {
        this.A00 = FlashCallCliFilter.class;
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
            java.lang.Class<com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilterDeserializer> r0 = com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilterDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilterDeserializer.A00     // Catch: java.lang.Throwable -> Lad
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Lad
            r304 = r0
            r0 = r304
            com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilterDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Lad
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> Lad
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            goto L9e
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r306 = r0
            r0 = -166083721(0xfffffffff619c377, float:-7.7967375E32)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L66
            r0 = 463630805(0x1ba271d5, float:2.6874214E-22)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L95
            java.lang.String r0 = "encrypted_phone_number"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L95
            java.lang.Class<com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilter> r0 = com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilter.class
            r305 = r0
            java.lang.String r0 = "mEncryptedPhoneNumber"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r305 = r0
            goto L84
        L66:
            java.lang.String r0 = "cli_filter"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L95
            java.lang.Class<com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilter> r0 = com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilter.class
            r305 = r0
            java.lang.String r0 = "mCliFilter"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r305 = r0
        L84:
            java.util.Map r0 = com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilterDeserializer.A00     // Catch: java.lang.Throwable -> Lad
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lad
            goto L24
        L95:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        L9e:
            r0 = r305
            return r0
        La1:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> Lad
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> Lad java.lang.Throwable -> Lad
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Lad
        Lad:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.account.simplerecovery.flashcall.model.FlashCallCliFilterDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}