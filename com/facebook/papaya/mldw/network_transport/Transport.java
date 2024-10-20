package com.facebook.papaya.mldw.network_transport;

import X.5hO;
import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.papaya.mldw.ITransport;
import com.facebook.tigon.iface.TigonServiceHolder;

/* loaded from: Transport.class */
public final class Transport extends ITransport {
    public static final 5hO Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.5hO] */
    static {
        C0il.A0B("papaya-mldw-network_transport");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Transport(com.facebook.tigon.iface.TigonServiceHolder r302, java.lang.String r303, java.lang.String r304) {
        /*
            r301 = this;
            r0 = 1
            r305 = r0
            r0 = r302
            r1 = r305
            X.11T.A0F(r0, r1)
            r0 = r302
            r1 = r303
            java.lang.String r2 = ""
            com.facebook.jni.HybridData r0 = initHybrid(r0, r1, r2)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L1e
            r0 = r301
            r1 = r306
            r0.<init>(r1)
            return
        L1e:
            java.lang.String r0 = "initHybrid shouldn't be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0N(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.papaya.mldw.network_transport.Transport.<init>(com.facebook.tigon.iface.TigonServiceHolder, java.lang.String, java.lang.String):void");
    }

    public static final native HybridData initHybrid(TigonServiceHolder tigonServiceHolder, String str, String str2);
}
