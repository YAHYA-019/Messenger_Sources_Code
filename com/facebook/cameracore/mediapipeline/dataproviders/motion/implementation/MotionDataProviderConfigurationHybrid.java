package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.C2433Gda;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: MotionDataProviderConfigurationHybrid.class */
public class MotionDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C2433Gda mConfiguration;
    public final MotionDataSourceWrapper mMotionDataSourceWrapper;

    public MotionDataProviderConfigurationHybrid(C2433Gda c2433Gda) {
        this.mConfiguration = c2433Gda;
        MotionDataSourceWrapper motionDataSourceWrapper = new MotionDataSourceWrapper(c2433Gda.A00);
        this.mMotionDataSourceWrapper = motionDataSourceWrapper;
        this.mHybridData = initHybrid(motionDataSourceWrapper);
    }

    public static native HybridData initHybrid(MotionDataSourceWrapper motionDataSourceWrapper);

    public MotionDataSourceWrapper getDataSource() {
        return this.mMotionDataSourceWrapper;
    }
}
