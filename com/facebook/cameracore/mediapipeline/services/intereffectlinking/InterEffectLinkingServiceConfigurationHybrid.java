package com.facebook.cameracore.mediapipeline.services.intereffectlinking;

import X.GdZ;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: InterEffectLinkingServiceConfigurationHybrid.class */
public class InterEffectLinkingServiceConfigurationHybrid extends ServiceConfiguration {
    public final GdZ mConfiguration;

    public InterEffectLinkingServiceConfigurationHybrid(GdZ gdZ) {
        super(initHybrid(gdZ.A00));
        this.mConfiguration = gdZ;
    }

    public static native HybridData initHybrid(InterEffectLinkingServiceListenerWrapper interEffectLinkingServiceListenerWrapper);
}
