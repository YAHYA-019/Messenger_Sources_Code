package com.facebook.tigon.appnetsessionid;

import X.2Cd;
import X.2Cj;
import X.C0il;
import com.facebook.jni.HybridData;
import com.facebook.tigon.analyticslog.AppNetSessionIdLogger;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: SessionIdGenerator.class */
public final class SessionIdGenerator {
    public static final 2Cd Companion = new Object();
    public volatile 2Cj latestSessionId;
    public final HybridData mHybridData = initHybrid();
    public final ArrayList sessionIdListeners = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Cd, java.lang.Object] */
    static {
        C0il.A0B("appnetsessionid");
    }

    public SessionIdGenerator() {
        initializeSessionIdGenerator();
    }

    private final native HybridData initHybrid();

    private final native void initializeSessionIdGenerator();

    private final void publishNewSessionId(String str, String str2, String str3, long j, long j2, long j3) {
        2Cj r0 = new 2Cj(str, str2, str3);
        this.latestSessionId = r0;
        Iterator it = this.sessionIdListeners.iterator();
        while (it.hasNext()) {
            ((AppNetSessionIdLogger) it.next()).A00(r0);
        }
    }

    public final native void clearLocationId();

    public final native void onBackground();

    public final native void onForeground();

    public final native void onNetworkChange();

    public final native void onSessionChange();

    public final native String updateAndGetLocationId();
}
