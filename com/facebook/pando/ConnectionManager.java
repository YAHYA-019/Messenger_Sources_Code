package com.facebook.pando;

import X.C0il;
import X.HJd;
import com.facebook.jni.HybridClassBase;

/* loaded from: ConnectionManager.class */
public final class ConnectionManager extends HybridClassBase {
    public static final HJd Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HJd, java.lang.Object] */
    static {
        C0il.A0B("pando-connection-jni");
    }

    public ConnectionManager() {
        initHybrid();
    }

    private final native void initHybrid();
}
