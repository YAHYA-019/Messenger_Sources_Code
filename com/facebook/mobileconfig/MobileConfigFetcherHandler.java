package com.facebook.mobileconfig;

import X.C0gh;
import com.facebook.jni.HybridData;

/* loaded from: MobileConfigFetcherHandler.class */
public class MobileConfigFetcherHandler {
    public final HybridData mHybridData;

    static {
        C0gh.A02("mobileconfig-jni");
    }

    public MobileConfigFetcherHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native void onCompletion(boolean z, String str);
}
