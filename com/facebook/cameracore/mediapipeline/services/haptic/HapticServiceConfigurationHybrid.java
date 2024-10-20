package com.facebook.cameracore.mediapipeline.services.haptic;

import X.C2437Gde;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: HapticServiceConfigurationHybrid.class */
public class HapticServiceConfigurationHybrid extends ServiceConfiguration {
    public final HapticServiceDelegateWrapper mDelegateWrapper;

    public HapticServiceConfigurationHybrid(C2437Gde c2437Gde) {
        HapticServiceDelegateWrapper hapticServiceDelegateWrapper = new HapticServiceDelegateWrapper(c2437Gde.A00);
        this.mDelegateWrapper = hapticServiceDelegateWrapper;
        this.mHybridData = initHybrid(hapticServiceDelegateWrapper);
    }

    public static native HybridData initHybrid(HapticServiceDelegateWrapper hapticServiceDelegateWrapper);
}
