package com.facebook.account.recovery.common.protocol;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: AccountRecoverySearchAccountMethod_ResultDeserializer.class */
public class AccountRecoverySearchAccountMethod_ResultDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public AccountRecoverySearchAccountMethod_ResultDeserializer() {
        this.A00 = AccountRecoverySearchAccountMethod$Result.class;
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
            java.lang.Class<com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod_ResultDeserializer> r0 = com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod_ResultDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod_ResultDeserializer.A00     // Catch: java.lang.Throwable -> Lb8
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Lb8
            r304 = r0
            r0 = r304
            com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod_ResultDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Lb8
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> Lb8
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb8
            goto La9
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lb8
            r306 = r0
            r0 = -1857640538(0xffffffff9146a7a6, float:-1.5671107E-28)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L71
            r0 = 3076010(0x2eefaa, float:4.310408E-39)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto La0
            java.lang.String r0 = "data"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lb8
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La0
            java.lang.Class<com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod$Result> r0 = com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod$Result.class
            r305 = r0
            java.lang.String r0 = "mAccountCandidates"
            r304 = r0
            r0 = r305
            r1 = r304
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lb8
            r305 = r0
            java.lang.Class<com.facebook.account.recovery.common.model.AccountCandidateModel> r0 = com.facebook.account.recovery.common.model.AccountCandidateModel.class
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbM.A0H(r0, r1)     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lb8
            r305 = r0
            goto L8f
        L71:
            java.lang.String r0 = "summary"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lb8
            r307 = r0
            r0 = r307
            if (r0 == 0) goto La0
            java.lang.Class<com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod$Result> r0 = com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod$Result.class
            r305 = r0
            java.lang.String r0 = "mSummary"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> Lac java.lang.Throwable -> Lb8
            r305 = r0
        L8f:
            java.util.Map r0 = com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod_ResultDeserializer.A00     // Catch: java.lang.Throwable -> Lb8
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lb8
            goto L24
        La0:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        La9:
            r0 = r305
            return r0
        Lac:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> Lb8
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> Lb8 java.lang.Throwable -> Lb8
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb8
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod_ResultDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
