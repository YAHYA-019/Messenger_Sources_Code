package com.facebook.rtcactivity.common;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: RtcActivityFeatureSetNative.class */
public class RtcActivityFeatureSetNative {
    public final HybridData mHybridData;

    static {
        C0il.A0B("rtcactivity");
    }

    public RtcActivityFeatureSetNative(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native SessionWithMaster getSessionWithMaster();
}
