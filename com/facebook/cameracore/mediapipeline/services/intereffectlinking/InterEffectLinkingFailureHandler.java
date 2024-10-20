package com.facebook.cameracore.mediapipeline.services.intereffectlinking;

import com.facebook.jni.HybridData;

/* loaded from: InterEffectLinkingFailureHandler.class */
public class InterEffectLinkingFailureHandler {
    public final HybridData mHybridData;

    public InterEffectLinkingFailureHandler(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    private native HybridData initHybrid();

    public native void notifyApplyEffectFailed(String str, String str2);
}
