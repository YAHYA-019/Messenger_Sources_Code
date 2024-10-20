package com.facebook.graphql.rtgql.sdk;

import X.11T;
import X.C0il;
import X.Qzp;
import com.facebook.jni.HybridData;

/* loaded from: SessionToken.class */
public final class SessionToken {
    public static final Qzp Companion = new Object();
    public static final String TAG = "SessionToken";
    public final HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Qzp] */
    static {
        C0il.A0B("rtgqlsdk");
    }

    public SessionToken(HybridData hybridData) {
        11T.A0F(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public final native void cancel();

    public final HybridData getMHybridData() {
        return this.mHybridData;
    }
}
