package com.facebook.distribgw.client.chatd;

import X.3GD;
import X.C0il;
import com.facebook.distribgw.client.DGWClient;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: DGWPluginSessionImpl.class */
public final class DGWPluginSessionImpl {
    public static final 3GD Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.3GD, java.lang.Object] */
    static {
        C0il.A0B("chatddgw-jni");
    }

    public static final native void registerSessionNative(DGWClient dGWClient, ScheduledExecutorService scheduledExecutorService, boolean z, long j, boolean z2, boolean z3);
}
