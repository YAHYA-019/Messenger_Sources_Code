package com.facebook.platform.opengraph.model;

import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.platform.opengraph.model.OpenGraphActionRobotext;
import java.util.Map;

/* loaded from: OpenGraphActionRobotext_SpanDeserializer.class */
public class OpenGraphActionRobotext_SpanDeserializer extends FbJsonDeserializer {
    public static Map A00;

    public OpenGraphActionRobotext_SpanDeserializer() {
        this.A00 = OpenGraphActionRobotext.Span.class;
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
            java.lang.Class<com.facebook.platform.opengraph.model.OpenGraphActionRobotext_SpanDeserializer> r0 = com.facebook.platform.opengraph.model.OpenGraphActionRobotext_SpanDeserializer.class
            r303 = r0
            r0 = r303
            monitor-enter(r0)
            java.util.Map r0 = com.facebook.platform.opengraph.model.OpenGraphActionRobotext_SpanDeserializer.A00     // Catch: java.lang.Throwable -> Lab
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L18
            java.util.HashMap r0 = X.AnonymousClass001.A0u()     // Catch: java.lang.Throwable -> Lab
            r304 = r0
            r0 = r304
            com.facebook.platform.opengraph.model.OpenGraphActionRobotext_SpanDeserializer.A00 = r0     // Catch: java.lang.Throwable -> Lab
            goto L29
        L18:
            r0 = r302
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.AbF.A0D(r0, r1)     // Catch: java.lang.Throwable -> Lab
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L29
        L24:
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lab
            goto L9c
        L29:
            r0 = r302
            int r0 = r0.hashCode()     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lab
            r306 = r0
            r0 = -1106363674(0xffffffffbe0e3ae6, float:-0.13889655)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 == r1) goto L66
            r0 = -1019779949(0xffffffffc3376493, float:-183.39287)
            r307 = r0
            r0 = r306
            r1 = r307
            if (r0 != r1) goto L93
            java.lang.String r0 = "offset"
            r304 = r0
            r0 = r302
            r1 = r304
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lab
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L93
            java.lang.Class<com.facebook.platform.opengraph.model.OpenGraphActionRobotext$Span> r0 = com.facebook.platform.opengraph.model.OpenGraphActionRobotext.Span.class
            r305 = r0
            java.lang.String r0 = "start"
            r304 = r0
            r0 = r305
            r1 = r304
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lab
            r305 = r0
            goto L82
        L66:
            java.lang.String r0 = "length"
            r305 = r0
            r0 = r302
            r1 = r305
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lab
            r307 = r0
            r0 = r307
            if (r0 == 0) goto L93
            java.lang.Class<com.facebook.platform.opengraph.model.OpenGraphActionRobotext$Span> r0 = com.facebook.platform.opengraph.model.OpenGraphActionRobotext.Span.class
            r304 = r0
            r0 = r304
            r1 = r305
            com.facebook.common.json.FbJsonField r0 = X.1BL.A0J(r0, r1)     // Catch: java.lang.Exception -> L9f java.lang.Throwable -> Lab
            r305 = r0
        L82:
            java.util.Map r0 = com.facebook.platform.opengraph.model.OpenGraphActionRobotext_SpanDeserializer.A00     // Catch: java.lang.Throwable -> Lab
            r304 = r0
            r0 = r304
            r1 = r302
            r2 = r305
            java.lang.Object r0 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lab
            goto L24
        L93:
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            goto L24
        L9c:
            r0 = r305
            return r0
        L9f:
            r304 = move-exception
            r0 = r304
            java.lang.RuntimeException r0 = com.google.common.base.Throwables.propagate(r0)     // Catch: java.lang.Throwable -> Lab
            X.0Q8 r0 = X.0Q8.createAndThrow()     // Catch: java.lang.Throwable -> Lab java.lang.Throwable -> Lab
            r304 = r0
            r0 = r304
            throw r0     // Catch: java.lang.Throwable -> Lab
        Lab:
            r304 = move-exception
            r0 = r303
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lab
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.platform.opengraph.model.OpenGraphActionRobotext_SpanDeserializer.A0X(java.lang.String):com.facebook.common.json.FbJsonField");
    }
}
