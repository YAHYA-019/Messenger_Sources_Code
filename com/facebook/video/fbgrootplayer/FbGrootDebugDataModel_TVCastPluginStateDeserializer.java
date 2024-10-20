package com.facebook.video.fbgrootplayer;

import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.video.fbgrootplayer.FbGrootDebugDataModel;
import java.util.Map;

/* loaded from: FbGrootDebugDataModel_TVCastPluginStateDeserializer.class */
public class FbGrootDebugDataModel_TVCastPluginStateDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public FbGrootDebugDataModel_TVCastPluginStateDeserializer() {
        this.A00 = FbGrootDebugDataModel.TVCastPluginState.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0021, code lost:
    
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
            java.lang.Class<com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_TVCastPluginStateDeserializer> r0 = com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_TVCastPluginStateDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_TVCastPluginStateDeserializer.A00     // Catch: java.lang.Throwable -> L7f
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> L7f
            r304 = r0
            r0 = r304
            com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_TVCastPluginStateDeserializer.A00 = r0     // Catch: java.lang.Throwable -> L7f
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> L7f
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            goto L70
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L7f
            r306 = r0
            r0 = -1003050130(0xffffffffc436ab6e, float:-730.6786)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L67
            java.lang.String r0 = "casting_status"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L7f
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L67
            java.lang.Class<com.facebook.video.fbgrootplayer.FbGrootDebugDataModel$TVCastPluginState> r0 = com.facebook.video.fbgrootplayer.FbGrootDebugDataModel.TVCastPluginState.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> L73 java.lang.Throwable -> L7f
            r305 = r0
            java.util.Map r0 = com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_TVCastPluginStateDeserializer.A00     // Catch: java.lang.Throwable -> L7f
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L7f
            goto L24
        L67:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        L70:
            r0 = r305
            return r0
        L73:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> L7f
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> L7f java.lang.Throwable -> L7f
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> L7f
        L7f:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7f
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.fbgrootplayer.FbGrootDebugDataModel_TVCastPluginStateDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
