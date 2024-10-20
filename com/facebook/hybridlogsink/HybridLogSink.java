package com.facebook.hybridlogsink;

import X.C0il;
import X.F1j;
import com.facebook.jni.HybridData;

/* loaded from: HybridLogSink.class */
public final class HybridLogSink {
    public static final F1j Companion = new Object();
    public final HybridData mHybridData = initHybrid(1000);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.F1j, java.lang.Object] */
    static {
        C0il.A0B("hybridlogsinkjni");
    }

    public static final native HybridData initHybrid(int i);

    public final native String[] getLogMessages();
}
