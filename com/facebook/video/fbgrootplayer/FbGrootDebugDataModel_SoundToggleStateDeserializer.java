package com.facebook.video.fbgrootplayer;

import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.video.fbgrootplayer.FbGrootDebugDataModel;
import java.util.Map;

/* loaded from: FbGrootDebugDataModel_SoundToggleStateDeserializer.class */
public class FbGrootDebugDataModel_SoundToggleStateDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public FbGrootDebugDataModel_SoundToggleStateDeserializer() {
        this.A00 = FbGrootDebugDataModel.SoundToggleState.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x002a, code lost:
    
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
            java.lang.Class<com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_SoundToggleStateDeserializer> r0 = com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_SoundToggleStateDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_SoundToggleStateDeserializer.A00     // Catch: java.lang.Throwable -> L88
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> L88
            r304 = r0
            r0 = r304
            com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_SoundToggleStateDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L88
            goto L32
        L18:
            r0 = r304
            r1 = r302
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L88
            r305 = r0
            r0 = r305
            com.facebook.common.json.FbJsonField r0 = (com.facebook.common.json.FbJsonField) r0     // Catch: java.lang.Throwable -> L88
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L32
        L2d:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            goto L70
        L32:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L88
            r306 = r0
            r0 = -1880528067(0xffffffff8fe96b3d, float:-2.301688E-29)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L73
            java.lang.String r0 = "toggle_status"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L88
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L73
            java.lang.Class<com.facebook.video.fbgrootplayer.FbGrootDebugDataModel$SoundToggleState> r0 = com.facebook.video.fbgrootplayer.FbGrootDebugDataModel.SoundToggleState.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L88
            r305 = r0
            java.util.Map r0 = com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_SoundToggleStateDeserializer.A00     // Catch: java.lang.Throwable -> L88
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L88
            goto L2d
        L70:
            r0 = r305
            return r0
        L73:
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            r0 = 0
            return r0
        L7c:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> L88
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> L88 java.lang.Throwable -> L88
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> L88
        L88:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L88
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_SoundToggleStateDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
