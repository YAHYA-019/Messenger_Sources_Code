package com.facebook.cameracore.mediapipeline.services.music;

import X.GdW;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: MusicServiceConfigurationHybrid.class */
public abstract class MusicServiceConfigurationHybrid extends ServiceConfiguration {
    public final GdW mConfiguration;

    public static native HybridData initHybrid(MusicServiceDataSource musicServiceDataSource);
}
