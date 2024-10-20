package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import com.facebook.jni.HybridData;

/* loaded from: ServiceConfiguration.class */
public abstract class ServiceConfiguration {
    public HybridData mHybridData;

    public ServiceConfiguration() {
    }

    public ServiceConfiguration(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void destroy() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
            this.mHybridData = null;
        }
    }
}
