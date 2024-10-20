package com.facebook.cameracore.mediapipeline.services.camerashare;

import X.C2435Gdc;
import X.Qz6;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: CameraShareServiceConfigurationHybrid.class */
public final class CameraShareServiceConfigurationHybrid extends ServiceConfiguration {
    public static final Qz6 Companion = new Object();
    public final C2435Gdc configuration;

    public CameraShareServiceConfigurationHybrid(C2435Gdc c2435Gdc) {
        super(initHybrid(c2435Gdc.A00));
        this.configuration = c2435Gdc;
    }

    public static final native HybridData initHybrid(String str);
}
