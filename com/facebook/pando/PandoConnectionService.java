package com.facebook.pando;

import X.C0il;
import X.HJe;
import com.facebook.jni.HybridData;

/* loaded from: PandoConnectionService.class */
public final class PandoConnectionService extends PandoPrimaryExecution {
    public static final HJe Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HJe, java.lang.Object] */
    static {
        C0il.A0B("pando-connection-jni");
    }

    public static final native HybridData initHybridData(PandoPrimaryExecution pandoPrimaryExecution, ConnectionManager connectionManager, boolean z, boolean z2);
}
