package com.facebook.messaging.notify.analytics.qpl.sync;

import X.BUq;
import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: OpenMessagingSyncPathHybrid.class */
public final class OpenMessagingSyncPathHybrid {
    public static final BUq Companion = new Object();
    public HybridData mHybridData = initHybrid();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.BUq, java.lang.Object] */
    static {
        C0il.A0B("msgr_om_sync");
    }

    public static final native HybridData initHybrid();

    public final native void markMessageDropped(String str, int i, String str2);

    public final native void markRender(String str, int i, boolean z, int i2);

    public final native void markSynced(String str, int i, String str2);

    public final native void setEnabled(boolean z);
}
