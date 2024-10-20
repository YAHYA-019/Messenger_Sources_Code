package com.facebook.messaging.analytics.search.universal.qpllatency;

import X.BS5;
import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: QPLSearchLatencyLoggingJni.class */
public final class QPLSearchLatencyLoggingJni {
    public static final BS5 Companion = new Object();
    public HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BS5, java.lang.Object] */
    static {
        C0il.A0B("search-qpllogger");
    }

    public static final native HybridData initHybrid();

    public final native void cacheQueryEnd(int i, String str, int i2);

    public final native void cacheQueryRender(int i, int i2);

    public final native void cacheQueryStart(int i, String str);

    public final native void endCurrentFlow(String str);

    public final native void endFlow(int i, String str);

    public final native void networkQueryEnd(int i, String str, int i2);

    public final native void networkQueryRender(int i, int i2);

    public final native void networkQueryStart(int i, String str);

    public final native int startFlow(int i, String str, int i2, String str2, String str3);
}
