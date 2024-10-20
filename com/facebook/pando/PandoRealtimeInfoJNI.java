package com.facebook.pando;

import X.11T;
import X.4UN;
import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: PandoRealtimeInfoJNI.class */
public final class PandoRealtimeInfoJNI {
    public static final 4UN Companion = new Object();
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4UN] */
    static {
        C0il.A0B("pando-graphql-jni");
    }

    public PandoRealtimeInfoJNI(String str) {
        this.mHybridData = initSubscriptionHybridData(str);
    }

    public PandoRealtimeInfoJNI(String str, String str2, String str3) {
        this.mHybridData = initLiveQueryHybridData(str, str2, str3);
    }

    public static final PandoRealtimeInfoJNI forLiveQuery(String str) {
        return Companion.forLiveQuery(str);
    }

    public static final PandoRealtimeInfoJNI forLiveQuery(String str, String str2, String str3) {
        return Companion.forLiveQuery(str, str2, str3);
    }

    public static final PandoRealtimeInfoJNI forSubscription(String str) {
        11T.A0F(str, 0);
        return new PandoRealtimeInfoJNI(str);
    }

    private final native HybridData initLiveQueryHybridData(String str, String str2, String str3);

    private final native HybridData initSubscriptionHybridData(String str);
}
