package com.facebook.quickpromotion.push;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

/* loaded from: QuickPromotionRefreshMqttPushHandler_OptionsDeserializer.class */
public class QuickPromotionRefreshMqttPushHandler_OptionsDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public QuickPromotionRefreshMqttPushHandler_OptionsDeserializer() {
        this.A00 = QuickPromotionRefreshMqttPushHandler$Options.class;
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
            java.lang.Class<com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler_OptionsDeserializer> r0 = com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler_OptionsDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler_OptionsDeserializer.A00     // Catch: java.lang.Throwable -> Lad
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Lad
            r304 = r0
            r0 = r304
            com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler_OptionsDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Lad
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
            r0 = -511670612(0xffffffffe18086ac, float:-2.9636092E20)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L66
            r0 = 1571895131(0x5db1375b, float:1.5962219E18)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L95
            java.lang.String r0 = "promotion_to_force_on"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L95
            java.lang.Class<com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler$Options> r0 = com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler$Options.class
            r305 = r0
            java.lang.String r0 = "promotionToForceOn"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r305 = r0
            goto L84
        L66:
            java.lang.String r0 = "should_reset_forced_states"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L95
            java.lang.Class<com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler$Options> r0 = com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler$Options.class
            r305 = r0
            java.lang.String r0 = "shouldResetForcedStates"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> La1 java.lang.Throwable -> Lad
            r305 = r0
        L84:
            java.util.Map r0 = com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler_OptionsDeserializer.A00     // Catch: java.lang.Throwable -> Lad
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.quickpromotion.push.QuickPromotionRefreshMqttPushHandler_OptionsDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}