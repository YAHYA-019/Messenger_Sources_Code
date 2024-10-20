package com.facebook.realtime.common.streamid;

import X.C0il;
import X.Hvm;
import com.facebook.jni.HybridData;

/* loaded from: RSStreamIdProvider.class */
public final class RSStreamIdProvider {
    public static final Hvm Companion = new Object();
    public final HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Hvm, java.lang.Object] */
    static {
        C0il.A0B("streamid_jni");
    }

    public static final native HybridData initHybrid();
}
