package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.I2f;
import com.facebook.jni.HybridData;

/* loaded from: ServiceModule.class */
public abstract class ServiceModule {
    public HybridData mHybridData;

    public abstract ServiceConfiguration createConfiguration(I2f i2f);
}
